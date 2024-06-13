package com.konyaco.fluent.gallery.processor

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.symbol.*
import com.google.devtools.ksp.symbol.impl.kotlin.KSPropertyDeclarationImpl
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.jetbrains.kotlin.util.prefixIfNot
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets

class ComponentProcessor(private val logger: KSPLogger, private val codeGenerator: CodeGenerator) : IProcessor {

    private val componentAnnotation = "Component"
    private val componentGroupAnnotation = "ComponentGroup"

    private val iconImportPrefix = "com.konyaco.fluent.icons.regular"
    private val iconPrefix = "com.konyaco.fluent.icons.Icons.Regular"

    private val componentFunctions = mutableMapOf<String, MutableList<Pair<KSAnnotation, KSFunctionDeclaration>>>()
    private val componentGroups = mutableMapOf<String, Pair<KSAnnotation, KSPropertyDeclarationImpl>>()
    private val componentPackageMap = mutableMapOf<String, String>()

    private val componentPackage = "com.konyaco.fluent.gallery.component"
    private val componentItemClass = ClassName(componentPackage, "ComponentItem")

    private val componentNameList = mutableListOf<String>()

    private val propertyNameRegex = Regex("^[a-zA-Z_]*\\w")

    private val componentPagePathType = TypeSpec.objectBuilder("ComponentPagePath")

    override fun finish() {
        super.finish()
        arrangeComponentGroup()
        generateComponents()
    }

    private fun arrangeComponentGroup() {
        val mapPackage = componentFunctions.remove("/_Auto") ?: emptyList()
        mapPackage.forEach { pair ->
            val group = componentPackageMap[pair.second.packageName.asString()]
            if (!group.isNullOrEmpty()) {
                val list =
                    componentFunctions[group] ?: mutableListOf<Pair<KSAnnotation, KSFunctionDeclaration>>().apply {
                        componentFunctions[group] = this
                    }
                list.add(pair)
            } else {
                val list = componentFunctions["/"] ?: mutableListOf<Pair<KSAnnotation, KSFunctionDeclaration>>().apply {
                    componentFunctions["/"] = this
                }
                list.add(pair)
            }
        }
    }

    override fun onFunctionVisit(function: KSFunctionDeclaration) {
        super.onFunctionVisit(function)
        function.annotations.forEach { annotation ->
            if (annotation.isTargetAnnotation(componentAnnotation)) {
                var groupArg: KSValueArgument? = null
                annotation.arguments.forEach { arg ->
                    when (arg.name?.asString()) {
                        "group" -> groupArg = arg
                    }
                }
                val group = (groupArg?.value as? String)?.prefixIfNot("/") ?: return@forEach
                val list =
                    componentFunctions[group] ?: mutableListOf<Pair<KSAnnotation, KSFunctionDeclaration>>().apply {
                        componentFunctions[group] = this
                    }
                list.add(annotation to function)
                return
            }
        }
    }

    override fun onPropertyVisit(property: KSPropertyDeclaration) {
        super.onPropertyVisit(property)
        val annotation = property.annotations.firstOrNull {
            it.isTargetAnnotation(componentGroupAnnotation)
        } ?: return
        if (property is KSPropertyDeclarationImpl) {
            val groupName =
                property.ktProperty.initializer?.text?.removePrefix("\"")?.removeSuffix("\"")?.prefixIfNot("/")
                    ?: return
            componentGroups[groupName] = annotation to property
            val packageNameValue =
                annotation.arguments.firstOrNull { it.name?.asString() == "packageMap" }?.value as? String
            val packageName = packageNameValue?.ifBlank { null } ?: return
            componentPackageMap[packageName] = groupName
        }
    }

    private fun generateComponents() {

        val fileSpecBuilder = FileSpec.builder(componentPackage, "Components")
        val listComponentsType = List::class.asTypeName().parameterizedBy(componentItemClass)
        val rootComponent =
            PropertySpec.builder("components", listComponentsType)
                .addModifiers(KModifier.INTERNAL)
        val keySets = mutableSetOf<String>()
        componentFunctions.keys.forEach {
            var route = ""
            it.split('/').forEach { node ->
                if (node.isNotEmpty()) {
                    route += "/$node"
                    keySets.add(route)
                }
            }
        }
        val levelKey = keySets.groupBy { it.substringBeforeLast('/') }
        levelKey.entries.sortedByDescending { (group, _) ->
            group.count { it == '/' }
        }.forEach { (group, items) ->
            val actualItems = items.filter { (it.isNotBlank() && it != "/") }
            val key = group.ifEmpty { "/" }
            if (group == "") {

                fileSpecBuilder.addProperty(
                    rootComponent
                        .lazy {
                            val itemNames = createItemsString(
                                group = "",
                                fileSpec = fileSpecBuilder,
                                functions = componentFunctions[key],
                                childNodes = actualItems.map {
                                    componentGroups[it]?.first to generateComponentsFullName(it)
                                }
                            )
                            if (itemNames == null) {
                                addStatement("emptyList()")
                            } else {
                                createList("", itemNames) { (_, name) -> name }
                            }
                        }.build()
                )

            }
            actualItems.forEach { item ->
                val itemName = if (item != "/") {
                    item.substringAfterLast('/')
                } else {
                    ""
                }
                val propertyName = generateComponentsFullName(item)
                val componentGroupConfig = generateComponentGroupConfig(item)
                val functionItems = componentFunctions[item]
                val childNodeItems = levelKey[item]
                fileSpecBuilder.addProperty(
                    PropertySpec.builder(propertyName, componentItemClass)
                        .addModifiers(KModifier.INTERNAL)
                        .initializer(
                            componentItemInitializerString(
                                name = itemName,
                                group = item.substringBeforeLast('/'),
                                description = "",
                                icon = componentGroupConfig.icon?.run {
                                    fileSpecBuilder.addImport(iconImportPrefix, this)
                                    "$iconPrefix.$this"
                                },
                                iconGlyph = componentGroupConfig.iconGlyph,
                                content = componentGroupConfig.contentData,
                                items = createItemsString(
                                    itemName,
                                    fileSpecBuilder,
                                    functionItems,
                                    childNodeItems?.map {
                                        componentGroups[it]?.first to generateComponentsFullName(it)
                                    }),
                                getItem = { (_, name) -> name }
                            )
                        )
                        .build()
                )
            }

        }
        fileSpecBuilder.addProperty(
            PropertySpec.builder(
                name = "flatMapComponents",
                type = listComponentsType
            ).addModifiers(KModifier.INTERNAL)
                .lazy { createList("", componentNameList) { it } }
                .build()
        )
        val file = codeGenerator.createNewFile(
            Dependencies(true),
            fileSpecBuilder.packageName,
            fileSpecBuilder.name
        )
        val pathFileSpec = FileSpec.builder(
            componentPackage, "ComponentPagePath"
        ).addType(componentPagePathType.build()).build()
        val pathFile = codeGenerator.createNewFile(
            Dependencies(true),
            componentPackage,
            pathFileSpec.name
        )
        OutputStreamWriter(file, StandardCharsets.UTF_8).use(fileSpecBuilder.build()::writeTo)
        OutputStreamWriter(pathFile, StandardCharsets.UTF_8).use(pathFileSpec::writeTo)
    }

    private fun createItemsString(
        group: String,
        fileSpec: FileSpec.Builder,
        functions: List<Pair<KSAnnotation, KSFunctionDeclaration>>?,
        childNodes: List<Pair<KSAnnotation?, String>>?
    ): List<Pair<KSAnnotation?, String>>? {
        val functionItems = functions ?: emptyList()
        val childNodeItems = childNodes ?: emptyList()
        return if (functions.isNullOrEmpty() && childNodes.isNullOrEmpty()) {
            null
        } else {
            (functionItems.map { (annotation, function) ->
                annotation to generateComponentItemProperty(group, fileSpec, function, annotation)
            } + childNodeItems).sortedBy { (annotation, _) ->
                (annotation?.arguments?.first { arg -> arg.name?.asString() == "index" }?.value as? Int)
                    ?: Int.MAX_VALUE
            }
        }
    }

    private fun <T> CodeBlock.Builder.createList(
        prefix: String,
        items: List<T>,
        item: (T) -> String
    ): CodeBlock.Builder = addStatement("${prefix}listOf(")
        .withTwoIndent {
            items.forEachIndexed { index, t ->
                val string = item(t)
                if (index != items.lastIndex) {
                    addStatement("$string,")
                } else {
                    addStatement(string)
                }
            }
        }
        .addStatement(")")

    private fun generateComponentsFullName(group: String): String {
        return (group.replace(
            "/",
            "_"
        ) + "Components").asPropertyName()
    }

    private fun generateComponentItemProperty(
        group: String,
        fileSpec: FileSpec.Builder,
        functionDeclaration: KSFunctionDeclaration,
        annotation: KSAnnotation
    ): String {
        val simpleNameString = functionDeclaration.simpleName.asString()
        val packageNameString = functionDeclaration.packageName.asString()
        val functionName = group + "_" + simpleNameString + "Component"
        var nameArg: KSValueArgument? = null
        var descriptionArg: KSValueArgument? = null
        var icon: String? = null
        var iconGlyph: Char? = null
        annotation.arguments.forEach {
            when (it.name?.asString()) {
                "name" -> nameArg = it
                "description" -> descriptionArg = it
                "icon" -> icon = (it.value as? String)?.ifBlank { null }
                "iconGlyph" -> iconGlyph = (it.value as? Char)?.takeIf { char -> char != 'A' }
            }
        }
        val description = descriptionArg?.value as? String ?: ""
        fileSpec.addImport(
            ClassName(
                packageNameString.substringBeforeLast("."),
                packageNameString.substringAfterLast(".")
            ), simpleNameString
        )
        val propertyName = functionName.asPropertyName()
        val componentName = (nameArg?.value as? String)?.ifBlank { null }
                ?: functionDeclaration.simpleName.asString().removeSuffix("Screen")
        val sourceFile = functionDeclaration.containingFile
        if (sourceFile != null) {
            val relativePath = sourceFile.filePath.substringAfterLast("gallery/src/")
            componentPagePathType
                .addModifiers(KModifier.INTERNAL)
                .addProperty(
                    PropertySpec.builder(
                        "${componentName}Screen".replace(" ", "_"),
                        String::class
                    )
                        .addModifiers(KModifier.CONST)
                        .initializer("\"$relativePath\"")
                        .build()
                )
        }
        componentNameList.add(propertyName)
        var arg = ""
        functionDeclaration.parameters.forEach {
            val type = it.type.resolve().declaration
            if (type.simpleName.asString() == "ComponentNavigator" && type.packageName.asString() == componentPackage) {
                arg = "${it.name?.asString()} = it"
            }
        }
        fileSpec.addProperty(
            PropertySpec.builder(propertyName, componentItemClass)
                .addModifiers(KModifier.INTERNAL)
                .initializer(
                    componentItemInitializerString<String>(
                        name = componentName,
                        group = group,
                        description = description,
                        content = "{ ${simpleNameString}($arg) }",
                        icon = icon?.run {
                            fileSpec.addImport(iconImportPrefix, this)
                            "$iconPrefix.$this"
                        },
                        iconGlyph = iconGlyph,
                        items = null,
                        getItem = { it }
                    )
                )
                .build()
        )
        return propertyName
    }

    private fun <T> componentItemInitializerString(
        name: String,
        group: String,
        description: String,
        content: String?,
        icon: String?,
        iconGlyph: Char?,
        items: List<T>?,
        getItem: (T) -> String,
    ) = CodeBlock.builder()
        .addStatement("ComponentItem(")
        .withTwoIndent {
            addStatement("name = %S,", name)
            addStatement("group = %S,", if (group.isNotBlank()) group.prefixIfNot("/") else "")
            addStatement("description = %S,", description)
            addStatement("content = $content,")
            addStatement("icon = $icon,")
            addStatement("iconGlyph = ${iconGlyph?.let { "'$it'" }},")
            if (items != null) {
                createList("items = ", items, getItem)
            } else {
                addStatement("items = null")
            }
        }
        .addStatement(")")
        .build()

    private fun generateComponentGroupConfig(group: String): ComponentGroupConfig {
        var icon: String? = null
        var iconGlyph: Char? = null
        var contentData: String? = null
        componentGroups[group]?.let { (annotation) ->
            annotation.arguments.forEach {
                when (it.name?.asString()) {
                    "icon" -> icon = (it.value as? String)?.ifBlank { null }
                    "iconGlyph" -> iconGlyph = (it.value as? Char).takeIf { char -> char != 'A' }
                    "generateScreen" -> if (it.value as? Boolean == true) {
                        contentData = """
                            { ComponentIndexScreen(it) }
                        """.trimIndent()
                    }
                }
            }
        }
        return ComponentGroupConfig(icon, iconGlyph, contentData)
    }

    private fun PropertySpec.Builder.lazy(buildAction: CodeBlock.Builder.() -> Unit) = delegate(
        CodeBlock.builder()
            .addStatement("lazy {")
            .withTwoIndent { buildAction() }
            .addStatement("}")
            .build()
    )

    private fun CodeBlock.Builder.withTwoIndent(buildAction: CodeBlock.Builder.() -> Unit): CodeBlock.Builder {
        return withIndent {
            withIndent(buildAction)
        }
    }

    private fun String.asPropertyName(): String {
        return if (propertyNameRegex.matches(this)) {
            this
        } else {
            buildString(length) {
                this@asPropertyName.forEach {
                    append(when(it) {
                        ' ', '&', '/' -> '_'
                        else -> it
                    })
                }
            }
        }
    }

    data class ComponentGroupConfig(
        val icon: String?,
        val iconGlyph: Char?,
        val contentData: String?
    )
}
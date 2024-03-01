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
                    rootComponent.delegate(
                        """
                            lazy { 
                                ${
                            createItemsString(
                                group = "",
                                fileSpec = fileSpecBuilder,
                                functions = componentFunctions[key],
                                childNodes = actualItems.map {
                                    componentGroups[it]?.first to generateComponentsFullName(it)
                                }
                            )
                        }
                            }
                        """.trimIndent()
                    ).build()
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
                                content = componentGroupConfig.contentData,
                                items = createItemsString(itemName, fileSpecBuilder, functionItems, childNodeItems?.map {
                                    componentGroups[it]?.first to generateComponentsFullName(it)
                                })
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
                .delegate(
                    """
                        lazy {
                            ${componentNameList.joinToString(",\n", "listOf(\n", ")")}
                        }
                    """.trimIndent()
                )
                .build()
        )
        val file = codeGenerator.createNewFile(
            Dependencies(true),
            fileSpecBuilder.packageName,
            fileSpecBuilder.name
        )
        OutputStreamWriter(file, StandardCharsets.UTF_8).use(fileSpecBuilder.build()::writeTo)
    }

    private fun createItemsString(
        group: String,
        fileSpec: FileSpec.Builder,
        functions: List<Pair<KSAnnotation, KSFunctionDeclaration>>?,
        childNodes: List<Pair<KSAnnotation?, String>>?
    ): String? {
        val functionItems = functions ?: emptyList()
        val childNodeItems = childNodes ?: emptyList()
        return if (functions.isNullOrEmpty() && childNodes.isNullOrEmpty()) {
            null
        } else {
            (functionItems.map { (annotation, function) ->
                annotation to generateComponentItemProperty(group, fileSpec, function, annotation)
                    .removePrefix("`")
                    .removeSuffix("`")
            } + childNodeItems).sortedBy { (annotation, _) ->
                (annotation?.arguments?.first { arg -> arg.name?.asString() == "index" }?.value as? Int) ?: Int.MAX_VALUE
            }.joinToString(
                ",\n",
                "listOf(\n",
                ")\n"
            ) { "`${it.second}`" }
        }
    }

    private fun generateComponentsFullName(group: String): String {
        return group.replace(
            "/",
            "_"
        ) + "Components"
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
        annotation.arguments.forEach {
            when (it.name?.asString()) {
                "name" -> nameArg = it
                "description" -> descriptionArg = it
                "icon" -> icon = (it.value as? String)?.ifBlank { null }
            }
        }
        val description = descriptionArg?.value as? String ?: ""
        fileSpec.addImport(
            ClassName(
                packageNameString.substringBeforeLast("."),
                packageNameString.substringAfterLast(".")
            ), simpleNameString
        )
        val componentName =
            (nameArg?.value as? String)?.ifBlank { null } ?: functionDeclaration.simpleName.asString()
                .removeSuffix("Screen")
        componentNameList.add("`$functionName`")
        var arg = ""
        functionDeclaration.parameters.forEach {
            val type = it.type.resolve().declaration
            if (type.simpleName.asString() == "ComponentNavigator" && type.packageName.asString() == componentPackage) {
                arg = "${it.name?.asString()} = it"
            }
        }
        fileSpec.addProperty(
            PropertySpec.builder("`$functionName`", componentItemClass)
                .addModifiers(KModifier.INTERNAL)
                .initializer(
                    componentItemInitializerString(
                        name = componentName,
                        group = group,
                        description = description,
                        content = "{ ${simpleNameString}($arg) }",
                        icon = icon?.run {
                            fileSpec.addImport(iconImportPrefix, this)
                            "$iconPrefix.$this"
                        },
                        items = null
                    )
                )
                .build()
        )
        return "`$functionName`"
    }

    private fun componentItemInitializerString(
        name: String,
        group: String,
        description: String,
        content: String?,
        icon: String?,
        items: String?
    ) = """
        ComponentItem(
            name = "$name",
            group = "${if (group.isNotBlank()) group.prefixIfNot("/") else "" }",
            description = "$description",
            content = $content,
            icon = $icon,
            items = $items
        )
    """.trimIndent()

    private fun generateComponentGroupConfig(group: String): ComponentGroupConfig {
        var icon: String? = null
        var contentData: String? = null
        componentGroups[group]?.let { (annotation) ->
            annotation.arguments.forEach {
                when (it.name?.asString()) {
                    "icon" -> icon = (it.value as? String)?.ifBlank { null }
                    "generateScreen" -> contentData = """
                        { ComponentIndexScreen(it) }
                    """.trimIndent()
                }
            }
        }
        return ComponentGroupConfig(icon, contentData)
    }

    data class ComponentGroupConfig(
        val icon: String?,
        val contentData: String?
    )
}
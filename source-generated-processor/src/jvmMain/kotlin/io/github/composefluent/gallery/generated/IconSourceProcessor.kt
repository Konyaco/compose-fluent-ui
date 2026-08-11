package io.github.composefluent.gallery.generated

import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.Modifier
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.asTypeName
import com.squareup.kotlinpoet.withIndent
import java.io.File
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets

class IconSourceProcessor(environment: SymbolProcessorEnvironment) : IProcessor {

    private val componentName = environment.options["fluent.projects.current.name"] ?: ""

    private val iconSourceEnabled =
        environment.options["source.generated.icon.enabled"]?.toBooleanStrictOrNull() ?: false

    private val packageName = "io.github.composefluent.source.generated"
    private val packagePath = packageName.replace(".", "/")

    private val logger = environment.logger
    private val codeGenerator = environment.codeGenerator

    private val icons = mutableListOf<IconNode>()
    private var rootPath = ""

    private val sourceFiles = mutableListOf<KSFile>()

    override fun process(resolver: Resolver): List<KSAnnotated> {
        if (iconSourceEnabled.not() || componentName.isEmpty()) return emptyList()
        resolver.getAllFiles().forEach { file ->
            var hasDeclaration = false
            file.declarations.forEach declaration@{ declaration ->
                if (!declaration.modifiers.contains(Modifier.PUBLIC)) return@declaration
                val declarationPackageName = declaration.packageName.asString()

                if (declarationPackageName.startsWith("io.github.composefluent.icons") && declaration is KSPropertyDeclaration) {
                    val typeDeclaration = declaration.type.resolve().declaration
                    if (typeDeclaration.qualifiedName?.asString() == "androidx.compose.ui.graphics.vector.ImageVector") {
                        val receiverType = declaration.extensionReceiver ?: return@declaration
                        val receiverName = when(receiverType.toString()) {
                            "Regular" -> "io.github.composefluent.icons.Icons.Regular"
                            "Filled" -> "io.github.composefluent.icons.Icons.Filled"
                            else -> ""
                        }
                        if (receiverName.startsWith("io.github.composefluent.icons.Icons")) {
                            if (rootPath.isEmpty()) {
                                val projectFile = File(file.filePath.substringBefore("/src/"))
                                rootPath = projectFile.parentFile.path
                            }
                            if (!hasDeclaration) {
                                hasDeclaration = true
                                sourceFiles.add(file)
                            }
                            icons.add(
                                IconNode(
                                    declarationPackageName,
                                    declaration.simpleName.asString(),
                                    receiverName
                                )
                            )
                        }
                    }
                }
            }
        }
        return emptyList()
    }

    override fun finish() {
        super.finish()

        icons.groupBy { it.receiver }
            .forEach { (receiver, items) ->
                val iconFile = FileSpec.builder(packageName, "${componentName}${receiver.substringAfterLast('.')}Items")
                val propertyName = componentName.replaceFirstChar { it.lowercase() } + "Items"
                val vectorClass = ClassName("androidx.compose.ui.graphics.vector", "ImageVector")
                val type = List::class.asTypeName().parameterizedBy(
                    Pair::class.asTypeName().parameterizedBy(
                        String::class.asTypeName(), vectorClass
                    )
                )
                iconFile.addImport(vectorClass.packageName, vectorClass.simpleName)
                iconFile.addImport("io.github.composefluent.icons", "Icons")

                val receiverPackage = receiver.substringBeforeLast(".Icons.")
                val receiverName = receiver.substringAfter(receiverPackage).removePrefix(".")
                val func = FunSpec.builder(propertyName)
                    .receiver(ClassName(receiverPackage, receiverName))
                    .returns(type)
                    .addStatement(
                        CodeBlock.builder()
                            .addStatement("return listOf(")
                            .withIndent {
                                withIndent {
                                    items.forEachIndexed { index, iconNode ->
                                        if (index != items.lastIndex) {
                                            addStatement("\"${iconNode.name}\" to ${iconNode.name},")
                                        } else {
                                            addStatement("\"${iconNode.name}\" to ${iconNode.name}")
                                        }
                                        iconFile.addImport(iconNode.packageName, iconNode.name)
                                    }
                                }
                            }
                            .addStatement(")")
                            .build()
                            .toString()
                    )

                iconFile.addFunction(func.build())
                if (rootPath.isNotBlank()) {
                    val targetDir = File(rootPath, "source-generated/src/commonMain/kotlin/$packagePath")
                    if (!targetDir.exists()) targetDir.mkdirs()
                    val targetFile = File(targetDir, "${iconFile.name}.kt")
                    if (!targetFile.exists()) targetFile.createNewFile()
                    codeGenerator.createNewFileByPath(
                        dependencies = Dependencies(aggregating = true, sources = sourceFiles.toTypedArray()),
                        path = File(packagePath, iconFile.name).path,
                        extensionName = "source"
                    )
                    OutputStreamWriter(
                        targetFile.outputStream(),
                        StandardCharsets.UTF_8
                    ).use(iconFile.build()::writeTo)
                }
            }
    }

    data class IconNode(val packageName: String, val name: String, val receiver: String)
}
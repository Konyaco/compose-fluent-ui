package io.github.composefluent.gallery.generated

import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSFile
import com.google.devtools.ksp.symbol.Modifier
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import java.io.File
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets
import java.util.Locale

class SourceFilePathProcessor(environment: SymbolProcessorEnvironment): IProcessor {

    private val packageName = "io.github.composefluent.source.generated"
    private val packagePath = packageName.replace(".", "/")

    private val componentName = environment.options["fluent.projects.current.name"] ?: ""
    private val enabled = environment.options["source.generated.module.enabled"]?.toBooleanStrictOrNull() != false

    private val objectName = "${componentName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}SourceFile"
    private val sourceFileSpecBuilder = TypeSpec.objectBuilder(objectName)
    private var rootPath = environment.options["fluent.projects.root.path"] ?: ""

    private val sourceGeneratedModule = "source-generated"

    private val logger = environment.logger

    private val codeGenerator = environment.codeGenerator
    private val sourceFiles = mutableListOf<KSFile>()

    override fun process(resolver: Resolver): List<KSAnnotated> {
        if (!enabled) return emptyList()
        if (componentName.isEmpty()) {
            logger.error("please set module name by ksp arg `fluent.projects.current.name`")
        }
        if (rootPath.isEmpty()) {
            logger.error("please set root path by ksp arg `fluent.projects.root.path`")
        }
        resolver.getAllFiles().forEach {
            val hasPublicDeclaration = it.declarations.any { declaration ->
                !declaration.modifiers.any { modifier -> modifier == Modifier.INTERNAL || modifier == Modifier.PRIVATE }
            }
            if (hasPublicDeclaration) {
                sourceFileSpecBuilder
                    .addProperty(
                        PropertySpec.builder(
                            it.fileName.removeSuffix(".kt"),
                            String::class
                        )
                            .addModifiers(KModifier.CONST)
                            .initializer("\"${it.filePath.substringAfter(rootPath.replace("\\", "/")).removePrefix("/")}\"")
                            .build()
                    )
                sourceFiles.add(it)
            }
        }

        return emptyList()
    }

    override fun finish() {
        super.finish()
        if (rootPath.isNotBlank()) {
            val targetDir = File(rootPath, "${sourceGeneratedModule}/src/commonMain/kotlin/$packagePath")
            if (!targetDir.exists()) targetDir.mkdirs()
            val targetFile = File(targetDir, "$objectName.kt")
            if (!targetFile.exists()) targetFile.createNewFile()
            codeGenerator.createNewFileByPath(
                dependencies = Dependencies(aggregating = true, sources = sourceFiles.toTypedArray()),
                path = File(packagePath, objectName).path,
                extensionName = "source"
            )
            OutputStreamWriter(targetFile.outputStream(), StandardCharsets.UTF_8).use(
                FileSpec.builder(
                packageName,
                objectName
            ).addType(sourceFileSpecBuilder.build()).build()::writeTo)
        }
    }
}
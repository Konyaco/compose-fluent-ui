package com.konyaco.fluent.generated

import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.symbol.KSAnnotated
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

    private val packageName = "com.konyaco.fluent.source.generated"
    private val packagePath = packageName.replace(".", "/")

    private val componentName = environment.options["source.generated.module.name"] ?: ""

    private val objectName = "${componentName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}SourceFile"
    private val sourceFileSpecBuilder = TypeSpec.objectBuilder(objectName)
    private var rootPath = ""

    private val logger = environment.logger

    override fun process(resolver: Resolver): List<KSAnnotated> {
        if (componentName.isEmpty()) {
            logger.error("please set module name by ksp arg `source.generated.module.name`")
        }
        resolver.getAllFiles().forEach {
            val hasPublicDeclaration = it.declarations.any { declaration ->
                !declaration.modifiers.any { modifier -> modifier == Modifier.INTERNAL || modifier == Modifier.PRIVATE }
            }
            if (hasPublicDeclaration) {
                if (rootPath.isEmpty()) {
                    val file = File(it.filePath.substringBefore("/src/"))
                    rootPath = file.parentFile.path
                }
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
            }
        }

        return emptyList()
    }

    override fun finish() {
        super.finish()
        if (rootPath.isNotBlank()) {
            val targetDir = File(rootPath, "source-generated/src/commonMain/kotlin/$packagePath")
            if (!targetDir.exists()) targetDir.mkdirs()
            val targetFile = File(targetDir, "$objectName.kt")
            if (!targetFile.exists()) targetFile.createNewFile()
            OutputStreamWriter(targetFile.outputStream(), StandardCharsets.UTF_8).use(
                FileSpec.builder(
                packageName,
                objectName
            ).addType(sourceFileSpecBuilder.build()).build()::writeTo)
        }
    }
}
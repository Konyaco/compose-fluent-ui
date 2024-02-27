package com.konyaco.fluent.gallery.processor

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.*
import com.google.devtools.ksp.symbol.impl.kotlin.KSFunctionDeclarationImpl
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import java.io.OutputStreamWriter
import java.nio.charset.StandardCharsets

class SampleCodeProcessor(private val logger: KSPLogger, private val codeGenerator: CodeGenerator) : SymbolProcessor {

    private val annotationPackage = "com.konyaco.fluent.gallery.annotation"
    private val sampleAnnotation = "Sample"

    private val sampleCodeFunctions = mutableMapOf<String, MutableList<KSFunctionDeclaration>>()

    private val visitor = FindFunctionVisitor {
        if (it.annotations.any { annotation ->
                annotation.shortName.asString() == sampleAnnotation &&
                        annotation.annotationType.resolve().declaration.packageName.asString() == annotationPackage
            }
        ) {
            val list = sampleCodeFunctions[it.packageName.asString()] ?: mutableListOf<KSFunctionDeclaration>().apply {
                sampleCodeFunctions[it.packageName.asString()] = this
            }
            list.add(it)
        }
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {
        resolver.getAllFiles().forEach { it.accept(visitor, Unit) }
        return emptyList()
    }

    override fun finish() {
        super.finish()
        val fileName = "_SampleCodeString"
        sampleCodeFunctions.forEach { (packageName, functions) ->
            if (functions.isNotEmpty()) {
                val sourceFile = FileSpec.builder(packageName, fileName)
                val sourceFileList = mutableListOf<KSFile>()
                functions.forEach { func ->
                    func.containingFile?.let { sourceFileList.add(it) }
                    if (func is KSFunctionDeclarationImpl) {
                        val funcName = func.simpleName.asString()
                        sourceFile.addProperty(
                            PropertySpec.builder(
                                "sourceCodeOf${funcName.first().uppercase()}${funcName.substring(1)}",
                                String::class
                            )
                                .addModifiers(KModifier.INTERNAL)
                                .getter(
                                    FunSpec.getterBuilder()
                                        .addStatement("return %S", func.ktFunction.text)
                                    .build()
                                )
                                .build()
                        )
                    }
                }
                val file = codeGenerator.createNewFile(
                    Dependencies(true, *(sourceFileList).toTypedArray()),
                    packageName,
                    fileName
                )
                OutputStreamWriter(file, StandardCharsets.UTF_8).use(sourceFile.build()::writeTo)

            }
        }
    }
}

class SampleCodeProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return SampleCodeProcessor(environment.logger, environment.codeGenerator)
    }
}
package com.konyaco.fluent.gallery.processor

import com.google.devtools.ksp.processing.*
import com.google.devtools.ksp.symbol.KSAnnotated

class CommonProcessor(logger: KSPLogger, codeGenerator: CodeGenerator): SymbolProcessor {

    private val visitor = Visitor(
        onPropertyNode = { property ->
            processors.forEach { it.onPropertyVisit(property) }
        },
        onFunNode = { function ->
            processors.forEach { it.onFunctionVisit(function) }
        }
    )

    private val processors = listOf(
        SampleCodeProcessor(logger, codeGenerator),
        ComponentProcessor(logger, codeGenerator)
    )

    override fun process(resolver: Resolver): List<KSAnnotated> {
        resolver.getAllFiles().forEach { it.accept(visitor, Unit) }
        return processors.flatMap { it.process(resolver) }
    }

    override fun finish() {
        super.finish()
        processors.forEach { it.finish() }
    }

    override fun onError() {
        super.onError()
        processors.forEach { it.onError() }
    }

    companion object {
        const val annotationPackage = "com.konyaco.fluent.gallery.annotation"
    }
}

class CommonProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return CommonProcessor(environment.logger, environment.codeGenerator)
    }
}
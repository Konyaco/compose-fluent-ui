package io.github.composefluent.gallery.processor

import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated

class CommonProcessor(logger: KSPLogger, codeGenerator: CodeGenerator, environment: SymbolProcessorEnvironment): SymbolProcessor {

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
        ComponentProcessor(logger, codeGenerator, environment)
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
        const val annotationPackage = "io.github.composefluent.gallery.annotation"
    }
}

class CommonProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return CommonProcessor(environment.logger, environment.codeGenerator, environment)
    }
}
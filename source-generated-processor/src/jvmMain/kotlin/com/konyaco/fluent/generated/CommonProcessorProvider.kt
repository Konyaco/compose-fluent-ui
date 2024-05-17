package com.konyaco.fluent.generated

import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider
import com.google.devtools.ksp.symbol.KSAnnotated

class CommonProcessorProvider: SymbolProcessorProvider {

    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return CommonProcessor(environment)
    }
}

class CommonProcessor(environment: SymbolProcessorEnvironment): IProcessor {

    private val processors = listOf(
        SourceFilePathProcessor(environment),
        IconSourceProcessor(environment)
    )

    override fun process(resolver: Resolver): List<KSAnnotated> {
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
}
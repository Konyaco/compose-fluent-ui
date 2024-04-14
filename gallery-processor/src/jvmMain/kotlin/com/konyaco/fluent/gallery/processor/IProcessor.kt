package com.konyaco.fluent.gallery.processor

import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration

interface IProcessor: SymbolProcessor {
    fun onFunctionVisit(function: KSFunctionDeclaration) {}

    fun onPropertyVisit(property: KSPropertyDeclaration) {}

    override fun process(resolver: Resolver): List<KSAnnotated> {
        return emptyList()
    }

    fun KSAnnotation.isTargetAnnotation(targetName: String): Boolean {
        return shortName.asString() == targetName && annotationType.resolve().declaration.packageName.asString() == CommonProcessor.annotationPackage
    }
}
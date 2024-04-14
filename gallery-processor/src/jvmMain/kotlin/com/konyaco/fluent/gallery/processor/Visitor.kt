package com.konyaco.fluent.gallery.processor

import com.google.devtools.ksp.getDeclaredFunctions
import com.google.devtools.ksp.getDeclaredProperties
import com.google.devtools.ksp.symbol.*

internal class Visitor(
    private val onFunNode:(node: KSFunctionDeclaration) -> Unit,
    private val onPropertyNode: (node: KSPropertyDeclaration) -> Unit,
) : KSVisitorVoid() {

    override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
        super.visitClassDeclaration(classDeclaration, data)
        classDeclaration.getDeclaredProperties().forEach { it.accept(this, Unit) }
        classDeclaration.getDeclaredFunctions().forEach { it.accept(this, Unit) }
    }

    override fun visitFunctionDeclaration(function: KSFunctionDeclaration, data: Unit) {
        onFunNode(function)
    }

    override fun visitPropertyDeclaration(property: KSPropertyDeclaration, data: Unit) {
        super.visitPropertyDeclaration(property, data)
        onPropertyNode(property)
    }
    override fun visitFile(file: KSFile, data: Unit) {
        file.declarations.forEach { it.accept(this, Unit) }
    }
}
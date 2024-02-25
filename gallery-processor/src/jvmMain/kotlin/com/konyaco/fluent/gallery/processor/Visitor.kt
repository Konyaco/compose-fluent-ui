package com.konyaco.fluent.gallery.processor

import com.google.devtools.ksp.getDeclaredFunctions
import com.google.devtools.ksp.symbol.*

internal class FindFunctionVisitor(
    private val onNode:(node: KSFunctionDeclaration) -> Unit
) : KSVisitorVoid() {

    override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
        super.visitClassDeclaration(classDeclaration, data)
        classDeclaration.getDeclaredFunctions().forEach { it.accept(this, Unit) }
    }

    override fun visitFunctionDeclaration(function: KSFunctionDeclaration, data: Unit) {
        onNode(function)
    }

    override fun visitFile(file: KSFile, data: Unit) {
        file.declarations.forEach { it.accept(this, Unit) }
    }
}
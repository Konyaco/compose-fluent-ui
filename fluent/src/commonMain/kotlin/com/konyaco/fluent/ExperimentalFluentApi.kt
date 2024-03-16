package com.konyaco.fluent

@RequiresOptIn(message = "This is an experimental fluent API.")
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY_GETTER,
)
@Retention(AnnotationRetention.BINARY)
annotation class ExperimentalFluentApi
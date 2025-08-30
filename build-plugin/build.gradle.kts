plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(gradleApi())

    implementation(kotlin("gradle-plugin", libs.versions.kotlin.get()))
    gradlePluginImplementation(libs.plugins.android.kotlin.multiplatform.library.get())
    gradlePluginImplementation(libs.plugins.maven.publish.get())
    gradlePluginImplementation(libs.plugins.compose.multiplatform.get())
}

fun DependencyHandler.gradlePluginImplementation(plugin: PluginDependency) {
    implementation(
        group = plugin.pluginId,
        name = "${plugin.pluginId}.gradle.plugin",
        version = plugin.version.toString()
    )
}

kotlin {
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
}

gradlePlugin {
    plugins {
        create("BuildPlugin") {
            id = "io.github.composefluent.plugin.build"
            implementationClass = "io.github.composefluent.plugin.build.BuildPlugin"
        }
    }
}
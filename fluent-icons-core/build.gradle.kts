import io.github.composefluent.plugin.build.BuildConfig
import io.github.composefluent.plugin.build.applyTargets

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.ksp)
    alias(libs.plugins.maven.publish)
}

group = BuildConfig.group
version = BuildConfig.libraryVersion

kotlin {
    applyTargets(namespaceModule = ".icons")
    sourceSets {
        commonMain.dependencies {
            implementation(compose.foundation)
        }
    }
}

dependencies {
    val processor = (project(":source-generated-processor"))
    add("kspCommonMainMetadata", processor)
}

ksp {
    arg("source.generated.module.name", "FluentIconCore")
    arg("source.generated.module.enabled", false.toString())
    arg("source.generated.icon.enabled", true.toString())
}
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
    applyTargets()
    sourceSets {
        commonMain.dependencies {
            api(compose.foundation)
            api(project(":fluent-icons-core"))
            implementation(compose.uiUtil)
            implementation(libs.kotlinx.datetime)
            implementation(libs.haze)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

dependencies {
    val processor = (project(":source-generated-processor"))
    add("kspCommonMainMetadata", processor)
}

ksp {
    arg("source.generated.module.name", project.name)
}
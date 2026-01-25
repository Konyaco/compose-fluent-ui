import io.github.composefluent.plugin.build.applyTargets

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
}

kotlin {
    applyTargets(namespaceModule = ".generated")
    sourceSets {
        commonMain.dependencies {
            implementation(project(":fluent-icons-core"))
            implementation(project(":fluent-icons-extended"))
            implementation(libs.compose.ui)
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}
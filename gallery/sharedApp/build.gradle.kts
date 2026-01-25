import com.codingfeline.buildkonfig.compiler.FieldSpec
import io.github.composefluent.plugin.build.BuildConfig
import io.github.composefluent.plugin.build.applyTargets
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.ksp)
    alias(libs.plugins.build.konfig)
}

kotlin {
    applyTargets("gallery.shared")
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    sourceSets {
        commonMain {
            dependencies {
                implementation(libs.compose.foundation)
                implementation(libs.compose.components.resources)
                implementation(project(":fluent"))
                implementation(project(":fluent-icons-extended"))
                implementation(libs.compose.ui.util)
                implementation(libs.highlights)
                implementation(libs.androidx.navigation3.ui)
                implementation(libs.androidx.navigationevent.compose)
                implementation(project(":source-generated"))
            }
            kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin")
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }

        jvmMain.dependencies {
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.window.styler)
            implementation(libs.jna.platform)
            implementation(libs.jna)
        }
    }
}

buildkonfig {
    packageName = "${BuildConfig.packageName}.build"

    defaultConfigs {
        buildConfigField(FieldSpec.Type.STRING, "LIBRARY_VERSION", BuildConfig.libraryVersion, const = true)
        buildConfigField(FieldSpec.Type.STRING, "GALLERY_VERSION", BuildConfig.integerVersionName, const = true)
        buildConfigField(FieldSpec.Type.STRING, "COMPOSE_VERSION", libs.versions.compose.get(), const = true)
        buildConfigField(FieldSpec.Type.STRING, "KOTLIN_VERSION", libs.versions.kotlin.get(), const = true)
        buildConfigField(FieldSpec.Type.STRING, "HAZE_VERSION", libs.versions.haze.get(), const = true)

        buildConfigField(FieldSpec.Type.STRING, "CURRENT_BRANCH", BuildConfig.branch, const = true)
    }
}

dependencies {
    val processor = project(":gallery-processor")
    add("kspCommonMainMetadata", processor)
}

// workaround for KSP only in Common Main.
// https://github.com/google/ksp/issues/567
tasks.withType<KotlinCompilationTask<*>>().configureEach {
    if (name != "kspCommonMainKotlinMetadata") {
        dependsOn("kspCommonMainKotlinMetadata")
    }
}

compose.resources {
    packageOfResClass = "${BuildConfig.packageName}.gallery.resources"
    publicResClass = true
}

import io.github.composefluent.plugin.build.BuildConfig

plugins {
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform) apply false
    alias(libs.plugins.compose.hotReload) apply false
    alias(libs.plugins.android.kotlin.multiplatform.library) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.build.konfig) apply false
    alias(libs.plugins.maven.publish) apply false
    id("io.github.composefluent.plugin.build")
}

group = BuildConfig.group

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }
}

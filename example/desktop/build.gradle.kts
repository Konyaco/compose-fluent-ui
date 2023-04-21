import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    jvm()
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(project(":example:common"))
                implementation("com.mayakapps.compose:window-styler:0.3.2")
            }
        }
        val jvmTest by getting
    }
    jvmToolchain(11)
}

compose.desktop {
    application {
        mainClass = "com.konyaco.fluent.example.MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "Fluent Compose"
            packageVersion = "1.0.0"
        }
    }
}

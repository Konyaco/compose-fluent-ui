plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(gradleApi())
    implementation(kotlin("gradle-plugin"))
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
            id = "com.konyaco.fluent.plugin.build"
            implementationClass = "com.konyaco.fluent.plugin.build.BuildPlugin"
        }
    }
}
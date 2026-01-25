import com.android.build.api.variant.impl.VariantOutputImpl
import io.github.composefluent.plugin.build.BuildConfig

plugins {
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.android.application)
}

dependencies {
    implementation(project(":gallery:sharedApp"))
    implementation(libs.compose.ui)
    implementation(libs.compose.foundation)
    implementation(libs.androidx.activity.compose)
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.5")
}

android {
    compileSdk = BuildConfig.Android.compileSdkVersion
    namespace = BuildConfig.packageName + ".gallery"

    defaultConfig {
        minSdk = BuildConfig.Android.minSdkVersion
        targetSdk = BuildConfig.Android.compileSdkVersion
        versionCode = 1
        versionName = BuildConfig.libraryVersion
        vectorDrawables {
            useSupportLibrary = true
        }

    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.android.pro",
                "../sharedApp/proguard-rules.common.pro"
            )
            val signFile = System.getenv("ANDROID_SIGNING_FILE")
            signFile?.let {
                val password = System.getenv("ANDROID_SIGNING_PASSWORD")
                val keyAlias = System.getenv("ANDROID_SIGNING_KEY_ALIAS")
                val keyPassword = System.getenv("ANDROID_SIGNING_KEY_PASSWORD")
                signingConfig = signingConfigs.register("release") {
                    this.storeFile = file(signFile)
                    this.storePassword = password
                    this.keyAlias = keyAlias
                    this.keyPassword = keyPassword
                }.get()
            }
        }
    }

    androidComponents.onVariants { variant ->
        variant.outputs.forEach { output ->
            if (output is VariantOutputImpl) {
               output.apply {
                   outputFileName.set(
                       "${variant.applicationId.get()}-" +
                       "${versionName.get()}-" +
                       "${variant.buildType}.apk"
                   )
               }
            }
        }
    }

    packaging {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }

    compileOptions {
        sourceCompatibility = BuildConfig.Jvm.javaVersion
        targetCompatibility = BuildConfig.Jvm.javaVersion
        isCoreLibraryDesugaringEnabled = true
    }
}

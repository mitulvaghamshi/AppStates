plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.appstate"
    compileSdk = 33
    composeOptions.kotlinCompilerExtensionVersion = "1.3.1"

    defaultConfig {
        applicationId = "com.example.appstate"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0.0"
        vectorDrawables.useSupportLibrary = true
    }
    buildTypes {
        release {
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
}

dependencies {
    val compose = "1.2.1"
    val lifecycle = "2.5.1"
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.activity:activity-compose:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    implementation("androidx.compose.ui:ui:$compose")
    implementation("androidx.compose.ui:ui-tooling:$compose")
    implementation("androidx.compose.material:material:$compose")
    implementation("androidx.compose.foundation:foundation:$compose")
    implementation("androidx.compose.ui:ui-tooling-preview:$compose")
    implementation("androidx.compose.runtime:runtime-livedata:$compose")
    implementation("androidx.compose.foundation:foundation-layout:$compose")
    implementation("androidx.compose.material:material-icons-extended:$compose")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle")
}

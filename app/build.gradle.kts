plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.xin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.xin"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation("androidx.camera:camera-core:1.1.0")
    implementation("androidx.camera:camera-camera2:1.1.0")
    implementation("androidx.camera:camera-lifecycle:1.1.0")
    implementation("androidx.camera:camera-view:1.1.0")

    // ML Kit
    implementation("com.google.mlkit:face-detection:16.1.3")

    // TensorFlow Lite
    implementation("org.tensorflow:tensorflow-lite:0.7.0")
    implementation("org.tensorflow:tensorflow-lite:2.8.0")
    implementation("com.google.code.gson:gson:2.8.8")
}
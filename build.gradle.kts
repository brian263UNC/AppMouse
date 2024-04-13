buildscript {
//Your dependencies ...
    dependencies {
//        classpath "com.google.dagger:hilt-android-gradle-plugin:2.38.1"
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.42")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")

    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("org.jetbrains.kotlin.kapt") version "1.9.22" apply false
    id("com.google.dagger.hilt.android") version "2.41" apply false
}

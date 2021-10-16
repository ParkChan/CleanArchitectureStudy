object Version {
    const val KOTLIN = "1.5.31"
    const val HILT = "2.39.1"
}

object ProjectConfig {
    const val GRADLE = "com.android.tools.build:gradle:7.0.2"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
    const val HILT_ANDROID_GRADLE_PLUGIN =
        "com.google.dagger:hilt-android-gradle-plugin:${Version.HILT}"
    const val ANDROID_JUNIT5 = "de.mannodermaus.gradle.plugins:android-junit5:1.8.0.0"
}

object AndroidConfig {
    const val COMPILE_AND_TARGET_SDK = 30
    const val BUILD_TOOLS_VERSION = "30.0.3"
    const val MIN_SDK = 21
    const val TARGER_SDK = 30
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
    const val ANDROID_JUNIT_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
    const val RUNNER_BUILDER = "runnerBuilder"
    const val ANDROID_JUNIT5_BUILDER = "de.mannodermaus.junit5.AndroidJUnit5Builder"

}

object JetBrain {
    private const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN}"
}

object CoroutineConfig {
    private const val COROUTINE_VERSION = "1.5.1"
    const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$COROUTINE_VERSION"
    const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$COROUTINE_VERSION"
    const val TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$COROUTINE_VERSION"
}

object TestConfig {
    private const val JUNIT_VERSION = "5.8.1"

    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.1"
    const val ANDROID_CORE_TESTING = "androidx.arch.core:core-testing:2.1.0"
    const val JUNIT_JUPITER_API = "org.junit.jupiter:junit-jupiter-api:$JUNIT_VERSION"
    const val JUNIT_JUPITER_ENGINE = "org.junit.jupiter:junit-jupiter-engine:$JUNIT_VERSION"
    const val JUNIT_JUPITER_PARAMS = "org.junit.jupiter:junit-jupiter-params:$JUNIT_VERSION"
    const val ASSERTJ_CORE = "org.assertj:assertj-core:3.21.0"

    const val MOCKK = "io.mockk:mockk:1.10.6"

    const val ANDROID_TEST_CORE = "de.mannodermaus.junit5:android-test-core:1.3.0"
    const val ANDROID_TEST_RUNNER = "de.mannodermaus.junit5:android-test-runner:1.3.0"
    const val CORE = "androidx.test:core:1.3.0"

}

object AndroidXConfig {
    private const val LIFECYCLE_VERSION = "2.3.1"
    private const val PAGING_VERSION = "3.0.1"

    const val APPCOMPAT = "androidx.appcompat:appcompat:1.3.1"

    const val CORE_KTX = "androidx.core:core-ktx:1.6.0"
    const val LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"
    const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:$LIFECYCLE_VERSION"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:$LIFECYCLE_VERSION"

    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:1.1.3"

    //ActivityResultContract
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:1.3.1"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:1.3.6"

    //Paging 3.0 core dependencies Injection
    const val PAGING = "androidx.paging:paging-runtime:$PAGING_VERSION"
}

object GoogleConfig {
    const val MATERIAL = "com.google.android.material:material:1.1.0"
}

object DaggerHiltConfig {
    const val ANDROID = "com.google.dagger:hilt-android:${Version.HILT}"

    const val CORE = "com.google.dagger:hilt-core:${Version.HILT}"
    const val COMPILER = "com.google.dagger:hilt-compiler:${Version.HILT}"
}

object NetworkConfig {
    private const val RETROFIT_VERSION = "2.9.0"
    private const val MOSHI_VERSION = "1.12.0"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.8.0"
    const val CONVERTER_MOSHI = "com.squareup.retrofit2:converter-moshi:$RETROFIT_VERSION"

    const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:$MOSHI_VERSION"
    const val MOSHI_KOTLIN_CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:$MOSHI_VERSION"
    const val MOSHI_ADAPTERS = "com.squareup.moshi:moshi-adapters:$MOSHI_VERSION"
}

object LogConfig {
    const val TIMBER = "com.jakewharton.timber:timber:5.0.1"
}

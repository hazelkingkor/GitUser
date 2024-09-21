plugins {
    alias(libs.plugins.tymex.android.library)
    alias(libs.plugins.tymex.jvm.ktor)
}

android {
    namespace = "com.tymex.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}
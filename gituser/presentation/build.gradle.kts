plugins {
    alias(libs.plugins.tymex.android.feature.ui)
}

android {
    namespace = "com.tymex.gituser.presentation"
}

dependencies {
    implementation(projects.core.domain)

    implementation(projects.gituser.domain)
    implementation(projects.gituser.network)
    implementation(projects.gituser.data)
}
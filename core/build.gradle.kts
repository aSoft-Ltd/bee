plugins {
    kotlin("plugin.serialization")
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    signing
}

kotlin {
    jvm { library(); }
    js(IR) { library() }
//    val nativeTargets = nativeTargets(true)
//    macosArm64()
//    macosX64()
//    iosArm64()
//    iosX64()
//    val nativeTargets = linuxTargets(true)

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(kotlinx.serialization.core)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(libs.kommander.coroutines)
                implementation(libs.koncurrent.executors.mock)
            }
        }
    }
}

aSoftOSSLibrary(
    version = libs.versions.asoft.get(),
    description = "An multiplatform representation of a Live<T> object"
)
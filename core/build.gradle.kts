plugins {
    kotlin("plugin.serialization")
    kotlin("multiplatform")
    id("tz.co.asoft.library")
    signing
}

kotlin {
    jvm { library(); withJava() }
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
                implementation(projects.kommanderCoroutines)
                implementation(projects.koncurrentExecutorsMock)
            }
        }
    }
}

aSoftOSSLibrary(
    version = asoft.versions.root.get(),
    description = "An multiplatform representation of a Live<T> object"
)
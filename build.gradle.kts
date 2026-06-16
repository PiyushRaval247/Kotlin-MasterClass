plugins {
    kotlin("jvm") version "1.9.22" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        // Add coroutines globally so lessons and projects can use them
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
        testImplementation(kotlin("test"))
    }

    tasks.test {
        useJUnitPlatform()
    }

    kotlin {
        jvmToolchain(17)
    }
}

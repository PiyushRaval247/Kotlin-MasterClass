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
        add("implementation", "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
        add("testImplementation", "org.jetbrains.kotlin:kotlin-test")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    extensions.configure<org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension> {
        jvmToolchain(17)
    }
}

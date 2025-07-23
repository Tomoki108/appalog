plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.appalog"
version = "1.0.0"

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.3")
    implementation("io.ktor:ktor-server-netty:2.3.3")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.3")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.3")
    implementation("ch.qos.logback:logback-classic:1.4.7")
    testImplementation("io.ktor:ktor-server-tests:2.3.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.0")
}

application {
    mainClass.set("com.appalog.logger.ApplicationKt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
        freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

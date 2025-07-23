plugins {
    kotlin("jvm") version "1.9.0" // Kotlinバージョン
    application
}

group = "com.appalog"
version = "1.0.0"

repositories {
    mavenCentral() // 依存関係をMaven Centralから取得
}

dependencies {
    // Ktorコアライブラリ
    implementation("io.ktor:ktor-server-core:2.3.3")
    implementation("io.ktor:ktor-server-netty:2.3.3") // Nettyエンジン
    implementation("io.ktor:ktor-server-content-negotiation:2.3.3") // コンテンツネゴシエーション
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.3") // JSONシリアライゼーション

    // ロギング
    implementation("ch.qos.logback:logback-classic:1.4.7")

    // テスト
    testImplementation("io.ktor:ktor-server-tests:2.3.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.0")
}

application {
    mainClass.set("com.appalog.logger.ApplicationKt") // メインクラス指定
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17" // Java 17互換
    }
}

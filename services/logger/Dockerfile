FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Gradleのセットアップ
RUN apt-get update && apt-get install -y wget unzip && \
    wget https://services.gradle.org/distributions/gradle-8.7-bin.zip -O /tmp/gradle.zip && \
    unzip -d /opt /tmp/gradle.zip && \
    ln -s /opt/gradle-8.7/bin/gradle /usr/bin/gradle && \
    rm /tmp/gradle.zip && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# ソースコードのコピー
COPY . .

# アプリケーションのビルドと実行
CMD ["./gradlew", "run"]

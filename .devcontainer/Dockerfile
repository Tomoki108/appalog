FROM eclipse-temurin:17-jdk-jammy

# Install Kotlin compiler directly
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    git \
    && wget https://github.com/JetBrains/kotlin/releases/download/v1.9.0/kotlin-compiler-1.9.0.zip \
    && unzip kotlin-compiler-1.9.0.zip -d /usr/local \
    && rm kotlin-compiler-1.9.0.zip \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

ENV PATH="/usr/local/kotlinc/bin:${PATH}"
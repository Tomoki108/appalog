FROM mcr.microsoft.com/devcontainers/java:17

# Install Gradle
RUN apt-get update && apt-get install -y gradle

# Install Kotlin compiler
RUN curl -s https://get.sdkman.io | bash \
    && bash -c "source $HOME/.sdkman/bin/sdkman-init.sh && sdk install kotlin"

# Clean up
RUN apt-get clean && rm -rf /var/lib/apt/lists/*

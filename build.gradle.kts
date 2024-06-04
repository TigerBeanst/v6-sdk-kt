plugins {
    kotlin("jvm") version "1.9.23"
}

group = "fail.tiger"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.wire:wire-runtime:5.0.0-alpha01")
    implementation("com.squareup.wire:wire-grpc-client:5.0.0-alpha01")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
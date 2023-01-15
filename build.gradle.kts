plugins {
    id("java")
}

repositories {
    mavenCentral()
}

group = "com.akulik"

dependencies {
    testImplementation(libs.junit.jupiter.api)
    testRuntimeOnly(libs.junit.jupiter.engine)
    testImplementation(libs.junit.jupiter.params)
    testImplementation(libs.assertj.core)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
plugins {
    id("java")
}

group = "org.akulik"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.1")
    testImplementation("org.assertj:assertj-core:3.23.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
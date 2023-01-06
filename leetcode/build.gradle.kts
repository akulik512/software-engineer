plugins {
    id("java")
}

group = "org.akulik"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testImplementation("org.assertj:assertj-core")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
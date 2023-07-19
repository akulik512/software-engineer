plugins {
    java
    id("org.springframework.boot") version "3.1.1"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "com.akulik"
version = "unspecified"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
//    Web
    implementation("org.springframework.boot:spring-boot-starter-web")

//    Lombok
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
    testCompileOnly(libs.lombok)
    testAnnotationProcessor(libs.lombok)

//    AWS
    implementation("io.awspring.cloud:spring-cloud-aws-dependencies:2.3.0")
    implementation("io.awspring.cloud:spring-cloud-starter-aws-messaging:2.4.4")

//    DBs
//    implementation("org.springframework.boot:spring-boot-starter-data-cassandra")
//    implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
//    runtimeOnly("com.oracle.database.jdbc:ojdbc8")
//    runtimeOnly("org.postgresql:postgresql")

//    Tests
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.awaitility:awaitility:4.2.0")
    testImplementation("org.springframework.boot:spring-boot-testcontainers")
    testImplementation("org.testcontainers:junit-jupiter:1.18.3")
    testImplementation("org.testcontainers:localstack:1.18.3")
//    testImplementation("org.testcontainers:cassandra")
//    testImplementation("org.testcontainers:mongodb")
//    testImplementation("org.testcontainers:oracle-xe")
//    testImplementation("org.testcontainers:postgresql")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
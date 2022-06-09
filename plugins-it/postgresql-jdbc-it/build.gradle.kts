plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    api(project(":pinpoint-plugin-it-utils"))
    api(project(":pinpoint-plugin-it-jdbc-test"))
    api(project(":pinpoint-bootstrap-core"))
    testImplementation("org.testcontainers:testcontainers:1.16.2")
    testImplementation("org.testcontainers:postgresql:1.16.2")
    testImplementation("org.postgresql:postgresql:9.4.1212.jre6")
    testImplementation(project(":pinpoint-postgresql-jdbc-driver-plugin"))
    testImplementation(project(":pinpoint-profiler-test"))
}

description = "pinpoint-postgresql-jdbc-driver-plugin-it"

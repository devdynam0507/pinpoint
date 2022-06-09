plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    api(project(":pinpoint-plugin-it-utils"))
    testImplementation(libs.jackson.core.asl)
    testImplementation(libs.jackson.mapper.asl)
    testImplementation(libs.jackson.core)
    testImplementation(libs.jackson.annotations)
    testImplementation(libs.jackson.databind)
}

description = "pinpoint-jdk-http-plugin-it"

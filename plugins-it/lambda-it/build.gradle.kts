/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("com.navercorp.pinpoint.java-conventions")
}

dependencies {
    testImplementation("org.springframework:spring-context:5.3.13")
    testImplementation(project(":pinpoint-plugin-it-utils"))
}

description = "pinpoint-lambda-it"

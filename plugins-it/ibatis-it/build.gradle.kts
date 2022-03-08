/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    implementation(project(":pinpoint-plugin-it-utils"))
    testImplementation("org.apache.ibatis:ibatis-sqlmap:2.3.4.726")
    testImplementation("org.springframework:spring-ibatis:2.0.8")
}

description = "pinpoint-ibatis-plugin-it"
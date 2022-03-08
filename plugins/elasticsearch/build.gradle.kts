/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    testImplementation("org.slf4j:slf4j-api:1.7.30")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.12.4")
    testImplementation("org.apache.logging.log4j:log4j-core:2.12.4")
    compileOnly(project(":pinpoint-bootstrap-core"))
    compileOnly("org.elasticsearch.client:elasticsearch-rest-high-level-client:7.3.0")
}

description = "pinpoint-elasticsearch-plugin"
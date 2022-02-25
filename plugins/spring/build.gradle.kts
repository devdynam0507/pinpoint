/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("com.navercorp.pinpoint.java-conventions")
}

dependencies {
    testImplementation(project(":pinpoint-test"))
    providedCompile(project(":pinpoint-bootstrap-core"))
    compileOnly("org.springframework:spring-context:4.3.30.RELEASE")
    compileOnly("org.springframework:spring-web:4.3.30.RELEASE")
}

description = "pinpoint-spring-plugin"

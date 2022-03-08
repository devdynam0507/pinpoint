/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    compileOnly(project(":pinpoint-bootstrap-core"))
    compileOnly(project(":pinpoint-annotations"))
    compileOnly("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
}

description = "pinpoint-kotlin-coroutines-plugin"
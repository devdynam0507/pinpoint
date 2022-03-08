/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    implementation(project(":pinpoint-annotations"))
    implementation(project(":pinpoint-commons"))
    implementation(project(":pinpoint-commons-buffer"))
    implementation(project(":pinpoint-commons-profiler"))
    implementation(project(":pinpoint-thrift"))
    implementation(project(":pinpoint-grpc"))
    implementation(project(":pinpoint-bootstrap-core"))
    implementation(project(":pinpoint-bootstrap"))
    implementation(project(":pinpoint-rpc"))
    implementation(project(":pinpoint-plugins-loader"))
    implementation("com.google.guava:guava:30.1-android")
    implementation("com.google.inject:guice:4.2.2")
    implementation("org.ow2.asm:asm:9.2")
    implementation("org.ow2.asm:asm-commons:9.2")
    implementation("org.ow2.asm:asm-util:9.2")
    implementation("org.ow2.asm:asm-tree:9.2")
    implementation("org.ow2.asm:asm-analysis:9.2")
    implementation("org.apache.thrift:libthrift:0.12.0")
    implementation(project(":pinpoint-profiler-logging"))
    runtimeOnly("org.slf4j:slf4j-api:1.7.30")
    testImplementation("com.google.inject.extensions:guice-grapher:4.1.0")
    testImplementation("commons-lang:commons-lang:2.6")
    testImplementation(project(":pinpoint-rpc"))
    testImplementation(project(":pinpoint-testcase"))
    testImplementation("org.springframework:spring-context:4.3.30.RELEASE")
    testImplementation("org.awaitility:awaitility:3.1.5")
}

description = "pinpoint-profiler"
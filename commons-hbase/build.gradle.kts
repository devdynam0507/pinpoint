/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("pinpoint.java-conventions")
}

dependencies {
    api(project(":pinpoint-annotations"))
    api(project(":pinpoint-commons"))
    api(project(":pinpoint-commons-profiler"))
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("org.apache.hbase:hbase-shaded-client:1.7.1")
    implementation("org.codehaus.jackson:jackson-core-asl:1.9.13")
    implementation("com.sematext.hbasewd:hbasewd:0.1.0")
    implementation("org.springframework:spring-core:5.3.13")
    implementation("org.springframework:spring-tx:5.3.13")
    implementation("org.apache.logging.log4j:log4j-api:2.17.1")
    runtimeOnly("log4j:log4j:1.2.17")
    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:2.17.1")
    runtimeOnly("org.apache.logging.log4j:log4j-core:2.17.1")
    runtimeOnly("org.apache.logging.log4j:log4j-jcl:2.17.1")
}

description = "pinpoint-commons-hbase"

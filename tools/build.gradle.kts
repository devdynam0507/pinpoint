plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    api(project(":pinpoint-bootstrap-core"))
    api(project(":pinpoint-thrift"))
    implementation(libs.libthrift.v012)
    implementation(libs.log4j.api.jdk7)
    runtimeOnly(libs.slf4j.api)
    runtimeOnly(libs.log4j.slf4j.impl.jdk7)
    runtimeOnly(libs.log4j.core.jdk7)
}

description = "pinpoint-tools"

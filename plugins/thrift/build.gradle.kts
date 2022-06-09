plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    testImplementation(libs.log4j.api.jdk7)
    testImplementation(libs.log4j.slf4j.impl.jdk7)
    testImplementation(libs.log4j.core.jdk7)
    testImplementation(libs.log4j.jcl.jdk7)
    compileOnly(project(":pinpoint-bootstrap-core"))
    compileOnly(libs.libthrift.v012)
}

description = "pinpoint-thrift-plugin"

plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    api(project(":pinpoint-commons"))
    api(project(":pinpoint-profiler"))
    api(project(":pinpoint-thrift"))
    api(project(":pinpoint-bootstrap-core"))
    api(project(":pinpoint-bootstrap"))
    api(project(":pinpoint-rpc"))
    implementation(libs.asm.core)
    implementation(libs.asm.commons)
    implementation(libs.asm.util)
    implementation(libs.asm.tree)
    implementation(libs.libthrift.v012)
    implementation(libs.guice)
    implementation(libs.log4j.core.jdk7)
    implementation(libs.junit)
    runtimeOnly(libs.slf4j.api)
    runtimeOnly(libs.log4j.jcl.jdk7)
    runtimeOnly(libs.log4j.slf4j.impl.jdk7)
    runtimeOnly(libs.log4j.core.jdk7)
    testImplementation(libs.commons.lang3)
}

description = "pinpoint-profiler-test"

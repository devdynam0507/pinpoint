plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    api(project(":pinpoint-common-servlet"))
    compileOnly(project(":pinpoint-bootstrap-core"))
    compileOnly(libs.javax.servlet.api.v3)
    compileOnly("com.caucho:resin:3.0.9")
}

description = "pinpoint-resin-plugin"

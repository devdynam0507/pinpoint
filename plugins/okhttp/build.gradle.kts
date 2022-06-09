plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    compileOnly(project(":pinpoint-bootstrap-core"))
    compileOnly("com.squareup.okhttp:okhttp:2.5.0")
    compileOnly("com.squareup.okhttp3:okhttp:3.8.1")
}

description = "pinpoint-okhttp-plugin"

plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    api(project(":pinpoint-plugin-it-utils"))
    testImplementation("com.google.code.gson:gson:2.3.1")
}

description = "pinpoint-gson-plugin-it"

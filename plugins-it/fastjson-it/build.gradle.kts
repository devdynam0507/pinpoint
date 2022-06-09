plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    api(project(":pinpoint-plugin-it-utils"))
    testImplementation("com.alibaba:fastjson:1.2.47")
}

description = "pinpoint-fastjson-plugin-it"

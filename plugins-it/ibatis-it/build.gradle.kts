plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    api(project(":pinpoint-plugin-it-utils"))
    testImplementation("org.apache.ibatis:ibatis-sqlmap:2.3.4.726")
    testImplementation("org.springframework:spring-ibatis:2.0.8")
}

description = "pinpoint-ibatis-plugin-it"

plugins {
    id("com.navercorp.pinpoint.gradle.plugins.toolchain.java8")
}

dependencies {
    compileOnly("com.typesafe.akka:akka-http-core_2.12:10.1.0-RC1")
    compileOnly("com.typesafe.akka:akka-http_2.12:10.1.0-RC1")
    compileOnly(project(":pinpoint-bootstrap-core"))
    testImplementation("com.typesafe.akka:akka-http-core_2.12:10.1.0-RC1")
    testImplementation("com.typesafe.akka:akka-http_2.12:10.1.0-RC1")
    testImplementation(project(":pinpoint-bootstrap-core"))
}

description = "pinpoint-akka-http-plugin"

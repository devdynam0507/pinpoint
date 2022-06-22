plugins {
    id("com.navercorp.pinpoint.gradle.plugins.java-platform")
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(project(":pinpoint-agent-proxy-common"))
    api(project(":pinpoint-agent-proxy-apache-plugin"))
    api(project(":pinpoint-agent-proxy-app-plugin"))
    api(project(":pinpoint-agent-proxy-nginx-plugin"))
    api(project(":pinpoint-agent-proxy-user-plugin"))
}
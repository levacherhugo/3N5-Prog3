plugins {
    kotlin("jvm") version "2.0.10"
}

group = "org.levacher"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // https://mvnrepository.com/artifact/org.jsoup/jsoup
    implementation("org.jsoup:jsoup:1.18.1")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}
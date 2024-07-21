plugins {
    id("java")
    application
    checkstyle
}
application {
    mainClass.set("hexlet.code.App")
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
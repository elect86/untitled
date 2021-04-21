plugins {
    kotlin("jvm") version "1.4.21"
    id("foo")
}

group = "org.example"
version = "1.0-SNAPSHOT"

//println("from main build script: ${libs.versions.bb.get()}")


repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))

//    implementation(platform("$kx.gli:bom:$gliVersion"))
//
////    implementation("$kx:kotlin-unsigned")
////    implementation("$kx:kool")
////    implementation("$kx:glm")
//    implementation("$kx:gli")
}

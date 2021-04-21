
plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

println("from build-src build script: ${libs.versions.bb.get()}")
//println("from build-src build script: ${sciJava.common.get()}")

dependencies {
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("bb", "3.2.1")
            alias("foo").to("group:artifact:0.0.1")
        }
    }
}

//pluginManagement {
//    repositories {
//        gradlePluginPortal()
//        maven("https://raw.githubusercontent.com/kotlin-graphics/mary/master")
//    }
//}
//
//plugins {
//    id("sciJava.catalogs") version "30.0.0+58"
//}
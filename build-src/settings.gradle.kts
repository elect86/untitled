
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            alias("foo").to("group:artifact:0.0.1")
        }
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            create("foo").to("group:artifact:0.0.1")
        }
    }
}
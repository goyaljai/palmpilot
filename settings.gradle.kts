rootProject.name = "palmpilot"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    repositories {
        google()
        mavenCentral()
    }
}

include(":androidApp")
include(":androidApp:baselineprofile")
include(":desktopApp")
include(":shared")

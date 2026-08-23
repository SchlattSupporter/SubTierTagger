object BuildConfig {
    const val MINECRAFT_VERSION: String = "1.21.11"
    const val FABRIC_LOADER_VERSION: String = "0.18.1"
    const val FABRIC_API_VERSION: String = "0.141.6+1.21.11"
    const val UKULIB_VERSION: String = "1.10.2+1.21.11"

    const val NEOFORGE_VERSION: String = "26.2.0.0-beta"

    const val MOD_VERSION: String = "2.6.0"
    const val MODRINTH_PROJECT_ID: String = "dpkYdLu5"

    fun createVersionString(): String {
        return "$MOD_VERSION+mc$MINECRAFT_VERSION"
    }
}

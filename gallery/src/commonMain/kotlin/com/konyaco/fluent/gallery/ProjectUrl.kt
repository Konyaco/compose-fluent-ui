package com.konyaco.fluent.gallery

object ProjectUrl {

    const val ROOT = "https://github.com/Konyaco/compose-fluent-ui"

    const val FRAMEWORK = "https://developer.android.com/develop/ui/compose"

    const val UI_DESIGN = "https://fluent2.microsoft.design/"

    const val FEED_BACK = "$ROOT/issues/new/choose"

    //TODO redirect to master
    private const val BRANCH = "dev"

    fun componentCodeOf(path: String): String {
        return "$ROOT/tree/$BRANCH/$path"
    }

    fun galleryCodeOf(path: String): String {
        return "$ROOT/tree/$BRANCH/gallery/src/$path"
    }

    //TODO documentation redirection
    fun documentationOf(path: String): String {
        return ROOT
    }

}
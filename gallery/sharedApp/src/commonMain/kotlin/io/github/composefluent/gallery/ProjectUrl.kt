package io.github.composefluent.gallery

import io.github.composefluent.build.BuildKonfig

object ProjectUrl {

    const val ROOT = "https://github.com/compose-fluent/compose-fluent-ui"

    const val FRAMEWORK = "https://developer.android.com/develop/ui/compose"

    const val UI_DESIGN = "https://fluent2.microsoft.design/"

    const val FEED_BACK = "$ROOT/issues/new/choose"

    private const val BRANCH = BuildKonfig.CURRENT_BRANCH

    fun sourceCodeOf(path: String): String {
        return "$ROOT/tree/$BRANCH/$path"
    }

    //TODO documentation redirection
    fun documentationOf(path: String): String {
        return ROOT
    }

}
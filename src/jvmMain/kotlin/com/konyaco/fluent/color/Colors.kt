package com.konyaco.fluent.color

import androidx.compose.ui.graphics.Color

object Colors {
    object Text {
        object Text {
            val Primary = Color(0xFFFFFFFF)
            val Secondary = Color(0xC5FFFFFF)
            val Tertiary = Color(0x87FFFFFF)
            val Disabled = Color(0x5DFFFFFF)
        }

        object Accent {
            val Primary = AccentColors.Light3
            val Secondary = AccentColors.Light3
            val Tertiary = AccentColors.Light2
            val Disabled = Color(0x5DFFFFFF)
        }

        object OnAccent {
            val Primary = Color(0xFF0000000)
            val Secondary = Color(0x800000000)
            val Tertiary = Color(0x870000000)
            val Selected = Color(0xFFFFFFFF)
        }
    }

    object Fill {
        object Control {
            val Default = Color(0x0FFFFFFF)

            // TODO: 
            val Secondary = Color(0x0FFFFFFF)
            val Tertiary = Color(0x0FFFFFFF)
            val Quarternary = Color(0x0FFFFFFF)
            val Disabled = Color(0x0FFFFFFF)
            val Transparent = Color(0x0FFFFFFF)
            val InputActive = Color(0x0FFFFFFF)
        }

        object ControlAlt {

        }

    }

    object AccentColors {
        val Base = Color(0xFF0078D4)
        val Light1 = Color(0xFF0093F9)
        val Light2 = Color(0xFF60CCFE)
        val Light3 = Color(0xFF98ECFE)
        val Dark1 = Color(0xFF005EB7)
        val Dark2 = Color(0xFF003D92)
        val Dark3 = Color(0xFF001968)
    }
}
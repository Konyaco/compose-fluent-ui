package com.konyaco.fluent.color

import androidx.compose.ui.graphics.Color

object Colors {
    object AccentColor {
        val Base = Color(0xFF0078D4)
        val Light1 = Color(0xFF0093F9)
        val Light2 = Color(0xFF60CCFE)
        val Light3 = Color(0xFF98ECFE)
        val Dark1 = Color(0xFF005EB7)
        val Dark2 = Color(0xFF003D92)
        val Dark3 = Color(0xFF001968)
    }

    object Text {
        object Text {
            val Primary = Color(0xFFFFFFFF)
            val Secondary = Color(0xC5FFFFFF)
            val Tertiary = Color(0x87FFFFFF)
            val Disabled = Color(0x5DFFFFFF)
        }

        object Accent {
            val Primary = AccentColor.Light3
            val Secondary = AccentColor.Light3
            val Tertiary = AccentColor.Light2
            val Disabled = Color(0x5DFFFFFF)
        }

        object OnAccent {
            val Primary = Color(0xFF0000000)
            val Secondary = Color(0x80000000)
            val Disabled = Color(0x87FFFFFF)
            val Selected = Color(0xFFFFFFFF)
        }
    }

    object Fill {
        object Control {
            /**
             * Rest
             */
            val Default = Color(0x0FFFFFFF)

            /**
             * Hover
             */
            val Secondary = Color(0x15FFFFFF)

            /**
             * Pressed
             */
            val Tertiary = Color(0x0BFFFFFF)

            /**
             * Rest (Pill Button control)
             */
            val Quarternary = Color(0x0FFFFFFF)

            /**
             * Disabled
             */
            val Disabled = Color(0x4DFFFFFF)

            /**
             * Rest
             */
            val Transparent = Color(0x00FFFFFF)

            /**
             * Active/Focused text input fields
             */
            val InputActive = Color(0xB31E1E1E)
        }

        object ControlAlt {
            val Transparent = Color(0x00FFFFFF)
            val Secondary = Color(0x19000000)
            val Tertiary = Color(0x0BFFFFFF)
            val Quarternary = Color(0x12FFFFFF)
            val Disabled = Color(0x00FFFFFF)
        }

        object Card {
            // TODO:
        }

        object ControlStrong {
            val Default = Color(0x8BFFFFFF)
            val Disabled = Color(0x3FFFFFFF)
        }

        object Accent {
            val Default = AccentColor.Light2
            val Secondary = AccentColor.Light2.copy(0.9f)
            val Tertiary = AccentColor.Light2.copy(0.8f)
            val Disabled = Color(0x28FFFFFF)
            val SelectedTextBackground = AccentColor.Base
        }
    }

    object Stroke {
        object Control {
            val Default = Color(0x12FFFFFF)
            val Secondary = Color(0x18FFFFFF)
            val OnAccentDefault = Color(0x14FFFFFF)
            val OnAccentSecondary = Color(0x23000000)
            val OnAccentTertiary = Color(0x37000000)
            val Disabled = Color(0x33000000)
            val ForStrongFillWhenOnImage = Color(0x6B000000)
        }

        object ControlStrong {
            // TODO: Unknown alpha in Figma
            val Default = Color(0x9AFFFFFF)
            val Disabled = Color(0x28FFFFFF)
        }

    }

    object Background {
        object Mica {
            val Base = Color(0xFF202020)
            val BaseAlt = Color(0xFF0A0A0A)
        }

        object Layer {
            val Default = Color(0x4C3A3A3A)
            val Alt = Color(0x0DFFFFFF)
        }
    }
}
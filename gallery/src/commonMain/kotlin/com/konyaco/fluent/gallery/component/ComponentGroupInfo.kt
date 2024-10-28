@file:Suppress

package com.konyaco.fluent.gallery.component

import com.konyaco.fluent.gallery.annotation.ComponentGroup

object ComponentGroupInfo {

    private const val screenPackage: String = "com.konyaco.fluent.gallery.screen"

    @ComponentGroup("Ruler",  iconGlyph = '\uEB3C', index = 0, generateScreen = false, packageMap = "$screenPackage.design")
    const val DesignGuidance = "Design guidance"

    @ComponentGroup("Accessibility", iconGlyph = '\uE776', generateScreen = false, index = 3)
    const val Accessibility = "Design guidance/Accessibility"

    @ComponentGroup("CheckboxChecked", iconGlyph = '\uE73A', index = 2, packageMap = "$screenPackage.basicinput")
    const val BasicInput = "Basic input"

    @ComponentGroup("Table", iconGlyph = '\uE80A', index = 3, packageMap = "$screenPackage.collections")
    const val Collections = "Collections"

    @ComponentGroup("CalendarClock", iconGlyph = '\uEC92', index = 4, packageMap = "$screenPackage.datetime")
    const val DateAndTime = "Date & time"

    @ComponentGroup("Chat", iconGlyph = '\uE8BD', index = 5, packageMap = "$screenPackage.dialogs")
    const val DialogAndFlyout = "Dialog & flyouts"

    @ComponentGroup("SlideLayout", iconGlyph = '\uE8A1', index = 6)
    const val Layout = "Layout"

    @ComponentGroup("VideoClip", iconGlyph = '\uE786', index = 7)
    const val Media = "Media"

    @ComponentGroup("Save", iconGlyph = '\uE74E', index = 8)
    const val MenusAndToolbars = "Menus & toolbars"

    @ComponentGroup("Flash", iconGlyph = '\uE945', index = 9)
    const val Motion = "Motion"

    @ComponentGroup("Navigation", iconGlyph = '\uE700', index = 10, packageMap = "$screenPackage.navigation")
    const val Navigation = "Navigation"

    @ComponentGroup("ArrowSort", iconGlyph = '\uE174', index = 11)
    const val Scrolling = "Scrolling"

    @ComponentGroup("ChatMultiple", iconGlyph = '\uE8F2', index = 12, packageMap = "$screenPackage.status")
    const val StatusAndInfo = "Status & info"

    @ComponentGroup("Color", iconGlyph = '\uE2B1', index = 13, packageMap = "$screenPackage.styles")
    const val Styles = "Styles"

    @ComponentGroup("System", iconGlyph = '\uE770', index = 14)
    const val System = "System"

    @ComponentGroup("TextFont", iconGlyph = '\uE8D2', index = 15, packageMap = "$screenPackage.text")
    const val Text = "Text"

    @ComponentGroup("Window", iconGlyph = '\uE7C4', index = 16)
    const val Windowing = "Windowing"
}
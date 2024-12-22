@file:Suppress

package com.konyaco.fluent.gallery.component

import com.konyaco.fluent.gallery.annotation.ComponentGroup

object ComponentGroupInfo {

    private const val screenPackage: String = "com.konyaco.fluent.gallery.screen"

    @ComponentGroup("Ruler", index = 0, generateScreen = false, packageMap = "$screenPackage.design")
    const val DesignGuidance = "Design guidance"

    @ComponentGroup("Accessibility", generateScreen = false, index = 3)
    const val Accessibility = "Design guidance/Accessibility"

    @ComponentGroup("CheckboxChecked", index = 2, packageMap = "$screenPackage.basicinput")
    const val BasicInput = "Basic input"

    @ComponentGroup("Table", index = 3, packageMap = "$screenPackage.collections")
    const val Collections = "Collections"

    @ComponentGroup("CalendarClock", index = 4, packageMap = "$screenPackage.datetime")
    const val DateAndTime = "Date & time"

    @ComponentGroup("Chat", index = 5, packageMap = "$screenPackage.dialogs")
    const val DialogAndFlyout = "Dialog & flyouts"

    @ComponentGroup("SlideLayout", index = 6)
    const val Layout = "Layout"

    @ComponentGroup("VideoClip", index = 7)
    const val Media = "Media"

    @ComponentGroup("Save", index = 8, packageMap = "$screenPackage.menus")
    const val MenusAndToolbars = "Menus & toolbars"

    @ComponentGroup("Flash", index = 9)
    const val Motion = "Motion"

    @ComponentGroup("Navigation", index = 10, packageMap = "$screenPackage.navigation")
    const val Navigation = "Navigation"

    @ComponentGroup("ArrowSort", index = 11, packageMap = "$screenPackage.scrolling")
    const val Scrolling = "Scrolling"

    @ComponentGroup("ChatMultiple", index = 12, packageMap = "$screenPackage.status")
    const val StatusAndInfo = "Status & info"

    @ComponentGroup("Color", index = 13, packageMap = "$screenPackage.styles")
    const val Styles = "Styles"

    @ComponentGroup("System", index = 14)
    const val System = "System"

    @ComponentGroup("TextFont", index = 15, packageMap = "$screenPackage.text")
    const val Text = "Text"

    @ComponentGroup("Window", index = 16)
    const val Windowing = "Windowing"
}
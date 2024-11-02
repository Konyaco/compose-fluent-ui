package com.konyaco.fluent.component

import platform.Foundation.NSCalendar
import platform.Foundation.NSCalendarIdentifierGregorian
import platform.Foundation.NSDateFormatter

internal actual fun getLocalDayOfWeekNames(): List<String> {
    return NSCalendar(NSCalendarIdentifierGregorian).weekdaySymbols.map { it.toString() }
}

internal actual fun getLocalMonthNames(): List<String> {
    return NSDateFormatter().monthSymbols.map { it.toString().take(3) } //TODO
}

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo
internal actual fun getLocalFirstDayOfWeek() = 2 //the same as jvm
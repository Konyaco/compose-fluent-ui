package io.github.composefluent.platform

import platform.Foundation.NSCalendar
import platform.Foundation.NSCalendarIdentifierGregorian
import platform.Foundation.NSDateFormatter
import platform.Foundation.NSDateFormatterShortStyle
import platform.Foundation.NSLocale
import platform.Foundation.currentLocale
import platform.Foundation.localeIdentifier

internal actual fun getLocalLocaleIdentifier(): String =
    NSLocale.currentLocale.localeIdentifier

internal actual fun getLocalCalendarData(): PlatformCalendarData {
    val locale = NSLocale.currentLocale
    val formatter = NSDateFormatter().apply {
        this.locale = locale
        calendar = NSCalendar(NSCalendarIdentifierGregorian)
        dateStyle = NSDateFormatterShortStyle
    }
    return createPlatformCalendarData(
        identifier = locale.localeIdentifier,
        fieldOrder = platformCalendarFieldOrderFromPattern(formatter.dateFormat.orEmpty()),
        monthNames = getLocalMonthNames(LocalMonthNameStyle.Full)
    )
}

internal actual fun getLocalDayOfWeekNames(): List<String> {
    return NSCalendar(NSCalendarIdentifierGregorian).weekdaySymbols.map { it.toString() }
}

internal actual fun getLocalMonthNames(style: LocalMonthNameStyle): List<String> =
    NSDateFormatter().apply {
        locale = NSLocale.currentLocale
    }.let { formatter ->
        when (style) {
            LocalMonthNameStyle.Short -> formatter.monthSymbols.map { it.toString().take(3) }
            LocalMonthNameStyle.Full -> formatter.monthSymbols.map { it.toString() }
        }
    }

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo
internal actual fun getLocalFirstDayOfWeek() = 2 // the same as jvm

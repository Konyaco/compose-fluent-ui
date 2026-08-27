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

internal actual fun getLocalMonthNames(style: LocalMonthNameStyle): List<String> {
    val calendar = NSCalendar.currentCalendar
    return when (style) {
        LocalMonthNameStyle.Short -> calendar.shortStandaloneMonthSymbols.map { it.toString() }
        LocalMonthNameStyle.Full -> calendar.standaloneMonthSymbols.map { it.toString() }
    }
}

package io.github.composefluent.component

import java.text.DateFormat
import java.text.DateFormatSymbols
import java.text.SimpleDateFormat
import java.util.Locale

internal actual fun getLocalLocaleIdentifier(): String =
    Locale.getDefault().toLanguageTag()

internal actual fun getLocalCalendarData(): PlatformCalendarData {
    val locale = Locale.getDefault()
    val datePattern = (DateFormat.getDateInstance(DateFormat.SHORT, locale) as? SimpleDateFormat)
        ?.toPattern()
        .orEmpty()
    return createPlatformCalendarData(
        identifier = locale.toLanguageTag(),
        fieldOrder = platformCalendarFieldOrderFromPattern(datePattern),
        monthNames = getLocalMonthNames(LocalMonthNameStyle.Full)
    )
}

internal actual fun getLocalMonthNames(style: LocalMonthNameStyle): List<String> {
    val locale = Locale.getDefault()
    val monthNames = when (style) {
        LocalMonthNameStyle.Short -> DateFormatSymbols(locale).shortMonths
        LocalMonthNameStyle.Full -> DateFormatSymbols(locale).months
    }
    return monthNames.take(12)
}

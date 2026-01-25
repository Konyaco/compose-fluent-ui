package io.github.composefluent.component

import java.util.Calendar
import java.util.Locale

internal actual fun getLocalDayOfWeekNames(): List<String> {
    val locale = Locale.getDefault()
    val calendar = Calendar.getInstance(locale)
    val names = calendar.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.NARROW_STANDALONE, locale)
        ?: calendar.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.SHORT_STANDALONE, locale)
    return names.entries.sortedBy { it.value }.map { it.key }
}

internal actual fun getLocalMonthNames(): List<String> {
    val locale = Locale.getDefault()
    val calendar = Calendar.getInstance(locale)
    val names = calendar.getDisplayNames(Calendar.MONTH, Calendar.SHORT_STANDALONE, locale)
    return names.entries.sortedBy { it.value }.map { it.key }
}

internal actual fun getLocalFirstDayOfWeek(): Int {
    val locale = Locale.getDefault()
    val calendar = Calendar.getInstance(locale)
    return calendar.firstDayOfWeek
}
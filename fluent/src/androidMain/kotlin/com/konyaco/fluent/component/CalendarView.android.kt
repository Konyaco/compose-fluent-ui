package com.konyaco.fluent.component

import android.os.Build
import java.util.Calendar
import java.util.Locale

internal actual fun getLocalDayOfWeekNames(): List<String> {
    val locale = Locale.getDefault()
    val calendar = Calendar.getInstance(locale)
    val style = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        Calendar.NARROW_STANDALONE
    } else {
        Calendar.SHORT
    }
    val shortStyle = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        Calendar.SHORT_STANDALONE
    } else {
        Calendar.SHORT
    }
    val names = calendar.getDisplayNames(Calendar.DAY_OF_WEEK, style, locale)
        ?: calendar.getDisplayNames(Calendar.DAY_OF_WEEK, shortStyle, locale)
    return names.entries.sortedBy { it.value }.map { it.key }
}

internal actual fun getLocalMonthNames(): List<String> {
    val locale = Locale.getDefault()
    val calendar = Calendar.getInstance(locale)
    val style = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        Calendar.SHORT_STANDALONE
    } else {
        Calendar.SHORT
    }
    val names = calendar.getDisplayNames(Calendar.MONTH, style, locale)
    return names.entries.sortedBy { it.value }.map { it.key }
}

internal actual fun getLocalFirstDayOfWeek(): Int {
    val locale = Locale.getDefault()
    val calendar = Calendar.getInstance(locale)
    return calendar.firstDayOfWeek
}
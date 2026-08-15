package io.github.composefluent.component

internal enum class LocalMonthNameStyle {
    Short,
    Full
}

internal enum class PlatformCalendarField {
    Day,
    Month,
    Year
}

internal data class PlatformCalendarData(
    val localeIdentifier: String,
    val fieldOrder: List<PlatformCalendarField>,
    val monthNames: List<String>,
    val fieldLabels: Map<PlatformCalendarField, String>
) {
    init {
        require(fieldOrder.size == PlatformCalendarField.entries.size &&
            fieldOrder.toSet() == PlatformCalendarField.entries.toSet()) {
            "Platform calendar field order must contain day, month, and year"
        }
        require(monthNames.size == 12) {
            "Platform calendar month names must contain exactly 12 values"
        }
        require(fieldLabels.keys == PlatformCalendarField.entries.toSet()) {
            "Platform calendar field labels must contain day, month, and year"
        }
    }
}

internal expect fun getLocalCalendarData(): PlatformCalendarData

internal expect fun getLocalLocaleIdentifier(): String

internal expect fun getLocalDayOfWeekNames(): List<String>

/**
 * Get the first day of week.
 * Sunday(1), Monday(2), ..., Saturday(7)
 */
internal expect fun getLocalFirstDayOfWeek(): Int

internal expect fun getLocalMonthNames(style: LocalMonthNameStyle): List<String>

internal fun createPlatformCalendarData(
    identifier: String,
    fieldOrder: List<PlatformCalendarField>,
    monthNames: List<String>
): PlatformCalendarData {
    return PlatformCalendarData(
        localeIdentifier = identifier,
        fieldOrder = normalizePlatformCalendarFieldOrder(fieldOrder),
        monthNames = normalizePlatformCalendarMonthNames(monthNames),
        fieldLabels = platformCalendarFieldLabels(identifier)
    )
}

internal fun platformCalendarFieldOrderFromPattern(
    pattern: String
): List<PlatformCalendarField> {
    val fields = mutableListOf<PlatformCalendarField>()
    var quoted = false
    pattern.forEach { character ->
        if (character == '\'') {
            quoted = !quoted
        } else if (!quoted) {
            val field = when (character) {
                'd', 'D' -> PlatformCalendarField.Day
                'M', 'L' -> PlatformCalendarField.Month
                'y', 'Y', 'u' -> PlatformCalendarField.Year
                else -> null
            }
            if (field != null && field !in fields) fields += field
        }
    }
    return normalizePlatformCalendarFieldOrder(fields)
}

private fun normalizePlatformCalendarFieldOrder(
    fields: List<PlatformCalendarField>
): List<PlatformCalendarField> = buildList {
    fields.forEach { field -> if (field !in this) add(field) }
    PlatformCalendarField.entries.forEach { field -> if (field !in this) add(field) }
}

private fun normalizePlatformCalendarMonthNames(names: List<String>): List<String> {
    val candidate = List(12) { index -> names.getOrNull(index).orEmpty() }
    return if (candidate.all { it.isNotBlank() } && candidate.toSet().size == 12) {
        candidate
    } else {
        List(12) { index -> (index + 1).toString() }
    }
}

private fun platformCalendarFieldLabels(
    identifier: String
): Map<PlatformCalendarField, String> {
    val language = identifier.substringBefore('-').substringBefore('_').lowercase()
    val labels = when (language) {
        "ar" -> Triple("اليوم", "الشهر", "السنة")
        "de" -> Triple("Tag", "Monat", "Jahr")
        "es" -> Triple("Día", "Mes", "Año")
        "fr" -> Triple("Jour", "Mois", "Année")
        "it" -> Triple("Giorno", "Mese", "Anno")
        "ja" -> Triple("日", "月", "年")
        "ko" -> Triple("일", "월", "년")
        "pt" -> Triple("Dia", "Mês", "Ano")
        "ru" -> Triple("День", "Месяц", "Год")
        "zh" -> Triple("日", "月", "年")
        else -> Triple("Day", "Month", "Year")
    }
    return mapOf(
        PlatformCalendarField.Day to labels.first,
        PlatformCalendarField.Month to labels.second,
        PlatformCalendarField.Year to labels.third
    )
}

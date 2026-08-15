@file:OptIn(kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.composefluent.platform

@JsFun("() => navigator.language")
private external fun getLocalLocaleIdentifierJs(): String

@JsFun("""() => new Intl.DateTimeFormat(undefined, {
    calendar: 'gregory', timeZone: 'UTC',
    year: 'numeric', month: 'numeric', day: 'numeric'
}).formatToParts(new Date(Date.UTC(2000, 10, 22)))
    .filter(part => part.type === 'day' || part.type === 'month' || part.type === 'year')
    .map(part => part.type)
    .join(',')""")
private external fun getLocalCalendarFieldOrderJs(): String

@JsFun("""(format) => {
    var formatter = new Intl.DateTimeFormat(navigator.language, { weekday: format })
    var baseDate = new Date(Date.UTC(2017, 0, 1)) // just a Sunday
    var weekDays = []
    for (var day = 0; day < 7; day++) {
        weekDays.push(formatter.format(baseDate))
        baseDate.setDate(baseDate.getDate() + 1)
    }
    return weekDays.join(',')
}""")
private external fun getLocalDayOfWeekNamesJs(format: String): String

@JsFun("""(format) => {
    var formatter = new Intl.DateTimeFormat(navigator.language, { month: format })
    var months = []
    for (var month = 0; month < 12; month++) {
        var testDate = new Date(Date.UTC(2000, month, 1, 0, 0, 0))
        months.push(formatter.format(testDate))
    }
    return months.join(',')
}""")
private external fun getLocalMonthNamesJs(format: String): String

@JsFun("""() => {
    var result = null
    try {
        var weekInfo = new Intl.Locale(navigator.language).getWeekInfo()
        var firstDay = weekInfo.firstDay
        result = firstDay % 7 + 1
    } catch(e) { }
    return result
}""")
private external fun getLocalFirstDayOfWeekJs(): Int?

internal actual fun getLocalLocaleIdentifier(): String =
    getLocalLocaleIdentifierJs()

internal actual fun getLocalCalendarData(): PlatformCalendarData =
    createPlatformCalendarData(
        identifier = getLocalLocaleIdentifier(),
        fieldOrder = getLocalCalendarFieldOrderJs()
            .split(',')
            .mapNotNull(::platformCalendarFieldFromJsType),
        monthNames = getLocalMonthNames(LocalMonthNameStyle.Full)
    )

internal actual fun getLocalDayOfWeekNames(): List<String> =
    getLocalDayOfWeekNamesJs("short").split(",")

internal actual fun getLocalMonthNames(style: LocalMonthNameStyle): List<String> =
    getLocalMonthNamesJs(
        when (style) {
            LocalMonthNameStyle.Short -> "short"
            LocalMonthNameStyle.Full -> "long"
        }
    ).split(",")

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo
internal actual fun getLocalFirstDayOfWeek(): Int =
    getLocalFirstDayOfWeekJs() ?: fallbackGetLocalFistDayOfWeek(getLocalLocaleIdentifier())

private fun platformCalendarFieldFromJsType(type: String): PlatformCalendarField? = when (type) {
    "day" -> PlatformCalendarField.Day
    "month" -> PlatformCalendarField.Month
    "year" -> PlatformCalendarField.Year
    else -> null
}

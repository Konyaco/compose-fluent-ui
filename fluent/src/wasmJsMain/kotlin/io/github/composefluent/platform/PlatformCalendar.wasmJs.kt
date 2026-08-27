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
    var formatter = new Intl.DateTimeFormat(navigator.language, { month: format })
    var months = []
    for (var month = 0; month < 12; month++) {
        var testDate = new Date(Date.UTC(2000, month, 1, 0, 0, 0))
        months.push(formatter.format(testDate))
    }
    return months.join(',')
}""")
private external fun getLocalMonthNamesJs(format: String): String

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

internal actual fun getLocalMonthNames(style: LocalMonthNameStyle): List<String> =
    getLocalMonthNamesJs(
        when (style) {
            LocalMonthNameStyle.Short -> "short"
            LocalMonthNameStyle.Full -> "long"
        }
    ).split(",")

private fun platformCalendarFieldFromJsType(type: String): PlatformCalendarField? = when (type) {
    "day" -> PlatformCalendarField.Day
    "month" -> PlatformCalendarField.Month
    "year" -> PlatformCalendarField.Year
    else -> null
}

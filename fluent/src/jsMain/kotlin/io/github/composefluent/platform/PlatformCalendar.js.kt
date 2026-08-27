package io.github.composefluent.platform

internal actual fun getLocalLocaleIdentifier(): String =
    js("navigator.language") as String

internal actual fun getLocalCalendarData(): PlatformCalendarData {
    val identifier = getLocalLocaleIdentifier()
    val order = (js(
        """
            new Intl.DateTimeFormat(undefined, {
                calendar: 'gregory', timeZone: 'UTC',
                year: 'numeric', month: 'numeric', day: 'numeric'
            }).formatToParts(new Date(Date.UTC(2000, 10, 22)))
                .filter(function(part) {
                    return part.type === 'day' || part.type === 'month' || part.type === 'year'
                })
                .map(function(part) { return part.type })
                .join(',')
        """
    ) as String).split(',').mapNotNull(::platformCalendarFieldFromJsType)
    return createPlatformCalendarData(
        identifier = identifier,
        fieldOrder = order,
        monthNames = getLocalMonthNames(LocalMonthNameStyle.Full)
    )
}

internal actual fun getLocalMonthNames(style: LocalMonthNameStyle): List<String> {
    val jsFun: String = when (style) {
        LocalMonthNameStyle.Short -> js(
            """
                var format = new Intl.DateTimeFormat(navigator.language, { month: 'short' })
                var months = []
                for (var month = 0; month < 12; month++) {
                    var testDate = new Date(Date.UTC(2000, month, 1, 0, 0, 0))
                    months.push(format.format(testDate))
                }
                months.join(",")
            """
        )

        LocalMonthNameStyle.Full -> js(
            """
                var format = new Intl.DateTimeFormat(navigator.language, { month: 'long' })
                var months = []
                for (var month = 0; month < 12; month++) {
                    var testDate = new Date(Date.UTC(2000, month, 1, 0, 0, 0))
                    months.push(format.format(testDate))
                }
                months.join(",")
            """
        )
    }

    return jsFun.split(",")
}

private fun platformCalendarFieldFromJsType(type: String): PlatformCalendarField? = when (type) {
    "day" -> PlatformCalendarField.Day
    "month" -> PlatformCalendarField.Month
    "year" -> PlatformCalendarField.Year
    else -> null
}

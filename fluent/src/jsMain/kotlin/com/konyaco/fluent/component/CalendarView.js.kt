package com.konyaco.fluent.component

internal actual fun getLocalDayOfWeekNames(): List<String> {
    val jsFun: String = js(
        """
            var format = new Intl.DateTimeFormat(navigator.language, { weekday: 'short' })
            var baseDate = new Date(Date.UTC(2017, 0, 1)) // just a Sunday
            var weekDays = []
            for (var day = 0; day < 7; day++) {      
                weekDays.push(format.format(baseDate))
                baseDate.setDate(baseDate.getDate() + 1)
            }
            weekDays.join(",")
        """
    )

    return jsFun.split(",")
}

internal actual fun getLocalMonthNames(): List<String> {
    val jsFun: String = js(
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

    return jsFun.split(",")
}

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo
internal actual fun getLocalFirstDayOfWeek(): Int {
    // zh-CN -> 1 -> Monday -> 2
    // en-US -> 7 -> Sunday -> 1
    val language = js("navigator.language") as String
    val result = js("""
        var result = null
        try {
            var weekInfo = new Intl.Locale(navigator.language).getWeekInfo()
            var firstDay  = weekInfo.firstDay
            result = firstDay % 7 + 1
        } catch(e) { }
        result
    """) as Int? ?: fallbackGetLocalFistDayOfWeek(language)
    return result
}
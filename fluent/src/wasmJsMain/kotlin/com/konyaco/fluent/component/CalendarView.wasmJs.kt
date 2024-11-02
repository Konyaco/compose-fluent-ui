package com.konyaco.fluent.component

@JsFun("""(style) => {
    var format = new Intl.DateTimeFormat(navigator.language, { weekday: style })
    var baseDate = new Date(Date.UTC(2017, 0, 1)) // just a Sunday
    var weekDays = []
    for (var day = 0; day < 7; day++) {      
        weekDays.push(format.format(baseDate))
        baseDate.setDate(baseDate.getDate() + 1)
    }
    return weekDays.join(",")
}""")
private external fun getJsLocalDayOfWeekNames(format: String): String

internal actual fun getLocalDayOfWeekNames() =
    getJsLocalDayOfWeekNames("short").split(",")

@JsFun("""(style) => {
    var format = new Intl.DateTimeFormat(navigator.language, { month: style })
    var months = []
    for (var month = 0; month < 12; month++) {
        var testDate = new Date(Date.UTC(2000, month, 1, 0, 0, 0))
        months.push(format.format(testDate))
    }
    return months.join(",")
}""")
private external fun getJsLocalMonthNames(format: String): String

internal actual fun getLocalMonthNames(): List<String> =
    getJsLocalMonthNames("short").split(",")

// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo
internal actual fun getLocalFirstDayOfWeek(): Int {
    return getJsLocalFirstDayOfWeek() ?: fallbackGetLocalFistDayOfWeek(getJsLanguage())
}

@JsFun("""() => {
    var result = null
    try {
        var weekInfo = new Intl.Locale(navigator.language).getWeekInfo()
        var firstDay  = weekInfo.firstDay
        result = firstDay % 7 + 1
    } catch(e) { }
    return result
}""")
private external fun getJsLocalFirstDayOfWeek(): Int?

@JsFun("""() => navigator.language""")
private external fun getJsLanguage(): String
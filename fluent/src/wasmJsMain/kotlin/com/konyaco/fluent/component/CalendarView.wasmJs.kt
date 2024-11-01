package com.konyaco.fluent.component

@JsFun("""(style) => {
    var format = new Intl.DateTimeFormat(navigator.language, { weekday: style })
    var baseDate = new Date(Date.UTC(2017, 0, 2)) // just a Monday
    var weekDays = []
    for (var day = 0; day < 7; day++) {
        baseDate.setDate(baseDate.getDate() + day)      
        weekDays.push(format.format(baseDate))
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

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo
internal actual fun getLocalFirstDayOfWeek() = 1
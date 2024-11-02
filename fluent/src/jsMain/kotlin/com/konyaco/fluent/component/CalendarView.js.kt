package com.konyaco.fluent.component

internal actual fun getLocalDayOfWeekNames(): List<String> {
    val jsFun: String = js(
        """
            var format = new Intl.DateTimeFormat(navigator.language, { weekday: 'short' })
            var baseDate = new Date(Date.UTC(2017, 0, 2)) // just a Monday
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

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Locale/getWeekInfo
internal actual fun getLocalFirstDayOfWeek() = 2 //the same as jvm
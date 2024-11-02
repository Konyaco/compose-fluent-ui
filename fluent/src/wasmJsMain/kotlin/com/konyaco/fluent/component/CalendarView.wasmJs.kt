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

private val localeToFirstDayMap by lazy {
    mapOf(
        "en-US" to 0, // Sunday
        "en-GB" to 1, // Monday
        "zh-CN" to 1, // Monday
        "fr-FR" to 1, // Monday
        "de-DE" to 1, // Monday
        "es-ES" to 1, // Monday
        "it-IT" to 1, // Monday
        "ja-JP" to 0, // Sunday
        "ko-KR" to 0, // Sunday
        "ru-RU" to 1, // Monday
        "ar-SA" to 6, // Saturday
        "he-IL" to 0, // Sunday
        "af-ZA" to 0, // Sunday
        "am-ET" to 1, // Monday
        "as-IN" to 1, // Monday
        "az-Cyrl" to 1, // Monday
        "az-Latn" to 1, // Monday
        "be-BY" to 1, // Monday
        "bn-BD" to 1, // Monday
        "bn-IN" to 1, // Monday
        "bs-Cyrl" to 1, // Monday
        "bs-Latn" to 1, // Monday
        "ca-ES" to 1, // Monday
        "ce-RU" to 1, // Monday
        "cs-CZ" to 1, // Monday
        "cy-GB" to 1, // Monday
        "da-DK" to 1, // Monday
        "de-AT" to 1, // Monday
        "de-LI" to 1, // Monday
        "de-LU" to 1, // Monday
        "el-CY" to 1, // Monday
        "el-GR" to 1, // Monday
        "en-CA" to 0, // Sunday
        "en-IN" to 0, // Sunday
        "en-IE" to 1, // Monday
        "es-MX" to 1, // Monday
        "es-US" to 1, // Monday
        "et-EE" to 1, // Monday
        "eu-ES" to 1, // Monday
        "fa-IR" to 6, // Saturday
        "fi-FI" to 1, // Monday
        "fr-CA" to 1, // Monday
        "ga-IE" to 1, // Monday
        "gd-GB" to 1, // Monday
        "gl-ES" to 1, // Monday
        "gu-IN" to 1, // Monday
        "he-IL" to 0, // Sunday
        "hi-IN" to 1, // Monday
        "hr-HR" to 1, // Monday
        "hu-HU" to 1, // Monday
        "hy-AM" to 1, // Monday
        "id-ID" to 1, // Monday
        "is-IS" to 1, // Monday
        "it-CH" to 1, // Monday
        "iw-IL" to 0, // Sunday
        "ja-JP" to 0, // Sunday
        "ka-GE" to 1, // Monday
        "kk-KZ" to 1, // Monday
        "km-KH" to 1, // Monday
        "kn-IN" to 1, // Monday
        "ko-KR" to 0, // Sunday
        "ky-KG" to 1, // Monday
        "lo-LA" to 1, // Monday
        "lt-LT" to 1, // Monday
        "lv-LV" to 1, // Monday
        "mk-MK" to 1, // Monday
        "ml-IN" to 1, // Monday
        "mn-MN" to 1, // Monday
        "mr-IN" to 1, // Monday
        "ms-MY" to 1, // Monday
        "mt-MT" to 1, // Monday
        "ne-NP" to 1, // Monday
        "nl-BE" to 1, // Monday
        "nl-NL" to 1, // Monday
        "no-NO" to 1, // Monday
        "pa-IN" to 1, // Monday
        "pl-PL" to 1, // Monday
        "pt-BR" to 1, // Monday
        "pt-PT" to 1, // Monday
        "ro-RO" to 1, // Monday
        "ru-RU" to 1, // Monday
        "si-LK" to 1, // Monday
        "sk-SK" to 1, // Monday
        "sl-SI" to 1, // Monday
        "sq-AL" to 1, // Monday
        "sr-Cyrl" to 1, // Monday
        "sr-Latn" to 1, // Monday
        "sv-SE" to 1, // Monday
        "sw-KE" to 1, // Monday
        "ta-IN" to 1, // Monday
        "te-IN" to 1, // Monday
        "th-TH" to 1, // Monday
        "tr-TR" to 1, // Monday
        "uk-UA" to 1, // Monday
        "ur-PK" to 1, // Monday
        "uz-Cyrl" to 1, // Monday
        "vi-VN" to 1, // Monday
        "zh-HK" to 1, // Monday
        "zh-MO" to 1, // Monday
        "zh-SG" to 1, // Monday
        "zh-TW" to 1, // Monday
    )
}

private const val defaultFirstDay = 1

// Workaround for Firefox
private fun fallbackGetLocalFistDayOfWeek(locale: String): Int {
    return localeToFirstDayMap.getOrElse(locale) { defaultFirstDay } + 1
}
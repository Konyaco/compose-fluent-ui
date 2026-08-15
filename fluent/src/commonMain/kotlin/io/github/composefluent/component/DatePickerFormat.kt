package io.github.composefluent.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisallowComposableCalls
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import kotlinx.datetime.LocalDate
import kotlinx.datetime.format.DateTimeFormat
import kotlinx.datetime.format.MonthNames
import kotlinx.datetime.format.Padding

/** Identifies a field displayed by a [DatePicker]. */
enum class DatePickerField {
    /** The day-of-month field. */
    Day,

    /** The month field. */
    Month,

    /** The year field. */
    Year
}

/**
 * Describes the visible fields, order, labels, and item text used by a [DatePicker].
 *
 * Instances are immutable. When constructing a format inside a composable function, remember the
 * returned value to avoid rebuilding the DSL during every recomposition. Prefer
 * [rememberDatePickerFormat] when the format uses [DatePickerFormatBuilder.default], because it
 * also updates the format when the platform locale changes.
 */
@Immutable
class DatePickerFormat internal constructor(
    internal val fields: List<DatePickerFieldFormat>
)

/**
 * Builds a [DatePickerFormat].
 *
 * This factory is useful outside composition. Inside a composable function, wrap it in [remember]
 * or use [rememberDatePickerFormat] to avoid executing [builder] and creating formatters again on
 * every recomposition.
 *
 * @param builder The configuration applied to the new format.
 * @throws IllegalArgumentException If no field is visible, an explicit field order is invalid,
 * or a visible field has a non-positive or non-finite weight.
 */
fun DatePickerFormat(
    builder: DatePickerFormatBuilder.() -> Unit
): DatePickerFormat = DatePickerFormatBuilder(getLocalCalendarData())
    .apply(builder)
    .build()

/**
 * Builds and remembers an immutable [DatePickerFormat].
 *
 * The platform locale identifier and every value in [keys] participate in the remembered identity.
 * Values captured by [builder] that can change must also be supplied in [keys]; otherwise the
 * remembered format intentionally keeps the configuration from the composition in which it was
 * created.
 *
 * @param keys Values whose changes should rebuild the format.
 * @param builder The non-composable configuration applied when a new format is required.
 * @throws IllegalArgumentException If no field is visible, an explicit field order is invalid,
 * or a visible field has a non-positive or non-finite weight.
 */
@Composable
fun rememberDatePickerFormat(
    vararg keys: Any?,
    builder: @DisallowComposableCalls DatePickerFormatBuilder.() -> Unit
): DatePickerFormat {
    val localeIdentifier = getLocalLocaleIdentifier()
    return remember(localeIdentifier, *keys) {
        DatePickerFormatBuilder(getLocalCalendarData()).apply(builder).build()
    }
}

/** Receiver used to build a [DatePickerFormat]. */
class DatePickerFormatBuilder internal constructor(
    private val calendarData: PlatformCalendarData
) {
    private val fieldFormats = mutableMapOf<DatePickerField, MutableDatePickerFieldFormat>()
    private val fieldOrder = mutableListOf<DatePickerField>()
    private var explicitOrder: List<DatePickerField>? = null
    private val localizedMonthNames = MonthNames(calendarData.monthNames)

    /**
     * Inserts all date fields using the platform locale's order and month names, together with
     * localized field labels where available.
     *
     * Calling a field function after `default()` updates that field without moving it. Calling
     * `default()` after field functions preserves their settings but resets their order to the
     * platform default.
     */
    fun default() {
        calendarData.fieldOrder.forEach { calendarField ->
            val field = calendarField.toDatePickerField()
            fieldFormats.getOrPut(field) { defaultFormat(field) }
        }
        fieldOrder.clear()
        fieldOrder.addAll(calendarData.fieldOrder.map(PlatformCalendarField::toDatePickerField))
        explicitOrder = null
    }

    /** Adds or updates the day field without moving an existing field. */
    fun day(block: DatePickerFieldFormatBuilder.() -> Unit = {}) {
        configure(DatePickerField.Day, block)
    }

    /** Adds or updates the month field without moving an existing field. */
    fun month(block: DatePickerFieldFormatBuilder.() -> Unit = {}) {
        configure(DatePickerField.Month, block)
    }

    /** Adds or updates the year field without moving an existing field. */
    fun year(block: DatePickerFieldFormatBuilder.() -> Unit = {}) {
        configure(DatePickerField.Year, block)
    }

    /**
     * Sets the final order of all visible fields.
     *
     * [fields] must contain every visible field exactly once and must not contain hidden fields.
     * Validation is performed after the complete DSL block has run, so visibility can be changed
     * before or after this call.
     */
    fun order(vararg fields: DatePickerField) {
        explicitOrder = fields.toList()
    }

    internal fun build(): DatePickerFormat {
        val visibleFields = fieldFormats
            .filterValues { it.visible }
            .keys
        require(visibleFields.isNotEmpty()) {
            "DatePickerFormat must contain at least one visible field"
        }
        visibleFields.forEach { field ->
            val weight = checkNotNull(fieldFormats[field]).weight
            require(weight.isFinite() && weight > 0f) {
                "DatePickerFormat weight for $field must be finite and greater than 0, " +
                    "was $weight"
            }
        }

        val resolvedOrder = explicitOrder?.also { order ->
            require(order.size == order.toSet().size) {
                "DatePickerFormat order must not contain duplicate fields"
            }
            require(order.toSet() == visibleFields) {
                "DatePickerFormat order must contain every visible field exactly once"
            }
        } ?: fieldOrder.filter { it in visibleFields }

        return DatePickerFormat(
            resolvedOrder.map { field ->
                val fieldFormat = checkNotNull(fieldFormats[field])
                DatePickerFieldFormat(
                    field = field,
                    label = fieldFormat.label,
                    contentFormat = fieldFormat.contentFormat,
                    weight = fieldFormat.weight
                )
            }
        )
    }

    private fun configure(
        field: DatePickerField,
        block: DatePickerFieldFormatBuilder.() -> Unit
    ) {
        val current = fieldFormats.getOrPut(field) {
            fieldOrder += field
            defaultFormat(field)
        }
        val builder = DatePickerFieldFormatBuilder(
            visible = current.visible,
            label = current.label,
            contentFormat = current.contentFormat,
            weight = current.weight
        ).apply(block)
        fieldFormats[field] = MutableDatePickerFieldFormat(
            visible = builder.visible,
            label = builder.label,
            contentFormat = builder.contentFormat,
            weight = builder.weight
        )
    }

    private fun defaultFormat(field: DatePickerField): MutableDatePickerFieldFormat {
        val calendarField = field.toPlatformCalendarField()
        return MutableDatePickerFieldFormat(
            visible = true,
            label = checkNotNull(calendarData.fieldLabels[calendarField]),
            contentFormat = when (field) {
                DatePickerField.Day -> LocalDate.Format { day(Padding.NONE) }
                DatePickerField.Month -> LocalDate.Format { monthName(localizedMonthNames) }
                DatePickerField.Year -> LocalDate.Format { year() }
            },
            weight = 1f
        )
    }
}

/** Configures one field in a [DatePickerFormat]. */
class DatePickerFieldFormatBuilder internal constructor(
    /** Whether this field is shown by the picker. */
    var visible: Boolean,

    /**
     * The visible field label and accessible name of its wheel.
     *
     * The same label is displayed by the selection button when its value is `null`.
     */
    var label: String,

    /**
     * Formats a wheel item and a selected value.
     *
     * The formatter receives the complete date that selecting the item would produce. It can
     * therefore include related information, such as formatting a day as `3 (Thu)`.
     */
    var contentFormat: DateTimeFormat<LocalDate>,

    /**
     * Relative horizontal space assigned to this field in the DatePicker.
     *
     * The default value is `1f`. Increase it when the field content, such as a localized month
     * name, needs more room than the other fields. The value must be finite and greater than zero.
     */
    var weight: Float = 1f
)

/** Defaults shared by DatePicker APIs. */
object DatePickerDefaults {
    /** Returns a remembered format that follows the current platform locale. */
    @Composable
    fun format(): DatePickerFormat = rememberDatePickerFormat {
        default()
    }

    /** Returns January 1 of the year 100 years before the current year. */
    fun minimumDate(): LocalDate = defaultDatePickerMinimumDate()

    /** Returns December 31 of the year 100 years after the current year. */
    fun maximumDate(): LocalDate = defaultDatePickerMaximumDate()
}

@Immutable
internal data class DatePickerFieldFormat(
    val field: DatePickerField,
    val label: String,
    val contentFormat: DateTimeFormat<LocalDate>,
    val weight: Float
)

internal data class MutableDatePickerFieldFormat(
    val visible: Boolean,
    val label: String,
    val contentFormat: DateTimeFormat<LocalDate>,
    val weight: Float
)

private fun DatePickerField.toPlatformCalendarField(): PlatformCalendarField = when (this) {
    DatePickerField.Day -> PlatformCalendarField.Day
    DatePickerField.Month -> PlatformCalendarField.Month
    DatePickerField.Year -> PlatformCalendarField.Year
}

private fun PlatformCalendarField.toDatePickerField(): DatePickerField = when (this) {
    PlatformCalendarField.Day -> DatePickerField.Day
    PlatformCalendarField.Month -> DatePickerField.Month
    PlatformCalendarField.Year -> DatePickerField.Year
}

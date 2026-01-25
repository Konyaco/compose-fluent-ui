package io.github.composefluent.gallery.component

import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import io.github.composefluent.component.Text
import io.github.composefluent.gallery.LocalStore
import dev.snipme.highlights.Highlights
import dev.snipme.highlights.model.BoldHighlight
import dev.snipme.highlights.model.ColorHighlight
import dev.snipme.highlights.model.SyntaxLanguage
import dev.snipme.highlights.model.SyntaxThemes

@Composable
fun SourceCode(code: String, language: SyntaxLanguage = SyntaxLanguage.KOTLIN, modifier: Modifier = Modifier) {
    SelectionContainer {
        val isDark = LocalStore.current.darkMode
        val highLights = remember(code, language, isDark) {
            Highlights.Builder()
                .code(code)
                .language(language)
                .theme(SyntaxThemes.default(isDark))
                .build()
                .getHighlights()
        }
        val codeAnnotatedString = buildAnnotatedString {
            append(code)
            highLights.forEach {
                when(it) {
                    is ColorHighlight -> addStyle(
                        style = SpanStyle(color = Color(it.rgb).copy(1f)),
                        start = it.location.start,
                        end = it.location.end
                    )
                    is BoldHighlight -> addStyle(
                        style = SpanStyle(fontWeight = FontWeight.Bold),
                        start = it.location.start,
                        end = it.location.end
                    )
                }
            }

        }
        Text(
            modifier = modifier,
            text = codeAnnotatedString,
            fontFamily = FontFamily.Monospace,
            overflow = TextOverflow.Visible
        )
    }
}
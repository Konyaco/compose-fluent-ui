/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.ide.common.vectordrawable;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;

/** Methods for converting SVG color values to vector drawable format. */
public class SvgColor {
    /** Color table from https://www.w3.org/TR/SVG11/types.html#ColorKeywords. */
    private static final ImmutableMap<String, String> colorMap =
            ImmutableMap.<String, String>builder()
                    .put("aliceblue", "#f0f8ff")
                    .put("antiquewhite", "#faebd7")
                    .put("aqua", "#00ffff")
                    .put("aquamarine", "#7fffd4")
                    .put("azure", "#f0ffff")
                    .put("beige", "#f5f5dc")
                    .put("bisque", "#ffe4c4")
                    .put("black", "#000000")
                    .put("blanchedalmond", "#ffebcd")
                    .put("blue", "#0000ff")
                    .put("blueviolet", "#8a2be2")
                    .put("brown", "#a52a2a")
                    .put("burlywood", "#deb887")
                    .put("cadetblue", "#5f9ea0")
                    .put("chartreuse", "#7fff00")
                    .put("chocolate", "#d2691e")
                    .put("coral", "#ff7f50")
                    .put("cornflowerblue", "#6495ed")
                    .put("cornsilk", "#fff8dc")
                    .put("crimson", "#dc143c")
                    .put("cyan", "#00ffff")
                    .put("darkblue", "#00008b")
                    .put("darkcyan", "#008b8b")
                    .put("darkgoldenrod", "#b8860b")
                    .put("darkgray", "#a9a9a9")
                    .put("darkgrey", "#a9a9a9")
                    .put("darkgreen", "#006400")
                    .put("darkkhaki", "#bdb76b")
                    .put("darkmagenta", "#8b008b")
                    .put("darkolivegreen", "#556b2f")
                    .put("darkorange", "#ff8c00")
                    .put("darkorchid", "#9932cc")
                    .put("darkred", "#8b0000")
                    .put("darksalmon", "#e9967a")
                    .put("darkseagreen", "#8fbc8f")
                    .put("darkslateblue", "#483d8b")
                    .put("darkslategray", "#2f4f4f")
                    .put("darkslategrey", "#2f4f4f")
                    .put("darkturquoise", "#00ced1")
                    .put("darkviolet", "#9400d3")
                    .put("deeppink", "#ff1493")
                    .put("deepskyblue", "#00bfff")
                    .put("dimgray", "#696969")
                    .put("dimgrey", "#696969")
                    .put("dodgerblue", "#1e90ff")
                    .put("firebrick", "#b22222")
                    .put("floralwhite", "#fffaf0")
                    .put("forestgreen", "#228b22")
                    .put("fuchsia", "#ff00ff")
                    .put("gainsboro", "#dcdcdc")
                    .put("ghostwhite", "#f8f8ff")
                    .put("gold", "#ffd700")
                    .put("goldenrod", "#daa520")
                    .put("gray", "#808080")
                    .put("grey", "#808080")
                    .put("green", "#008000")
                    .put("greenyellow", "#adff2f")
                    .put("honeydew", "#f0fff0")
                    .put("hotpink", "#ff69b4")
                    .put("indianred", "#cd5c5c")
                    .put("indigo", "#4b0082")
                    .put("ivory", "#fffff0")
                    .put("khaki", "#f0e68c")
                    .put("lavender", "#e6e6fa")
                    .put("lavenderblush", "#fff0f5")
                    .put("lawngreen", "#7cfc00")
                    .put("lemonchiffon", "#fffacd")
                    .put("lightblue", "#add8e6")
                    .put("lightcoral", "#f08080")
                    .put("lightcyan", "#e0ffff")
                    .put("lightgoldenrodyellow", "#fafad2")
                    .put("lightgray", "#d3d3d3")
                    .put("lightgrey", "#d3d3d3")
                    .put("lightgreen", "#90ee90")
                    .put("lightpink", "#ffb6c1")
                    .put("lightsalmon", "#ffa07a")
                    .put("lightseagreen", "#20b2aa")
                    .put("lightskyblue", "#87cefa")
                    .put("lightslategray", "#778899")
                    .put("lightslategrey", "#778899")
                    .put("lightsteelblue", "#b0c4de")
                    .put("lightyellow", "#ffffe0")
                    .put("lime", "#00ff00")
                    .put("limegreen", "#32cd32")
                    .put("linen", "#faf0e6")
                    .put("magenta", "#ff00ff")
                    .put("maroon", "#800000")
                    .put("mediumaquamarine", "#66cdaa")
                    .put("mediumblue", "#0000cd")
                    .put("mediumorchid", "#ba55d3")
                    .put("mediumpurple", "#9370db")
                    .put("mediumseagreen", "#3cb371")
                    .put("mediumslateblue", "#7b68ee")
                    .put("mediumspringgreen", "#00fa9a")
                    .put("mediumturquoise", "#48d1cc")
                    .put("mediumvioletred", "#c71585")
                    .put("midnightblue", "#191970")
                    .put("mintcream", "#f5fffa")
                    .put("mistyrose", "#ffe4e1")
                    .put("moccasin", "#ffe4b5")
                    .put("navajowhite", "#ffdead")
                    .put("navy", "#000080")
                    .put("oldlace", "#fdf5e6")
                    .put("olive", "#808000")
                    .put("olivedrab", "#6b8e23")
                    .put("orange", "#ffa500")
                    .put("orangered", "#ff4500")
                    .put("orchid", "#da70d6")
                    .put("palegoldenrod", "#eee8aa")
                    .put("palegreen", "#98fb98")
                    .put("paleturquoise", "#afeeee")
                    .put("palevioletred", "#db7093")
                    .put("papayawhip", "#ffefd5")
                    .put("peachpuff", "#ffdab9")
                    .put("peru", "#cd853f")
                    .put("pink", "#ffc0cb")
                    .put("plum", "#dda0dd")
                    .put("powderblue", "#b0e0e6")
                    .put("purple", "#800080")
                    .put("rebeccapurple", "#663399")
                    .put("red", "#ff0000")
                    .put("rosybrown", "#bc8f8f")
                    .put("royalblue", "#4169e1")
                    .put("saddlebrown", "#8b4513")
                    .put("salmon", "#fa8072")
                    .put("sandybrown", "#f4a460")
                    .put("seagreen", "#2e8b57")
                    .put("seashell", "#fff5ee")
                    .put("sienna", "#a0522d")
                    .put("silver", "#c0c0c0")
                    .put("skyblue", "#87ceeb")
                    .put("slateblue", "#6a5acd")
                    .put("slategray", "#708090")
                    .put("slategrey", "#708090")
                    .put("snow", "#fffafa")
                    .put("springgreen", "#00ff7f")
                    .put("steelblue", "#4682b4")
                    .put("tan", "#d2b48c")
                    .put("teal", "#008080")
                    .put("thistle", "#d8bfd8")
                    .put("tomato", "#ff6347")
                    .put("turquoise", "#40e0d0")
                    .put("violet", "#ee82ee")
                    .put("wheat", "#f5deb3")
                    .put("white", "#ffffff")
                    .put("whitesmoke", "#f5f5f5")
                    .put("yellow", "#ffff00")
                    .put("yellowgreen", "#9acd32")
                    .build();

    /** Do not instantiate. All methods are static. */
    private SvgColor() {}

    /**
     * Converts an SVG color value to "#RRGGBB" or "#AARRGGBB" format used by vector drawables.
     * The input color value can be "none" and RGB value, e.g. "rgb(255, 0, 0)",
     * "rgba(255, 0, 0, 127)", or a color name defined in
     * https://www.w3.org/TR/SVG11/types.html#ColorKeywords.
     *
     * @param svgColorValue the SVG color value to convert
     * @return the converted value, or null if the given value cannot be interpreted as color
     * @throws IllegalArgumentException if the supplied SVG color value has invalid or unsupported
     *     format
     */
    @Nullable
    protected static String colorSvg2Vd(@NonNull String svgColorValue) {
        String color = svgColorValue.trim();

        if (color.startsWith("#")) {
            return color;
        }

        if ("none".equals(color)) {
            return "#00000000";
        }

        if (color.startsWith("rgb(") && color.endsWith(")")) {
            String rgb = color.substring(4, color.length() - 1);
            String[] numbers = rgb.split(",");
            if (numbers.length != 3) {
                throw new IllegalArgumentException(svgColorValue);
            }
            StringBuilder builder = new StringBuilder(7);
            builder.append("#");
            for (int i = 0; i < 3; i++) {
                int component = getColorComponent(numbers[i].trim(), svgColorValue);
                builder.append(String.format("%02X", component));
            }
            assert builder.length() == 7;
            return builder.toString();
        }

        if (color.startsWith("rgba(") && color.endsWith(")")) {
            String rgb = color.substring(5, color.length() - 1);
            String[] numbers = rgb.split(",");
            if (numbers.length != 4) {
                throw new IllegalArgumentException(svgColorValue);
            }
            StringBuilder builder = new StringBuilder(9);
            builder.append("#");
            for (int i = 0; i < 4; i++) {
                int component = getColorComponent(numbers[(i + 3) % 4].trim(), svgColorValue);
                builder.append(String.format("%02X", component));
            }
            assert builder.length() == 9;
            return builder.toString();
        }

        return colorMap.get(color.toLowerCase(Locale.ENGLISH));
    }

    private static int getColorComponent(
            @NonNull String colorComponent, @NonNull String svgColorValue) {
        try {
            if (colorComponent.endsWith("%")) {
                float value =
                        Float.parseFloat(colorComponent.substring(0, colorComponent.length() - 1));
                return clampColor(Math.round(value * 255.f / 100.f));
            }

            return clampColor(Integer.parseInt(colorComponent));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(svgColorValue);
        }
    }

    private static int clampColor(int val) {
        return Math.max(0, Math.min(255, val));
    }
}

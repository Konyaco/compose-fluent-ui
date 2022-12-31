/*
 * Copyright (C) 2015 The Android Open Source Project
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Utility functions for parsing path information. The implementation details should be the same as
 * the PathParser in Android framework.
 *
 * <p>See https://www.w3.org/TR/SVG/paths.html#PathDataBNF for the pathData syntax.
 */
public class PathParser {
    private static final float[] EMPTY_FLOAT_ARRAY = new float[0];

    private static class ExtractFloatResult {
        /** The end position of the parameter. */
        private int mEndPosition;
        /** Whether there is an explicit separator after the end position or not. */
        private boolean mExplicitSeparator;
    }

    // Do not instantiate.
    private PathParser() {}

    /**
     * Determines the end position of a command parameter.
     *
     * @param s the string to search
     * @param start the position to start searching
     * @param flagMode indicates Boolean flag syntax; a Boolean flag is either "0" or "1" and
     *     doesn't have to be followed by a separator
     * @param result the result of the extraction
     */
    private static void extract(
            @NonNull String s, int start, boolean flagMode, @NonNull ExtractFloatResult result) {
        boolean foundSeparator = false;
        result.mExplicitSeparator = false;
        boolean secondDot = false;
        boolean isExponential = false;
        // Looking for ' ', ',', '.' or '-' from the start.
        int currentIndex = start;
        for (; currentIndex < s.length(); currentIndex++) {
            boolean isPrevExponential = isExponential;
            isExponential = false;
            char currentChar = s.charAt(currentIndex);
            switch (currentChar) {
                case ' ':
                case ',':
                    foundSeparator = true;
                    result.mExplicitSeparator = true;
                    break;
                case '-':
                    // The negative sign following a 'e' or 'E' is not an implicit separator.
                    if (currentIndex != start && !isPrevExponential) {
                        foundSeparator = true;
                    }
                    break;
                case '.':
                    if (secondDot) {
                        // Second dot is an implicit separator.
                        foundSeparator = true;
                    } else {
                        secondDot = true;
                    }
                    break;
                case 'e':
                case 'E':
                    isExponential = true;
                    break;
            }
            if (foundSeparator || flagMode && currentIndex > start) {
                break;
            }
        }
        // When there is nothing found, then we put the end position to the end of the string.
        result.mEndPosition = currentIndex;
    }

    /**
     * Parses the floats in the string this is an optimized version of parseFloat(s.split(",|\\s"));
     *
     * @param s the string containing a command and list of floats
     * @param parseMode
     * @return array of floats
     */
    @NonNull
    private static float[] getFloats(@NonNull String s, @NonNull ParseMode parseMode) {
        char command = s.charAt(0);
        if (command == 'z' || command == 'Z') {
            return EMPTY_FLOAT_ARRAY;
        }
        try {
            boolean arcCommand = command == 'a' || command == 'A';
            float[] results = new float[s.length()];
            int count = 0;
            int startPosition = 1;
            int endPosition;

            ExtractFloatResult result = new ExtractFloatResult();
            int totalLength = s.length();

            // The startPosition should always be the first character of the current number, and
            // endPosition is the character after the current number.
            while (startPosition < totalLength) {
                // In ANDROID parse mode we treat flags as regular floats for compatibility with
                // old vector drawables that may have pathData not conforming to
                // https://www.w3.org/TR/SVG/paths.html#PathDataBNF. In such a case flags may be
                // represented by "1.0" or "0.0" (b/146520216).
                boolean flagMode =
                        parseMode == ParseMode.SVG
                                && arcCommand
                                && (count % 7 == 3 || count % 7 == 4);
                extract(s, startPosition, flagMode, result);
                endPosition = result.mEndPosition;

                if (startPosition < endPosition) {
                    results[count++] = Float.parseFloat(s.substring(startPosition, endPosition));
                }

                if (result.mExplicitSeparator) {
                    startPosition = endPosition + 1;
                } else {
                    startPosition = endPosition;
                }
            }
            return Arrays.copyOfRange(results, 0, count);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Error in parsing \"" + s + "\"", e);
        }
    }

    private static void addNode(@NonNull List<VdPath.Node> list, char cmd, @NonNull float[] val) {
        list.add(new VdPath.Node(cmd, val));
    }

    private static int nextStart(@NonNull String s, int end) {
        while (end < s.length()) {
            char c = s.charAt(end);
            // Note that 'e' or 'E' are not valid path commands, but could be used for floating
            // point numbers' scientific notation. Therefore, when searching for next command, we
            // should ignore 'e' and 'E'.
            if ('A' <= c && c <= 'Z' && c != 'E' || 'a' <= c && c <= 'z' && c != 'e') {
                return end;
            }
            end++;
        }
        return end;
    }

    @NonNull
    public static VdPath.Node[] parsePath(@NonNull String value, @NonNull ParseMode mode) {
        value = value.trim();
        List<VdPath.Node> list = new ArrayList<>();

        int start = 0;
        int end = 1;
        while (end < value.length()) {
            end = nextStart(value, end);
            String s = value.substring(start, end);
            char currentCommand = s.charAt(0);
            float[] val = getFloats(s, mode);

            if (start == 0) {
                // For the starting command, special handling: add M 0 0 if there is none.
                // This is good for transformation.
                if (currentCommand != 'M' && currentCommand != 'm') {
                    addNode(list, 'M', new float[2]);
                }
            }
            addNode(list, currentCommand, val);

            start = end;
            end++;
        }
        if (end - start == 1 && start < value.length()) {
            addNode(list, value.charAt(start), EMPTY_FLOAT_ARRAY);
        }
        return list.toArray(new VdPath.Node[0]);
    }

    public enum ParseMode {
        SVG,
        ANDROID
    }
}

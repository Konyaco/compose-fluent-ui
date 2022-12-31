/*
 * Copyright (C) 2017 The Android Open Source Project
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

/** Represents an SVG gradient stop or Android's GradientColorItem. */
public class GradientStop {
    private String color;
    private String offset;
    private String opacity = "";

    GradientStop(@NonNull String color, @NonNull String offset) {
        this.color = color;
        this.offset = offset;
    }

    @NonNull
    String getColor() {
        return color;
    }

    @NonNull
    String getOffset() {
        return offset;
    }

    @NonNull
    String getOpacity() {
        return opacity;
    }

    protected void setOpacity(@NonNull String opacity) {
        this.opacity = opacity;
    }
}

// Copyright (C) 2017 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.android.ide.common.vectordrawable

import java.awt.Color

/**
 * Represents override information for VectorDrawable's XML file content.
 */
data class VdOverrideInfo(var width: Double, var height: Double, var tint: Color?, var alpha: Double,
        var autoMirrored: Boolean) {
    /** Checks if the width needs to be overridden. */
    fun needsOverrideWidth(): Boolean {
        return width > 0
    }

    /** Checks if the height needs to be overridden. */
    fun needsOverrideHeight(): Boolean {
        return height > 0
    }

    /** Checks if the alpha needs to be overridden. */
    fun needsOverrideAlpha(): Boolean {
        return 0 <= alpha && alpha < 1
    }

    /** Checks if the tint needs to be overridden. */
    fun needsOverrideTint(): Boolean {
        return tintRgb() != 0
    }

    /** Returns the RGB value of the tint. */
    fun tintRgb(): Int {
        return (tint?.rgb ?: 0) and 0xFFFFFF
    }
}

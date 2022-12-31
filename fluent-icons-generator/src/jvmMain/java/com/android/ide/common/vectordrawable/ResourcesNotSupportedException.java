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

/**
 * Indicates that the input vector drawable XML file included references to other Android resources.
 */
public class ResourcesNotSupportedException extends RuntimeException {
    private final String name;
    private final String value;

    public ResourcesNotSupportedException(@NonNull String name, @NonNull String value) {
        super(String.format("Cannot process attribute %1$s=\"%2$s\"", name, value));
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}

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
import com.android.annotations.Nullable;
import com.android.utils.PositionXmlParser;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 * Parses a VectorDrawable's XML file, and generate an internal tree representation,
 * which can be used for drawing / previewing.
 */
class VdParser {
    // Note that the incoming file is an VectorDrawable's XML file, not an SVG.
    @NonNull
    public static VdTree parse(@NonNull InputStream stream, @Nullable StringBuilder vdErrorLog) {
        final VdTree tree = new VdTree();
        try {
            Document doc = PositionXmlParser.parse(stream, true);
            tree.parse(doc);
        }
        catch (ParserConfigurationException | SAXException | IOException e) {
            if (vdErrorLog != null) {
                vdErrorLog.append(e.getMessage());
            }
        }
        return tree;
    }
}

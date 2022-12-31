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

import static com.android.SdkConstants.DOT_XML;
import static java.awt.RenderingHints.KEY_ANTIALIASING;
import static java.awt.RenderingHints.KEY_TEXT_ANTIALIASING;
import static java.awt.RenderingHints.VALUE_ANTIALIAS_ON;
import static java.awt.RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.ide.common.util.AssetUtil;
import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import javax.swing.Icon;

/**
 * VdIcon wraps every vector drawable from Material Library into an icon. All of them are shown in
 * a table for developer to pick.
 */
public class VdIcon implements Icon, Comparable<VdIcon> {
    /** Common prefix for most of the vector icons */
    private static final String ICON_PREFIX = "ic_";

    /** Common prefix for material icons */
    private static final String FILLED_PREFIX = "baseline_";

    /** Common prefix for material icons */
    private static final String OUTLINE_PREFIX = "outline_";

    /** Common prefix for material icons */
    private static final String ROUND_PREFIX = "round_";

    /** Common prefix for material icons */
    private static final String SHARP_PREFIX = "sharp_";

    /** Common prefix for material icons */
    private static final String TWO_TONE_PREFIX = "twotone_";

    /** Common suffix for most of the vector icons */
    private static final String ICON_SUFFIX = "_24.xml";

    /** Distance between the icon and the label */
    public static final int LABEL_GAP = 10;

    private final VdTree mVdTree;

    private final String mName;

    private final URL mUrl;

    private boolean mDrawCheckerBoardBackground;

    private String mDisplayName;

    private boolean mShowName;

    private final Rectangle myRectangle = new Rectangle();

    private final int mWidth;

    private final int mHeight;

    private final Color mBackground;

    @SuppressWarnings({"InspectionUsingGrayColors", "UseJBColor"})
    private static final Color CHECKER_COLOR = new Color(238, 238, 238);

    private static final byte[] COLOR_INVERSION_TABLE = new byte[256];
    static {
        for (int counter = 0; counter < 256; counter++) {
            COLOR_INVERSION_TABLE[counter] = (byte) (3 * (255 - counter) / 4);
        }
    }

    public VdIcon(@NonNull URL url) throws IOException {
        this(url, 0, 0);
    }

    public VdIcon(@NonNull URL url, int width, int height) throws IOException {
        mVdTree = parseVdTree(url);
        mUrl = url;
        String fileName = url.getFile();
        mName = fileName.substring(fileName.lastIndexOf('/') + 1);
        if (width != 0 && height != 0) {
            mWidth = width;
            mHeight = height;
        }
        else {
            mWidth = (int)mVdTree.getPortWidth();
            mHeight = (int)mVdTree.getPortHeight();
        }
        mBackground = null;
    }

    public VdIcon(VdIcon icon, Color background) {
        mVdTree = icon.mVdTree;
        mUrl = icon.mUrl;
        mName = icon.mName;
        mWidth = icon.mWidth;
        mHeight = icon.mHeight;
        mBackground = background;
    }

    @NonNull
    public String getName() {
        return mName;
    }

    @NonNull
    public String getDisplayName() {
        if (mDisplayName == null) {
            // Turn a filename into a reasonable display name, similar to what
            // is shown on https://design.google.com/icons/ . For example, change
            // "ic_supervisor_account_black_24dp.xml" into "supervisor account"
            int begin = 0;
            if (mName.startsWith(ICON_PREFIX)) {
                begin = ICON_PREFIX.length();
            } else if (mName.startsWith(FILLED_PREFIX)) {
                begin = FILLED_PREFIX.length();
            } else if (mName.startsWith(OUTLINE_PREFIX)) {
                begin = OUTLINE_PREFIX.length();
            } else if (mName.startsWith(ROUND_PREFIX)) {
                begin = ROUND_PREFIX.length();
            } else if (mName.startsWith(SHARP_PREFIX)) {
                begin = SHARP_PREFIX.length();
            } else if (mName.startsWith(TWO_TONE_PREFIX)) {
                begin = TWO_TONE_PREFIX.length();
            }

            int end = mName.length();
            if (mName.endsWith(ICON_SUFFIX)) {
                end -= ICON_SUFFIX.length();
            } else if (mName.endsWith(DOT_XML)) {
                end -= DOT_XML.length();
            }
            mDisplayName = mName.substring(begin, end).replace('_', ' ');
        }

        return mDisplayName;
    }

    public URL getURL() {
        return mUrl;
    }

    /**
     * Returns the icon image.
     *
     * @param width the width of the image
     * @param height the height of the image
     */
    @Nullable
    public BufferedImage renderIcon(int width, int height) {
        if (mVdTree == null) {
            return null;
        }
        if (width <= 0 || height <= 0) {
            width = Math.round(mVdTree.getBaseWidth());
            height = Math.round(mVdTree.getBaseHeight());
        }
        BufferedImage image = AssetUtil.newArgbBufferedImage(width, height);
        mVdTree.drawIntoImage(image);
        return image;
    }

    @NonNull
    private static VdTree parseVdTree(URL url) throws IOException {
        return VdParser.parse(url.openStream(), null);
    }

    /**
     * TODO: Merge this code back with GraphicsUtil in idea.
     * Paints a checkered board style background. Each grid square is {@code cellSize} pixels.
     */
    public static void paintCheckeredBackground(Graphics g, Color backgroundColor,
                                                Color checkeredColor, Shape clip, int cellSize) {
        final Shape savedClip = g.getClip();
        ((Graphics2D)g).clip(clip);

        final Rectangle rect = clip.getBounds();
        g.setColor(backgroundColor);
        g.fillRect(rect.x, rect.y, rect.width, rect.height);
        g.setColor(checkeredColor);
        for (int dy = 0; dy * cellSize < rect.height; dy++) {
            for (int dx = dy % 2; dx * cellSize < rect.width; dx += 2) {
                g.fillRect(rect.x + dx * cellSize, rect.y + dy * cellSize, cellSize, cellSize);
            }
        }

        g.setClip(savedClip);
    }

    @Override
    public void paintIcon(Component c, Graphics gc, int x, int y) {
        Graphics2D g = (Graphics2D)gc;

        // Draw the checker board first, even when the tree is empty.
        int width = c.getWidth();
        int height = c.getHeight();
        myRectangle.setBounds(0, 0, width, height);
        if (mBackground != null) {
            g.setColor(mBackground);
            g.fillRect(myRectangle.x, myRectangle.y, myRectangle.width, myRectangle.height);
        }
        else if (mDrawCheckerBoardBackground) {
            //noinspection UseJBColor
            paintCheckeredBackground(g, Color.LIGHT_GRAY, CHECKER_COLOR, myRectangle, 8);
        }

        if (mVdTree == null) {
            return;
        }

        // Show label below the icon?
        if (mShowName) {
            // Yes, so set aside space for the label
            FontMetrics fontMetrics = c.getFontMetrics(c.getFont());
            String displayName = getDisplayName();
            Rectangle2D bounds = fontMetrics.getStringBounds(displayName, g);

            height -= (bounds.getHeight() + LABEL_GAP);
            int textX = Math.max(0, (int)(width - bounds.getWidth()) / 2);
            int textY = height + LABEL_GAP;

            final Shape prevClip = g.getClip();
            g.clip(myRectangle);
            g.setColor(c.getForeground());

            // Setup text antialiasing:
            g.setRenderingHint(KEY_ANTIALIASING, VALUE_ANTIALIAS_ON);
            //noinspection HardCodedStringLiteral
            Map map = (Map) Toolkit.getDefaultToolkit().getDesktopProperty("awt.font.desktophints");
            if (map != null) {
                g.addRenderingHints(map);
            } else {
                g.setRenderingHint(KEY_TEXT_ANTIALIASING, VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            }
            g.drawString(displayName, textX, textY);
            g.setClip(prevClip);
        }

        int minSize = Math.min(width, height);
        BufferedImage image = AssetUtil.newArgbBufferedImage(minSize, minSize);
        mVdTree.drawIntoImage(image);

        image = adjustIconColor(c, image);

        // Draw in the center of the component (we've already subtracted out the font height above if showing titles)
        Rectangle rect = new Rectangle(0, 0, width, height);
        AssetUtil.drawCenterInside(g, image, rect);
    }

    /**
     * Adjust the icon color when the icon is intended to be painted on top of the given
     * component. This method will convert the black icons to a light gray icon if it's being
     * painted on a component with a dark background.
     *
     * @param component the component the icon is intended to be painted on top of
     * @param image     the icon image
     * @return the converted image, or the original image if the background is light
     */
    @NonNull
    public static BufferedImage adjustIconColor(@NonNull Component component,
            @NonNull BufferedImage image) {
        Color background = component.getBackground();
        if (background != null && background.getRed() < 128) {
            ByteLookupTable table = new ByteLookupTable(0, COLOR_INVERSION_TABLE);
            BufferedImageOp invertFilter = new LookupOp(table, null);
            image = invertFilter.filter(image, null);
        }

        return image;
    }

    @Override
    public int getIconWidth() {
        return mWidth;
    }

    @Override
    public int getIconHeight() {
        return mHeight;
    }

    @Override
    public int compareTo(@NonNull VdIcon other) {
        return mName.compareTo(other.mName);
    }

    public void enableCheckerBoardBackground(boolean enable) {
        mDrawCheckerBoardBackground = enable;
    }

    /**
     * Whether we should show the title displayed below the image. When this is on, the icon is made
     * smaller to fit the font height.
     */
    public void setShowName(boolean showName) {
        this.mShowName = showName;
    }
}
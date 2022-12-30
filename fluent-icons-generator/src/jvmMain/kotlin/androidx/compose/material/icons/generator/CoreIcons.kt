/*
 * Copyright 2020 The Android Open Source Project
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

package androidx.compose.material.icons.generator

/**
 * List of 'core' icons that will be added to the 'core' icons module, and depended on by
 * material. These icons are the set of most commonly used icons, including icons used by
 * Material components directly (such as the menu icon in an AppBar). All icons not specified
 * here will be generated to the 'extended' icons module.
 */
val CoreIcons = setOf(
    "Add", "AddCircle", "AddSquare", "Album", "Alert", "AppFolder", "AppGeneric", "AppRecent", "Apps", "AppsAddIn",
    "AppsList", "AppsListDetail", "Archive", "ArrowCircleDown", "ArrowCircleDownRight", "ArrowCircleLeft",
    "ArrowCircleRight", "ArrowCircleUp", "ArrowCircleUpLeft", "ArrowClockwise", "ArrowClockwiseDashes",
    "ArrowCounterclockwise", "ArrowCounterclockwiseDashes", "ArrowCurveDownLeft", "ArrowDown", "ArrowDownLeft",
    "ArrowDownload", "ArrowEnterLeft", "ArrowEnterUp", "ArrowExpand", "ArrowExportLtr", "ArrowExportRtl",
    "ArrowExportUp", "ArrowForward", "ArrowHookDownLeft", "ArrowHookDownRight", "ArrowHookUpLeft", "ArrowHookUpRight",
    "ArrowImport", "ArrowLeft", "ArrowMaximize", "ArrowMinimize", "ArrowNext", "ArrowPrevious", "ArrowRedo",
    "ArrowRepeatAll", "ArrowRepeatAllOff", "ArrowReply", "ArrowReplyAll", "ArrowReplyDown", "ArrowReset", "ArrowRight",
    "ArrowSort", "ArrowSortDown", "ArrowSortUp", "ArrowSquareDown", "ArrowSwap", "ArrowSync", "ArrowSyncCircle",
    "ArrowUndo", "ArrowUp", "ArrowUpLeft", "ArrowUpRight", "ArrowUpload", "Attach", "Backspace", "BarcodeScanner",
    "Beaker", "Bed", "Bluetooth", "Board", "Book", "BookOpen", "Bookmark", "BookmarkMultiple", "BorderAll", "Box",
    "Building", "BuildingMultiple", "CalendarLtr", "CalendarRtl", "Call", "Camera", "CaretDown", "CaretDownRight",
    "CaretLeft", "CaretRight", "CaretUp", "Cart", "Cast", "Certificate", "Chat", "ChatMultiple", "Checkmark",
    "CheckmarkCircle", "CheckmarkSquare", "CheckmarkStarburst", "ChevronCircleDown", "ChevronCircleLeft",
    "ChevronCircleRight", "ChevronCircleUp", "ChevronDown", "ChevronLeft", "ChevronRight", "ChevronUp", "ChevronUpDown",
    "Circle", "CircleSmall", "City", "Class", "Clipboard", "ClipboardPaste", "Clock", "ClockAlarm", "ClosedCaption",
    "Cloud", "Code", "Collections", "Color", "Comment", "CommentMultiple", "Communication", "Compose", "ContactCard",
    "ContactCardGroup", "Cookies", "Copy", "Crop", "Cursor", "Cut", "DarkTheme", "DataArea", "DataPie", "DataUsage",
    "Delete", "Desktop", "DesktopMac", "Directions", "Dismiss", "DismissCircle", "DismissSquare", "Diversity",
    "Document", "DocumentCopy", "DocumentMultiple", "Drafts", "Drop", "Earth", "Edit", "Emoji", "Eraser", "ErrorCircle",
    "Eye", "Eyedropper", "Filmstrip", "Filter", "Flag", "Flash", "Folder", "FolderOpen", "Food", "Form",
    "FullScreenMaximize", "FullScreenMinimize", "Games", "Gift", "Glance", "Globe", "Grid", "HandWave", "HatGraduation",
    "HatGraduation", "Headphones", "Heart", "History", "Home", "Image", "ImageCopy", "ImageMultiple", "Important",
    "Info", "IosArrowLtr", "IosArrowRtl", "Key", "Keyboard", "Laptop", "Layer", "LeafTwo", "Library", "Lightbulb",
    "Link", "LocalLanguage", "Location", "LockClosed", "LockOpen", "Mail", "MailInbox", "MailRead", "Map", "Maximize",
    "Mic", "MoreHorizontal", "MoreVertical", "MoviesAndTv", "MusicNote2", "MyLocation", "Navigation", "New", "News",
    "Next", "Note", "Notebook", "NumberSymbol", "Open", "OpenFolder", "Options", "PaintBrush", "Patch", "Pause",
    "Payment", "Pen", "People", "Person", "PersonCircle", "Phone", "Pin", "Play", "PlugConnected", "PlugDisconnected",
    "Poll", "Premium", "Print", "Prohibited", "PuzzlePiece", "Question", "QuestionCircle", "ReOrder",
    "ReOrderDotsHorizontal", "ReOrderDotsVertical", "Receipt", "Record", "Rename", "Resize", "Ribbon", "Save",
    "SaveCopy", "SaveMultiple", "ScanDash", "Search", "SearchSquare", "SelectAllOff", "SelectAllOn", "Send", "SendCopy",
    "Settings", "Share", "ShareAndroid", "ShareIos", "Shield", "Shifts", "ShiftsActivity", "ShoppingBag", "SignOut",
    "Signature", "Sparkle", "Speaker2", "Sport", "Star", "Stop", "Storage", "StyleGuide", "Subtract", "SubtractCircle",
    "SubtractSquare", "Symbols", "System", "Table", "Tablet", "Tag", "TagMultiple", "Target", "TaskListLtr",
    "TaskListRtl", "TaskListSquareLtr", "TaskListSquareRtl", "TextBold", "TextBulletListLtr", "TextBulletListRtl",
    "TextBulletListSquare", "TextItalic", "TextNumberListLtr", "TextNumberListRtl", "TextSortAscending",
    "TextSortDescending", "TextT", "TextUnderline", "ThumbDislike", "ThumbLike", "TicketDiagonal",  "Timer", "Trophy",
    "Tv", "VehicleCar", "Video", "VideoClip", "VideoClipMultiple", "Wallet", "Wand", "Warning", "Wifi1", "Window",
    "Wrench", "XboxController", "ZoomFit", "ZoomIn", "ZoomOut"
)

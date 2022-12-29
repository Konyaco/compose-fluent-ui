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
    "Accept", "Acceptmedium", "Accounts", "Add", "AddTo", "AlertSolid", "AllApps", "Archive", "ArrowDownRight8",
    "ArrowDownRightMirrored8", "ArrowTallDownLeft", "ArrowTallDownRight", "ArrowTallUpLeft", "ArrowTallUpRight",
    "ArrowUpRight8", "Ascending", "Asterisk", "AsteriskSolid", "Attach", "Back", "BarChartVertical", "Blocked12",
    "Blocked2", "Blocked2Solid", "Blocked", "BlockedSite", "BlockedSiteSolid12", "BulletedList2", "BulletedList",
    "BulletedListText", "BulletedTreeList", "Calendar", "Cancel", "Calendar", "CaretBottomLeftSolid8",
    "CaretBottomRightSolid8", "CaretDownSolid8", "CaretLeftSolid8", "CaretRightSolid8", "CaretSolid16",
    "CaretSolidDown", "CaretSolid", "CaretSolidLeft", "CaretSolidMirrored", "CaretSolidRight", "CaretSolidUp",
    "CaretTopLeftSolid8", "CaretTopRightSolid8", "CaretUpSolid8", "CellPhone", "Chart", "Chat", "ChatSolid",
    "CheckList", "CheckMark", "ChevronDownEnd6", "ChevronDown", "ChevronDownMed", "ChevronDownSmall", "ChevronFold10",
    "ChevronLeftEnd6", "ChevronLeft", "ChevronLeftMed", "ChevronLeftSmall", "ChevronRightEnd6", "ChevronRight",
    "ChevronRightMed", "ChevronRightSmall", "ChevronUnfold10", "ChevronUpEnd6", "ChevronUp", "ChevronUpMed",
    "ChevronUpSm", "CircleAddition", "CircleAdditionSolid", "ClearFilter", "Clear", "ClipboardList", "ClipboardSolid",
    "Clock", "CloudWeather", "CollapseMenu", "Color", "ColorSolid", "Completed", "CompletedSolid", "Contact",
    "ContactInfo", "Contrast", "Descending", "Dictionary", "Dislike", "DislikeSolid", "Document", "DoubleBookmark",
    "Down", "DownloadDocument", "Download", "Edit", "ErrorBadge", "Error", "Event", "ExploreContent", "Export",
    "FavoriteStarFill", "FavoriteStar", "Filter", "FilterSolid", "Flag", "FlickDown", "FlickLeft", "FlickRight",
    "FlickUp", "FolderHorizontal", "Folder", "FolderOpen", "Forward", "FullScreen", "FullView", "GiftBoxSolid",
    "Giftbox", "Glimmer", "GlobalNavButton", "Go", "GoMirrored", "GripperBarHorizontal", "GripperBarVertical",
    "GripperDotsVertical", "Group", "HeartFill", "Heart", "Help", "History", "Home", "HomeSolid", "IDBadge",
    "Import", "ImportMirrored", "Important", "InboxCheck", "Inbox", "IncidentTriangle", "Info2", "Info", "InfoSolid",
    "Like", "LikeSolid", "LineChart", "Link12", "Link", "List", "LocaleLanguage", "Location", "LocationOutline",
    "Lock12", "Lock", "LockSolid", "Mail", "MailSolid", "MapPin12", "MapPin", "MapPinSolid", "MessageFill", "Message",
    "Microphone", "MiracastLogoLarge", "More", "MoreVertical", "Nav2DMapView", "NavigateBack", "NavigateExternalInline",
    "NavigateForward", "News", "NumberSymbol", "OpenFile", "OpenFolderHorizontal", "OpenWith", "POI", "POISolid",
    "Package", "Packages", "Page", "PageSolid", "Pause", "PaymentCard", "PenWorkspace", "PeopleAdd", "People",
    "Permissions", "PermissionsSolid", "Phone", "Photo2", "PhotoVideoMedia", "Picture", "Pin", "PinSolid12", "Pinned",
    "PinnedSolid", "Play", "PlaySolid", "PlugConnected", "PlugDisconnected", "Processing", "Product", "PublishContent",
    "Puzzle", "QRCode", "QuickNote", "QuickNoteSolid", "Recent", "Redo", "Refresh", "ReleaseGate", "Repair", "RepeatAll",
    "RepeatOne", "ReplyAll", "Reply", "Reset", "ReturnToSession", "RevToggleKey", "Rotate90Clockwise",
    "Rotate90CounterClockwise", "Rotate", "SaveAll", "SaveAs", "Save", "Search", "Send", "Separator", "ShoppingCart",
    "ShoppingCartSolid", "SingleBookmark", "SingleBookmarkSolid", "SortDown", "Sort", "SortUp", "Switch", "Sync",
    "SyncStatus", "SyncStatusSolid", "System", "TVMonitor", "Tablet", "TagGroup", "Tag", "TagSolid", "TaskList",
    "TestBeaker", "TestBeakerSolid", "Trophy2", "Trophy2Solid", "Trophy", "Undo", "Unknown", "Unlock", "UnlockSolid",
    "Up", "UpdateRestore", "Upload", "Video", "VideoSolid", "View", "Volume2", "Warning", "WarningSolid", "WavingHand",
    "Zoom", "ZoomIn", "ZoomOut"
)

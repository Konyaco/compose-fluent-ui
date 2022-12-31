# Generator

This module generates codes of fluent-icons from svg.

Thanks for the tutorial: https://github.com/DevSrSouza/svg-to-compose

The source code of the tool that converts SVG to XML is from [Android Studio](https://android.googlesource.com/platform/tools/base/+/refs/heads/mirror-goog-studio-master-dev/sdk-common/src/main/java/com/android/ide/common/vectordrawable)

The source code of the tool that converts XML to Kotlin code is from [Jetpack Compose](https://cs.android.com/androidx/platform/frameworks/support/+/androidx-main:compose/material/material/icons/generator/)

1. Save Icons HTML
   1. Access [Fluent UI Catalog](https://react.fluentui.dev/iframe.html?viewMode=docs&id=concepts-developer-icons-icons-catalog--page)
   2. Save page as html to `icons-catalog.html`
   3. Run `ExtractSvgFromCatalogKt`
2. Run `ConvertToXmlKt`
3. Run `ConvertToCodeKt`
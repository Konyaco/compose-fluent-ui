# Converter

This module convert fluent icons from svg to kt code.

https://github.com/DevSrSouza/svg-to-compose

1. Save Icons HTML
   1. Access [Fluent UI Icons](https://developer.microsoft.com/en-us/fluentui#/styles/web/icons#available-icons) and select ***SVG icons*** tab.
   2. Save page as html to `icons.html`
   3. Run `ExtractSvgFromHtmlKt`
2. New Icons
   1. Access https://react.fluentui.dev/iframe.html?viewMode=docs&id=concepts-developer-icons-icons-catalog--page
   2. Save page as html to `icons-catalog.html`
   3. Run `ExtractSvgFromCatalogKt`
3. Run `ConvertToXmlKt`
4. Run `ConvertToCodeKt`
<h1><img src="assets/icon.png" alt="Compose Fluent logo" height="48" valign="middle"> Compose Fluent</h1>

[![License](https://img.shields.io/github/license/compose-fluent/compose-fluent-ui)](LICENSE)
[![Version](https://img.shields.io/github/v/release/compose-fluent/compose-fluent-ui?include_prereleases)](https://github.com/compose-fluent/compose-fluent-ui/releases)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.compose-fluent/fluent)](https://central.sonatype.com/artifact/io.github.compose-fluent/fluent/)
[![Telegram Link](https://img.shields.io/badge/Telegram-compose__fluent__ui-blue?logo=telegram&logoColor=fff)](https://t.me/compose_fluent_ui)

[//]: # ([![Snapshot]&#40;https://img.shields.io/nexus/s/io.github.compose-fluent/fluent?server=https%3A%2F%2Fcentral.sonatype.com&label=snapshot&#41;]&#40;https://central.sonatype.com/service/rest/repository/browse/maven-snapshots/io/github/compose-fluent&#41;)

**Fluent Design** UI library for **Compose Multiplatform**

![Example](assets/screenshot.png)

## Current Status

> This library is experimental, any API would be changed in the future without any notification.

Please note that there are lots of hard-coding and workarounds in our source code, which we plan to eliminate in the future.

Thank you for using our library. We look forward to receiving your feedback and contributions!

### Supported Kotlin Targets

| Target            | Platform              |
|:------------------|:----------------------|
| desktop           | Linux, macOS, Windows |
| iosX64            | iPhone, iPad          |
| iosArm64          | iPhone, iPad          |
| iosSimulatorArm64 | iOS Simulator         |
| androidTarget     | Android Devices       |
| wasmJs            | Web Browsers          |
| js                | Web Browsers          |

## Quick Start

### Add Dependency

```kts
implementation("io.github.compose-fluent:fluent:v0.1.0")
implementation("io.github.compose-fluent:fluent-icons-extended:v0.1.0") // If you want to use full fluent icons.
```

#### Snapshot Versions

Snapshot versions are automatically published from the `dev` branch. To access snapshot artifacts, add the Sonatype snapshot repository to your `build.gradle.kts`:

```kotlin
repositories {
    mavenCentral()
    // Add Sonatype snapshots repository
    maven("https://central.sonatype.com/repository/maven-snapshots/")
}
```

Then specify the snapshot dependency with the `-SNAPSHOT` suffix:

```kotlin
implementation("io.github.compose-fluent:fluent:0.1.0-SNAPSHOT")
```

You can check our latest snapshots at [Maven Central](https://central.sonatype.com/artifact/io.github.compose-fluent/fluent/).

### Example

```kotlin
import io.github.composefluent.component.*

@Composable
fun App() {
  FluentTheme {
    Mica(Modifier.fillMaxSize()) {
      Column(Modifier.padding(24.dp)) {
        Button(onClick = {}) {
          Text("Hello Fluent Design")
        }
      }
    }
  }
}
```
See [`gallery`](gallery) module for more details.

- `FluentTheme()` is the context and entry point of the application, just like `MaterialTheme`
- Components are under `component` package
- `Mica` and `Layer` are under `background` package

## Components

### Layers
- Materials
  - [x] App Layer Mica
  - [x] App Layer Mica Alt
  - [x] App Layer Acrylic Default
  - [x] App Layer Acrylic Base
  - [x] App Layer Accent Acrylic Default
  - [x] App Layer Accent Acrylic Base
  - [x] App Layer Thin Acrylic
  - [ ] Window Layer Mica
  - [ ] Window Layer Acrylic
- Mica
  - [x] Simple Mica
  - [ ] Real Mica
- Layer
  - [x] Simple Layer
  - [ ] Real Layer
- [x] Card

### Basic Components

- [x] Buttons
  - [x] Button
  - [x] Accent Button
  - [x] Subtle Button
  - [x] Dropdown Button
  - [x] Hyperlink Button
  - [x] Repeat Button
  - [x] Toggle Button
  - [x] Split Button
  - [x] Toggle Split Button
- [x] Radio Button
- [x] Toggle Switch
- [x] Check Box
  - [ ] TriState Check Box
- [x] Combo Box (Simple)
- [x] Progress Bar
- [x] Progress Ring
- [x] Slider
- [x] Text Field
- [X] Text

- [x] Color Picker
- [x] Rating Control
- [x] Pill Button
- [x] Segmented Button
- [x] Lite Filter
- [x] List Item
- [x] Grid View Item
- [x] Flip View
- [x] Pips Pager 

### Compound Components

- [x] Calendar View (Simple)
  > If you need running on the Android 7.1 and below, you should enable [core library desugar](https://developer.android.com/studio/write/java8-support#library-desugaring) to avoid crash.
- [x] Date Time Picker (Simple)
- [x] Color Picker
- [ ] Navigation
  - [x] Side Nav
  - [x] Top Nav
  - [x] Navigation View
  - [x] Breadcrumb Bar
  - [ ] Pivot
  - [x] Tab View
  - [x] Selector Bar 
- [x] Tooltip
- [x] Info Bar
- [x] Badge 
- [ ] File Picker
- [x] Menu Bar (Simple)
- [x] MenuFlyout (Simple)
- [x] Expander
- [x] Command Bar
- [x] Command Bar Flyout
- [x] Auto Suggest Box

### Dialogs

- [x] Fluent Dialog
- [x] Content Dialog
- [x] Flyout (Simple)

### Animations

- [x] Animation Preset Constants (Duration, Easing Functions)

### Theme

- [x] Light and Dark theme
- [ ] Custom accent color

### Accessibility

- [ ] Accessibility Semantics

## Contribution

See [CONTRIBUTION.md](CONTRIBUTION.md)

## License

This library is licensed under the Apache License 2.0.

The copyright of the icon assets (in `io.github.composefluent.icons` package) belongs to Microsoft.

## Credits

This project is built upon the foundations laid by several remarkable open-source projects. We extend our sincere gratitude to the developers and maintainers of these projects for their invaluable contributions to the open-source community.

### Fluent

| Project | Description | License |
|---|---|---|
| **[Windows UI Kit (Figma)](https://www.figma.com/community/file/1440832812269040007/windows-ui-kit)** | Provided design mockups for controls. | [CC BY 4.0](https://creativecommons.org/licenses/by/4.0/) |
| [JetBrains/compose-multiplatform](https://github.com/JetBrains/compose-multiplatform) | Provides the fundamental framework for Compose Multiplatform development. | [Apache License 2.0](https://github.com/JetBrains/compose-multiplatform/blob/master/LICENSE.txt) |
| [Kotlin/kotlinx-datetime](https://github.com/Kotlin/kotlinx-datetime) | Provides a unified clock API. | [Apache License 2.0](https://github.com/Kotlin/kotlinx-datetime/blob/master/LICENSE.txt) |
| [chrisbanes/haze](https://github.com/chrisbanes/haze) | Offers essential implementations for acrylic and mica effects. | [Apache License 2.0](https://github.com/chrisbanes/haze/blob/main/LICENSE) |

### Fluent-Icons
| Project | Description | License |
|---|---|---|
| [microsoft/fluentui-system-icons](https://github.com/microsoft/fluentui-system-icons) | Supplies the icon assets used in the project. | [MIT License](https://github.com/microsoft/fluentui-system-icons/blob/main/LICENSE) |
| [DevSrSouza/svg-to-compose](https://github.com/DevSrSouza/svg-to-compose) | Facilitates the conversion of SVG icons to Compose icons, aiding in the implementation of Fluent icons. | [MIT License](https://github.com/DevSrSouza/svg-to-compose/blob/master/LICENSE) |

### Gallery
| Project | Description | License |
|---|---|---|
| [lhwdev/compose-window](https://github.com/lhwdev/compose-window) | Provides guidance on passing pointer events back to the parent window. | [Apache License 2.0](https://github.com/lhwdev/compose-window/blob/main/LICENSE) |
| [grassator/win32-window-custom-titlebar](https://github.com/grassator/win32-window-custom-titlebar) | Demonstrates how to hide the Windows title bar. | [MIT License](https://github.com/grassator/win32-window-custom-titlebar/blob/master/LICENSE) |
| [MayakaApps/ComposeWindowStyler](https://github.com/MayakaApps/ComposeWindowStyler) | Enables mica window backgrounds on Windows. | [MIT License](https://github.com/MayakaApps/ComposeWindowStyler/blob/main/LICENSE) |
| [java-native-access/jna](https://github.com/java-native-access/jna) | Provides the capability to interact with Win32 APIs, enabling title bar customization. | [Apache License 2.0](https://github.com/java-native-access/jna/blob/master/LICENSE) |
| [google/ksp](https://github.com/google/ksp) | Along with KotlinPoet, helps with source code generation for examples and navigation logic. | [Apache License 2.0](https://github.com/google/ksp/blob/main/LICENSE) |
| [square/kotlinpoet](https://github.com/square/kotlinpoet) | Along with KSP, helps with source code generation for examples and navigation logic. | [Apache License 2.0](https://github.com/square/kotlinpoet/blob/main/LICENSE.txt) |
| [SnipMeDev/Highlights](https://github.com/SnipMeDev/Highlights) | Enables syntax highlighting for example code. | [Apache License 2.0](https://github.com/SnipMeDev/Highlights/blob/main/LICENSE) |
| [yshrsmz/BuildKonfig](https://github.com/yshrsmz/BuildKonfig) | Facilitates the generation of build configuration parameter classes. | [Apache License 2.0](https://github.com/yshrsmz/BuildKonfig/blob/master/LICENSE) |

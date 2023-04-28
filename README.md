# Compose Fluent

[![License](https://img.shields.io/github/license/Konyaco/compose-fluent-ui)](LICENSE)
[![Version](https://img.shields.io/github/v/release/Konyaco/compose-fluent-ui?include_prereleases)](https://github.com/Konyaco/compose-fluent-ui/releases)
![Maven Central](https://img.shields.io/maven-central/v/com.konyaco/fluent)


**Fluent Design** UI library for **Compose Multiplatform**

![Example](assets/screenshot.png)

## Current Status

> This library is experimental, any API would be changed in the future without any notification.

Please note that there are lots of hard-coding and workarounds in our source code, which we plan to eliminate in the future.

Thank you for using our library. We look forward to receiving your feedback and contributions!


## Quick Start

### Add Dependency

```kts
implementation("com.konyaco:fluent:0.0.1-dev.6")
implementation("com.konyaco:fluent-icons-extended:0.0.1-dev.6") // If you want to use full fluent icons.
```

### Example

```kotlin
import com.konyaco.fluent.component.*

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
See [`example`](example) module for more details.

- `FluentTheme()` is the context and entry point of the application, just like `MaterialTheme`
- Components are under `component` package
- `Mica` and `Layer` are under `background` package

## License

This library is under Apache-2.0 license.

The copyright of the icon assets (in `com.konyaco.fluent.icons` package) belongs to Microsoft.

## Components

### Layers

- Mica
  - [x] Simple Mica
  - [ ] Real Mica
- Layer
  - [x] Simple Layer
  - [ ] Real Layer
- [ ] Acrylic

### Basic Inputs

- [x] Button
- [x] ToggleSwitch
- [x] CheckBox
- [x] RadioButton
- [x] Slider
- [x] DropdownMenu
- [x] TextField
- [x] ProgressBar
- [x] ProgressRing
- [ ] Pill Button
- [ ] ComboBox
- [ ] RatingControl

### Basic Components

- [ ] Tooltip
- [ ] InfoBar
- [ ] FilePicker
- [ ] Menu

### Dialogs

- [x] Simple Dialog
- [ ] Compound Dialog (Title, Content, Controls)
- [ ] Flyout

### Animations

- [x] Animation Preset Constants (Duration, Easing Functions)

### Theme

- [x] Light and Dark theme
- [ ] Custom accent color

### Compound Components

- [ ] Color Picker
- [ ] DateTime Picker
- [ ] Calender
- [ ] Navigation
  - [x] SideNav
  - [ ] BreadcrumbBar
  - [ ] Pivot
  - [ ] TabView

### TODO


- [ ] Accessibility Semantics

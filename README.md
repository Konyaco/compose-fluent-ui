# Compose Fluent

[![License](https://img.shields.io/github/license/Konyaco/compose-fluent-ui)](https://github.com/Konyaco/compose-fluent-ui/blob/master/LICENSE)
[![Version](https://img.shields.io/github/v/release/Konyaco/compose-fluent-ui?include_prereleases)](https://github.com/Konyaco/compose-fluent-ui/releases)

**Fluent Design** UI library for **Jetbrains Compose**

![Example](assets/screenshot.png)

## Current Status

> This library is experimental, any API (even the package name) would be changed in the future without any notification.

Current version: `v0.0.1-dev3`

Now supported:

- Coarse implementation of some basic components: `Button`, `Switcher`, `TextField`, `Slider`...
- A fake `Mica` and `Layer`
- Dark theme and light theme

There are lots of hard-code and workaround in our source code, we are going to eliminate them in the future

Thank you for using our library, and we look forward to your feedback and contributions!

### Multiplatform

Currently, only Desktop platforms are supported. It might be easy to migrate to multiplatform.

## How to Use

We are not yet published our library to maven. You can download the source code or jar in release page

- `FluentTheme()` is the context and entry point of the application.
- Components are under `component` package
- `Mica` and `Layer` are under `background` package

About the API usage, just see `Main.kt`

## License

This library is under Apache-2.0 license.

The copyright of the icon assets (in `com.konyaco.fluent.icons` package) belongs to Microsoft.

## TODO

- M1
    - [ ] Basic Inputs
        - [x] Button
        - [x] Toggle Switch
        - [x] Checkbox
        - [x] Radio Button
        - [x] Slider
        - [ ] Dropdown
        - [ ] Pill Button
    - [x] Layers
        - [x] Fake Mica
        - [x] Simple Layer
    - [x] Text Field
    - [x] Part of Animation
- M2
   - [ ] Theme
       - [x] Light and Dark theme
       - [ ] Custom Accent color
   - [ ] Animation
   - [ ] Refactor architecture, cleanup code, eliminate hard-code
   - [ ] More
- M3
    - [ ] Compound components (Side Nav, Top Nav, Tab View, etc...)
    - [ ] Layer (Might be delayed)
        - [ ] Real Mica
        - [ ] Acrylic
    - [ ] Accessibility Semantics

# TODO

Backlog only. The component checklist lives in [README](README.md#components) — this file tracks
what is missing or unfinished, not what exists.

## Components

- [ ] `disabled`/`enabled` parameter on every component — 29 of 45 component files expose one
- [ ] TextField
  - [ ] Alternative styles
  - [ ] Customizable leading/trailing icon
  - [ ] Optional clear button (`clearable: Boolean`, auto-triggering `onChange("")`)
- [ ] Flyout
  - [ ] Noise background
  - [ ] Improve enter/exit animation
- [ ] Dialog
  - [ ] Lower-level Dialog primitive, plus `AlertDialog` / `ConfirmDialog` / `PromptDialog`
- [ ] Slider
  - [ ] Improve smoothness; consider `anchoredDraggable` for snap animation
  - [ ] Accessibility semantics (the only component still missing them)
- [ ] ComboBox — editable variant

## Compound components

- [ ] Date & time
  - [x] Calendar View (simple)
  - [x] Calendar Date Picker
  - [x] Date Picker (standalone, non-calendar)
  - [x] Time Picker
- [ ] Navigation
  - [ ] Pivot
  - [ ] Extract the navigator as a component: low-level API plus a declarative high-level one
  - [ ] Alternative styles
- [ ] File Picker
- [ ] MediaPlayer

## Localization

- [ ] First day of the week for a region-less locale (`fr` rather than `fr-FR`) falls back to
      Sunday on the JVM, on every version tested up to 25. The browser targets already handle
      this via `Intl.Locale.maximize()`; the JVM has no public likely-subtags API.
- [ ] `zh-CN` reports Sunday on a JDK older than 21. Fixed upstream in the JDK's CLDR data, so
      nothing to do here beyond documenting the runtime requirement.
- [ ] Calendar header should read "May 2026" / "2026年 5月" per locale rather than a fixed
      `"$month $year"`.

## Theme

- [ ] High contrast theme
- [ ] Focus border for components

## Release engineering

- [x] Compose stability baselines committed; the gallery one is enforced in CI
- [ ] Enforce `:fluent:stabilityCheck` in CI. Blocked on the analyzer writing a single baseline
      for a module whose composable set differs per target (`ContextMenu.desktop.kt` exists on
      desktop, not on Android) while the compilation it inspects is not deterministic across
      environments — so the same commit reports those composables as removed locally and new on
      CI. Needs either per-target baselines upstream, or pinning the check to one target.
- [ ] Smoke-test `publish-maven` and `release-gallery` with a throwaway pre-release tag — neither
      has ever run, and their first execution should not be the real release
- [ ] Confirm the `dev.nucleusframework` namespace is verified on Maven Central
- [ ] Broaden CI beyond the Apple and stability jobs if the desktop/web targets ever stop being
      covered by local builds

## Done

Kept briefly so the list above is not mistaken for the whole picture: the gallery home page,
per-component pages and icons gallery all exist; `Card` has a clickable overload; the `Layer`
workarounds (`circular`, `cornerRadius`) were eliminated; RTL is supported across the component
set; the desktop window, its Mica/Acrylic backdrop and window accessibility come from Nucleus.

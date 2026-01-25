**A big thank you to Bri for the helpful tutorial on separating icons for macOS Tahoe vs. earlier versions:** https://mjtsai.com/blog/2025/08/08/separate-icons-for-macos-tahoe-vs-earlier/

Here is the script provided in the tutorial for compiling the `Assets.car` file:

```bash
actool icon.icon --compile ../icon --app-icon icon --enable-on-demand-resources NO --development-region en --target-device mac --platform macosx --enable-icon-stack-fallback-generation=disabled --include-all-app-icons --minimum-deployment-target 10.14 --output-partial-info-plist /dev/null
```

**Important:**

To make this work, you also need to add the following properties to your `Info.plist` file:

*   `CFBundleIconName`
*   `CFBundleIconFile`
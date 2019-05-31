# react-native-system-clock

A simple React Native module to access Android's native system time.

## Getting started

`$ npm install react-native-system-clock --save`

### Mostly automatic installation

`$ react-native link react-native-system-clock`

### Manual installation

#### Android

1.  Open up `android/app/src/main/java/[...]/MainActivity.java`

- Add `import com.reactlibrary.RNSystemClockPackage;` to the imports at the top of the file
- Add `new RNSystemClockPackage()` to the list returned by the `getPackages()` method

2.  Append the following lines to `android/settings.gradle`:
    ```
    include ':react-native-system-clock'
    project(':react-native-system-clock').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-system-clock/android')
    ```
3.  Insert the following lines inside the dependencies block in `android/app/build.gradle`:
    ```
      compile project(':react-native-system-clock')
    ```

## Usage

```javascript
import RNSystemClock from '@celo/react-native-system-clock'

await RNSystemClock.getDeviceTime()
```

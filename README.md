# react-native-system-clock

## Getting started

`$ npm install react-native-system-clock --save`

### Mostly automatic installation

`$ react-native link react-native-system-clock`

### Manual installation

#### iOS

1.  In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2.  Go to `node_modules` ➜ `react-native-system-clock` and add `RNSystemClock.xcodeproj`
3.  In XCode, in the project navigator, select your project. Add `libRNSystemClock.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4.  Run your project (`Cmd+R`)<

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

#### Windows

[Read it! :D](https://github.com/ReactWindows/react-native)

1.  In Visual Studio add the `RNSystemClock.sln` in `node_modules/react-native-system-clock/windows/RNSystemClock.sln` folder to their solution, reference from their app.
2.  Open up your `MainPage.cs` app

- Add `using System.Clock.RNSystemClock;` to the usings at the top of the file
- Add `new RNSystemClockPackage()` to the `List<IReactPackage>` returned by the `Packages` method

## Usage

```javascript
import RNSystemClock from 'react-native-system-clock'

// TODO: What to do with the module?
RNSystemClock
```

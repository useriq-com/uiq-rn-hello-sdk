
# react-native-uiq-rn-hello-sdk

## Getting started

`$ npm install react-native-uiq-rn-hello-sdk --save`

### Mostly automatic installation

`$ react-native link react-native-uiq-rn-hello-sdk`


### Additional Steps For iOS
1. Go to the iOS folder of the project
2. Open `Podfile`.
3. Add `pod UIQHello` under `target <app-name>`.
4. Go to iOS folder in command line and enter `pod install`.

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-uiq-rn-hello-sdk` and add `RNUiqRnHelloSdk.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNUiqRnHelloSdk.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNUiqRnHelloSdkPackage;` to the imports at the top of the file
  - Add `new RNUiqRnHelloSdkPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-uiq-rn-hello-sdk'
  	project(':react-native-uiq-rn-hello-sdk').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-uiq-rn-hello-sdk/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-uiq-rn-hello-sdk')
  	```

## Usage
```javascript
import RNUiqRnHelloSdk from 'react-native-uiq-rn-hello-sdk';

RNUiqRnHelloSdk.showMessage();
```
  

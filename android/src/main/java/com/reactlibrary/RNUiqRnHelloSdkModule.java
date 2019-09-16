package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RNUiqRnHelloSdkModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public RNUiqRnHelloSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNUiqRnHelloSdk";
    }

    @ReactMethod
    public void showMessage() {
        new Main().showToast(reactContext);
    }

}
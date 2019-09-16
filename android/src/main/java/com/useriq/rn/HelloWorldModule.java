package com.useriq.rn;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.useriq.sample_sdk.Main;

public class HelloWorldModule extends ReactContextBaseJavaModule {

    private static final String TAG = "HelloWorldModule";
    private ReactContext reactContext;

    public HelloWorldModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "HelloWorldModule";
    }

    @ReactMethod
    public void init() {
        new Main().showDialog(reactContext);
    }
}
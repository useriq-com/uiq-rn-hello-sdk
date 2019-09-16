package com.useriq.rn;

import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.useriq.sample_sdk.Main;

public class SampleSdkModule extends ReactContextBaseJavaModule {

    private static final String TAG = "sample_sdk";
    private ReactContext reactContext;

    public SampleSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "sample_sdk";
    }

    @ReactMethod
    public void init() {
        new Main().showDialog(reactContext);
    }
}
package com.useriq.rn;

import android.content.Context;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.useriq.sample_sdk.Main;

public class SampleSdkModule extends ReactContextBaseJavaModule {

    private static final String TAG = "sample_sdk";

    public SampleSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "sample_sdk";
    }

    @ReactMethod
    public void init(Context context) {
        new Main().showDialog(context);
    }
}
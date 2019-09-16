package com.useriq.rn;

import android.content.Context;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class SampleSdkModule extends ReactContextBaseJavaModule {

    private static final String TAG = "Sample-sdk";
    private final ReactApplicationContext reactContext;

    public SampleSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "UseriqReactNative";
    }

    @ReactMethod
    public void init(Context context) {
        Toast.makeText(context, "Hello", Toast.LENGTH_LONG).show();
    }
}
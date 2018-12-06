
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.common.SystemClock;

public class RNSystemClockModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSystemClockModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSystemClock";
  }

  @ReactMethod
  public long getDeviceTime(){
    return SystemClock.currentTimeMillis();
  }
}
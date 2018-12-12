
package com.reactmodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.common.SystemClock;
import com.facebook.react.bridge.Promise;

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
  public void getDeviceTime(Promise promise){
    promise.resolve(Long.toString(SystemClock.currentTimeMillis()));
  }
}
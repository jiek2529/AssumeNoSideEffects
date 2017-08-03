package com.jiek.log.assumenosideeffects;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by gaopj on 2017/8/3.
 */

public class JiekApplication extends Application {
    private static final String TAG = "JiekApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT > 14) {
            registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                @Override
                public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                    log("onActivityCreated");
                }

                @Override
                public void onActivityStarted(Activity activity) {
                    log("onActivityStarted");
                }

                @Override
                public void onActivityResumed(Activity activity) {
                    log("onActivityResumed");
                }

                @Override
                public void onActivityPaused(Activity activity) {
                    log("onActivityPaused");
                }

                @Override
                public void onActivityStopped(Activity activity) {
                    log("onActivityStopped");
                }

                @Override
                public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                    log("onActivitySaveInstanceState");
                }

                @Override
                public void onActivityDestroyed(Activity activity) {
                    log("onActivityDestroyed");
                }
            });
        }
    }

    private void log(String msg) {
        Log.e(TAG, msg);
    }
}

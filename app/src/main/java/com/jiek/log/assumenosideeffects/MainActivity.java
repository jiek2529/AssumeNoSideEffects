package com.jiek.log.assumenosideeffects;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    int sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "onCreate");
        Log.d(TAG, testLog());

        ((TextView) findViewById(R.id.hello_tv)).setText("sum = " + sum);
    }

    private String testLog() {
        String logMsg;
        sum = 1 + 2;
        logMsg = " 1 + 2 = " + sum;
        return logMsg;
    }
}

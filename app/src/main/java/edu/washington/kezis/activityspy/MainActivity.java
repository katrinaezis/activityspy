package edu.washington.kezis.activityspy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate event fired");
        if (savedInstanceState != null) {
            Log.i(TAG, savedInstanceState.toString());
        }

        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart event fired");
    };

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart event fired");
    };

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume event fired");
    };

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause event fired");
    };

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop event fired");
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy fired");
        Log.e(TAG, "We're going down, Captain!");
    };
}

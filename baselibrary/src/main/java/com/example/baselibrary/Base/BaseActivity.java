package com.example.baselibrary.Base;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * author dyn
 * introduce :
 * PACKAGE_NAME com.dyn.android.first.Base
 * PROJECT_NAME Soker
 * DATE  2018/3/20 16:51
 */

public class BaseActivity extends Activity{
    public static final String TAG ="BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(TAG,"calssname : " + this.getClass().getSimpleName());

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

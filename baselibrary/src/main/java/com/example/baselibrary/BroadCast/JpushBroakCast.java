package com.example.baselibrary.BroadCast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * author dyn
 * introduce :
 * PACKAGE_NAME com.dyn.android.first.BroadCast
 * PROJECT_NAME Soker
 * DATE  2018/3/28 19:29
 */

public class JpushBroakCast extends BroadcastReceiver {
    public static final String TAG = "BroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.w(TAG, " onReceive =");

    }
}

package com.dyn.android.first.soker;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.example.baselibrary.Net.RetrofitActivity;


/**
 * author dyn
 * introduce :后台运行
 * PACKAGE_NAME com.dyn.android.first.soker
 * PROJECT_NAME Soker
 * DATE  2018/3/20 16:42
 */
public class SokerApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("[SokerApp]", "Soker Application create --------------------------------------------------------------------------");

    }

}

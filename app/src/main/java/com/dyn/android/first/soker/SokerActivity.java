package com.dyn.android.first.soker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.baselibrary.Net.RetrofitActivity;


public class SokerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soker);
        startActivity(new Intent(this, RetrofitActivity.class));

    }
}



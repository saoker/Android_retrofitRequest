package com.example.baselibrary.Net;

import android.os.Bundle;
import android.util.Log;

import com.example.baselibrary.Base.BaseActivity;
import com.example.baselibrary.Net.Bean.BaseCallBean;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * author dyn
 * introduce :
 * PACKAGE_NAME com.example.baselibrary.Net
 * PROJECT_NAME Soker
 * DATE  2018/3/29 11:16
 */

public class RetrofitActivity extends BaseActivity {
    public static final String TAG = "  [RetrofitRequest]  ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Call<BaseCallBean> firstcall = RetrofitRequest.getRequest().fundGETRequestForBean("json");
        firstcall.enqueue(new Callback<BaseCallBean>() {

            @Override
            public void onResponse(Call<BaseCallBean> call, Response<BaseCallBean> response) {
                BaseCallBean bean = response.body();
                Log.w(TAG, "enqueue success  onResponse bean = " + bean.toString());
            }

            @Override
            public void onFailure(Call<BaseCallBean> call, Throwable t) {
                Log.w(TAG, "enqueue onFailure");
            }
        });
    }


}

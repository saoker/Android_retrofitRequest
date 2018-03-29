package com.example.baselibrary.Net;


import android.util.Log;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * author dyn
 * introduce :
 * PACKAGE_NAME com.dyn.android.first.Retrofit
 * PROJECT_NAME Soker
 * DATE  2018/3/20 17:06
 */

public class RetrofitRequest {

    private static final String BASE_URL = "http://47.75.77.93:8080";
//    private static final String BASE_URL = "http://172.31.35.70:8080";


    private static HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
        @Override
        public void log(String message) {
            //打印retrofit日志
            Log.w(RetrofitActivity.TAG, "retrofitBack = " + message);
        }
    });
    private static final OkHttpClient client = getNewClient();
    private static final Retrofit retrofit = initRetrofit();

    private static final long DEFAULT_TIMEOUT = 30;

    public static InterfaceReTrofits getRequest() {
        return retrofit.create(InterfaceReTrofits.class);
    }

    private static Retrofit initRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
//                .addConverterFactory(ScalarsConverterFactory.create())
//                .addConverterFactory(ByteArrayConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }


    private static OkHttpClient getNewClient() {
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .build();
    }
}

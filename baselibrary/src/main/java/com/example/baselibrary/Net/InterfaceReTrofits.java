package com.example.baselibrary.Net;


import com.example.baselibrary.Net.Bean.BaseCallBean;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * author dyn
 * introduce :
 * PACKAGE_NAME com.dyn.android.first.Retrofit
 * PROJECT_NAME Soker
 * DATE  2018/3/20 16:56
 */

public interface InterfaceReTrofits {

    @GET("{viewname}?name=101020100&id=11")
    Call<String> fundGETRequest(@Path("viewname") String viewname);

    @GET("{viewname}?id=12")
    Call<BaseCallBean> fundGETRequestForBean(@Path("viewname") String viewname);


    Call<BaseCallBean> fundGETRequest(@Url String url, @QueryMap Map<String, String> queryMaps);


}

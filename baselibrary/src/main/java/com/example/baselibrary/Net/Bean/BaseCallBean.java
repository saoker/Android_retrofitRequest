package com.example.baselibrary.Net.Bean;

import java.io.Serializable;

/**
 * author dyn
 * introduce :
 * PACKAGE_NAME com.dyn.android.first.Retrofit.Bean
 * PROJECT_NAME Soker
 * DATE  2018/3/20 17:02
 */

public class BaseCallBean implements Serializable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "BaseCallBean{" +
                "ip='" + ip + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", time='" + time + '\'' +
                '}';
    }

    String ip;
    String name;
    int id;
    String time;
}

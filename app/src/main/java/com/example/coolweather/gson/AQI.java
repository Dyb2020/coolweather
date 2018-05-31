package com.example.coolweather.gson;

/**
 * Created by dinghaifeng on 2018/5/30.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

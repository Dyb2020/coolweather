package com.example.coolweather.gson;

import com.example.coolweather.db.Province;
import com.google.gson.annotations.SerializedName;

/**
 * Created by dinghaifeng on 2018/5/30.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}

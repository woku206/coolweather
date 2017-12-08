package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/10/4 0004.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Suggestion suggestion;
    public NOW now;
    @SerializedName("daily_forecast")
    public List<Forecast>forecastList;

}

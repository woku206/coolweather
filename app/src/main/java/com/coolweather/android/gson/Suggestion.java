package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/10/4 0004.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String Info;

    }
    public class CarWash{
        @SerializedName("txt")
        public String Info;
    }
    public class Sport{
        @SerializedName("txt")
        public String Info;
    }


}

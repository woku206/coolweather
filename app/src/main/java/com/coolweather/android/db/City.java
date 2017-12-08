package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/10/2 0002.
 */

public class City extends DataSupport {
    private int id;
    private String cityeName;
    private int cityCode;
    public int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id ){
        this.id=id;
    }
    public String getCityName(){
        return  cityeName;
    }
    public void setCityeName(String cityeName){
        this.cityeName=cityeName;
    }
    public int getCityCode(){
        return cityCode;

    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}

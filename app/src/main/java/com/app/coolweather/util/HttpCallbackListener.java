package com.app.coolweather.util;

/**
 * Created by zyf on 2016/2/13.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}

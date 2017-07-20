package com.example.lpf.xzweather.util;

/**
 * Created by LPF on 2017/7/19.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}

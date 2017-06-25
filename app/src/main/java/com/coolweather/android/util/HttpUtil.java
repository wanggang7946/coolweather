package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017-06-18.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

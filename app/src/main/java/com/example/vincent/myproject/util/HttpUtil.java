package com.example.vincent.myproject.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by VINCENT on 2017/9/11.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request= new Request.Builder().url(address).build(); /**  这部分url使用的是后缀为String的 如果出现错误可以更换成其他试试*/
        client.newCall(request).enqueue(callback);
    }
}
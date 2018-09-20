package com.example.baselibrary;

import android.util.Log;

public class LogUtils {
    public static void show(String msg) {
        if (msg == null) {
            Log.e("MyTag", "我是null");
        } else if (msg.equals("")) {
            Log.e("MyTag", "我是\"\"");
        } else {
            Log.e("MyTag", msg);
        }
    }
}

package com.yh.studydagger;

class Log {
    private static int index = 0;
    private static final String[] prefix = {". "," ."};
    public static void d(String tag, Object msg){
        if(index >= 1){
            android.util.Log.d(prefix[1] + tag, ""+msg);
            index = 0;
        }else if(index == 0){
            android.util.Log.d(prefix[0] + tag, ""+msg);
            index = 1;
        }
    }
}

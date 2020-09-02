package com.example.testrepo;

import android.content.Context;
import android.widget.Toast;

public class A {

    public static void say(Context context, String content){

        Toast.makeText(context,content,Toast.LENGTH_LONG).show();
    }
}

package com.example.learnapp;

import android.os.Handler;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashactivity extends AppCompatActivity {
    private static int Splash_time = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent (splashactivity.this,MainActivity.class);
                startActivity(intent);
            }
        }, Splash_time);
    }
}

package com.example.mycurrentlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                Intent i=new Intent(MainActivity.this, Main3Activity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}

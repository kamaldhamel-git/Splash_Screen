package com.example.splash_screen;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    ImageView imageview;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageview=findViewById(R.id.image);
        textView=findViewById(R.id.C_Name);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        imageview.startAnimation(animation);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(6000);

                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}
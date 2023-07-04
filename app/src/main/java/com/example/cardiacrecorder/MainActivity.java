package com.example.cardiacrecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Showing Splash Screen
 */
public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCRN=4000;

    Animation topAnim,bottomAnim;

    ImageView imageView;
    TextView logo ,slogan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //animation
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        //hocks

        imageView=findViewById(R.id.splashScreenImg);
        logo=findViewById(R.id.textView2);
        slogan=findViewById(R.id.textView5);

        imageView.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);

        /**
         * splash screen dynamic
         */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(MainActivity.this,Home.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_SCRN);




    }
}
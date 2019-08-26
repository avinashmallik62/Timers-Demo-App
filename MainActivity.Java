package com.example.timersdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new CountDownTimer(30000,1000){
          public void onTick(long millisecondsUntilDone){

              Toast.makeText(MainActivity.this, "Seconds Left : " + String.valueOf(millisecondsUntilDone/1000), Toast.LENGTH_SHORT).show();

          }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this, "Hey! We are done! No more CountDown", Toast.LENGTH_SHORT).show();
            }
        }.start();
        /*
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey it's us ","time has passed by");
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);
        */
    }
}

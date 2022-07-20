package com.example.a1to50test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class GameView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_view);
    }
}

//button_stop.setOnClickListener(new View.OnClickListener() {
//public void onClick(View v){
//        chronometer.setBase(SystemClock.elapsedRealtime());
//        chronometer.stop();
//
//        button_1.setText("");
//        button_2.setText("");
//        button_3.setText("");
//        button_4.setText("");
//        button_5.setText("");
//        button_6.setText("");
//        button_7.setText("");
//        button_8.setText("");
//        button_9.setText("");
//        button_10.setText("");
//
//        button_11.setText("");
//        button_12.setText("");
//        button_13.setText("");
//        button_14.setText("");
//        button_15.setText("");
//        button_16.setText("");
//        button_17.setText("");
//        button_18.setText("");
//        button_19.setText("");
//        button_20.setText("");
//
//        button_21.setText("");
//        button_22.setText("");
//        button_23.setText("");
//        button_24.setText("");
//        button_0.setText("");
//        }
//        });
package com.example.practice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Level1Activity extends AppCompatActivity {

    public static final String ANDROID_LOG_TAG = "Android Tag";
    private static Handler mHandler = new Handler();
    private static String something = new String();
    private static Integer buttonStage = 0;
    private static String myURL="https://www.google.com/search?client=firefox-b-d&q=jordan+peterson+meaning+of+life";

    @Override
    public void onBackPressed(){
        Intent menuIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(menuIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view1);

        ((EditText) findViewById(R.id.etw1)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d(ANDROID_LOG_TAG, s.toString() + " " + start + " " + after + " " + count);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(ANDROID_LOG_TAG, s.toString() + " " + start + " " + before + " " + count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                something = s.toString();
            }

        });

        TextView tw1 =  findViewById(R.id.tw1);

        RatingBar rb1 = findViewById(R.id.rb1);
        rb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Log.d(ANDROID_LOG_TAG, "Rating has changed to: " + rating + " stars");
            }
        });

        Button btn = findViewById(R.id.btnw1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView tw1 = findViewById(R.id.tw1);
                tw1.setTextSize(15);
                switch (buttonStage) {
                    case 0:
                        tw1.setVisibility(View.VISIBLE);
                        tw1.setText("   Come on, that's a 1 star answer. You need 5 stars to even have a chance!");
                        buttonStage++;
                        break;

                    case 1:
                        tw1.setVisibility(View.INVISIBLE);
                        tw1.setText("You pressed the button again, didn't you?!?");
                        mHandler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                findViewById(R.id.tw1).setVisibility(View.VISIBLE);
                            }
                        }, 200);
                        buttonStage++;
                        break;

                    case 2:
                        tw1.setVisibility(View.INVISIBLE);
                        tw1.setText("You pressed the button again, didn't you?!?");
                        mHandler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                findViewById(R.id.tw1).setVisibility(View.VISIBLE);
                            }
                        }, 200);
                        buttonStage++;
                        break;

                    case 3:
                        tw1.setVisibility(View.INVISIBLE);
                        tw1.setText("You pressed the button again, didn't you?!?");
                        mHandler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                findViewById(R.id.tw1).setVisibility(View.VISIBLE);
                            }
                        }, 200);
                        buttonStage++;
                        break;

                    case 4:
                        tw1.setVisibility(View.VISIBLE);
                        tw1.setText("You are getting closer. Now write something and click the button again");
                        buttonStage++;
                        break;

                    case 5:
                        tw1.setVisibility(View.INVISIBLE);
                        if(something.equals("something")) {
                            tw1.setText("Wooow you're good! Congrats!");
                            tw1.setVisibility(View.VISIBLE);
                            mHandler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    Intent menuIntent = new Intent(getApplicationContext(), Level2Activity.class);
                                    startActivity(menuIntent);
                                }
                            }, 200);
                        }
                        buttonStage++;
                        buttonStage = 0;
                        break;
                }
            }
        });
    }



}

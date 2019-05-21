package com.example.practice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButtonLevel1 = findViewById(R.id.Level1Image);
        ImageButton imageButtonLevel2 = findViewById(R.id.Level2Image);
        ImageButton imageButtonLevel3 = findViewById(R.id.Level3Image);

        imageButtonLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent level1Intent = new Intent(getApplicationContext(), Level1Activity.class);
                startActivity(level1Intent);
            }
        });

        imageButtonLevel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent level2Intent = new Intent(getApplicationContext(), Level2Activity.class);
                startActivity(level2Intent);
            }
        });

        imageButtonLevel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent level3Intent = new Intent(getApplicationContext(), Level3Activity.class);
                startActivity(level3Intent);
            }
        });
    }
}

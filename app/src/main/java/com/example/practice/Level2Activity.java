package com.example.practice;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Level2Activity extends AppCompatActivity {

    @Override
    public void onBackPressed(){
        Intent menuIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(menuIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);

        CheckBox cbw2 = findViewById(R.id.cbw2);
        final RadioGroup rg =findViewById(R.id.rgw2);
        final TextView tv = findViewById(R.id.tv1);

        cbw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ((CheckBox)findViewById(R.id.cbw2)).setBackgroundColor(Color.parseColor("#FF700F"));
                rg.setVisibility(View.VISIBLE);
                tv.setVisibility(View.VISIBLE);
                if(((CheckBox) findViewById(R.id.cbw2)).isChecked() && (rg.getCheckedRadioButtonId() == (int) 2)) {
                    Intent menuIntent = new Intent(getApplicationContext(), Level3Activity.class);
                    startActivity(menuIntent);
                }
                if(((CheckBox) findViewById(R.id.cbw2)).isChecked() == false) {
                    ((CheckBox) findViewById(R.id.cbw2)).setBackgroundColor(Color.BLACK);
                }
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup arg0, int selectedId) {
                if(((CheckBox) findViewById(R.id.cbw2)).isChecked() && (rg.getCheckedRadioButtonId() == (int) 2)) {
                    Intent menuIntent = new Intent(getApplicationContext(), Level3Activity.class);
                    startActivity(menuIntent);
                }
            }
        });

    }
}

package com.example.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Level3Activity extends AppCompatActivity {

    @Override
    public void onBackPressed(){
        Intent menuIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(menuIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view3);

        final Button btn = findViewById(R.id.btn1);
        final EditText et = findViewById(R.id.et1);
        final TextView endOfDemo = findViewById(R.id.endOfDemo);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(et.getText().toString().equals("phoenix")){
                    btn.setVisibility(View.INVISIBLE);
                    endOfDemo.setVisibility(View.VISIBLE);
                }

            }
        });



    }

}

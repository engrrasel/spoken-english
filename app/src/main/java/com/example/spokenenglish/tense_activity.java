package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class tense_activity extends AppCompatActivity {

    Window window;
    Button present_tense,past_tense,future_tense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tense_activity);

        if (Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.ash));

            present_tense=findViewById(R.id.presenttenseid);
            past_tense=findViewById(R.id.pasttenseid);
            future_tense=findViewById(R.id.futuretenseid);



            present_tense.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(tense_activity.this,present_tense.class);
                    startActivity(intent);
                }
            });


            past_tense.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(tense_activity.this,past_tense.class);
                    startActivity(intent);
                }
            });

            future_tense.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(tense_activity.this,future_tense.class);
                    startActivity(intent);
                }
            });

    }
}}

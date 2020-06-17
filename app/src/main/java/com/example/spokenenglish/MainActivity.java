package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public CardView spokenenglish, tense, learneveryday, verbs, proverbs, phrase_idiomsid, about;

    Window window;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spokenenglish = (CardView) findViewById(R.id.spokenenglishid);
        tense = (CardView) findViewById(R.id.tenseid);
        learneveryday = (CardView) findViewById(R.id.learn_everydayid);
        verbs = (CardView) findViewById(R.id.verbsid);
        proverbs = (CardView) findViewById(R.id.proverbsid);
        phrase_idiomsid = (CardView) findViewById(R.id.phrase_idiomsid);
        about = (CardView) findViewById(R.id.aboutid);


        spokenenglish.setOnClickListener(this);
        tense.setOnClickListener(this);
        learneveryday.setOnClickListener(this);
        verbs.setOnClickListener(this);
        proverbs.setOnClickListener(this);
        phrase_idiomsid.setOnClickListener(this);
        about.setOnClickListener(this);


        if (Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.purple));


            textView = findViewById(R.id.marquee);

            textView.setSelected(true);
        }

    }

    @Override
    public void onClick(View v) {

        Intent cardview;
        switch (v.getId()) {
            case R.id.spokenenglishid:
                cardview = new Intent(this, spoken.class);
                startActivity(cardview);
                break;

            case R.id.tenseid:
                cardview = new Intent(this, tense_activity.class);
                startActivity(cardview);
                break;

            case R.id.learn_everydayid:
                cardview = new Intent(this, learn_everyday.class);
                startActivity(cardview);
                break;

            case R.id.verbsid:
                cardview = new Intent(MainActivity.this, verbs_activity.class);
                startActivity(cardview);
                break;

            case R.id.proverbsid:
                cardview = new Intent(MainActivity.this, proverb_activity.class);
                startActivity(cardview);
                break;

            case R.id.phrase_idiomsid:
                cardview = new Intent(MainActivity.this, phrase_idioms_activity.class);
                startActivity(cardview);
                break;

            case R.id.aboutid:
                cardview = new Intent(MainActivity.this, about_activity.class);
                startActivity(cardview);
                break;


        }

    }
}


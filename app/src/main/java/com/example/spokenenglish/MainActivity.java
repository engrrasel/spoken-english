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
    public
    /*CardView spokenenglish,tense;*/
            Button spokenenglish,tense,learneveryday,verbs,proverbs,groupverb,phrase_idiomsid,about;

    Window window;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spokenenglish=findViewById(R.id.spokenenglishid);
        tense=findViewById(R.id.tenseid);
        learneveryday=findViewById(R.id.learneverydayid);\
        verbs=findViewById(R.id.verbsid);
        proverbs=findViewById(R.id.proverbsid);
        groupverb=findViewById(R.id.groupverbid);
        phrase_idiomsid=findViewById(R.id.phrase_idiomsid);
        about=findViewById(R.id.aboutid);





        spokenenglish.setOnClickListener(this);
        tense.setOnClickListener(this);

        if (Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.ash));


            textView=findViewById(R.id.marquee);

            textView.setSelected(true);
        }

    }

    @Override
    public void onClick(View v) {

        Intent cardview;
        switch (v.getId()){
            case R.id.spokenenglishid:cardview=new Intent(this,spoken.class);
            startActivity(cardview);
            break;

            case R.id.tenseid:cardview=new Intent(this,tense_activity.class);
                startActivity(cardview);
            break;

            case R.id.learneverydayid:cardview=new Intent(this,learn_everyday.class);
                startActivity(cardview);
                break;

            case R.id.verbsid:cardview= new Intent(MainActivity.this,)
        }

    }
}

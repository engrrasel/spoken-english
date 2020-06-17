package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class phrase_idioms_activity extends AppCompatActivity {

    private ListView phraselistview;

    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase_idioms_activity);

        /*for statusbar color*/
        if (Build.VERSION.SDK_INT >=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.purple));

        }


        phraselistview=(ListView) findViewById(R.id.phraselistviewid);

        String[] phrase_idioms = getResources().getStringArray(R.array.phrase_data);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.phrase_layout_desigine,R.id.phrasedesigineid,phrase_idioms);
        phraselistview.setAdapter(adapter);


    }
}

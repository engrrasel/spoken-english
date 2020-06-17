package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class verbs_activity extends AppCompatActivity {

    private ListView verblistview;

    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs_activity);


        /*for statusbar color*/
        if (Build.VERSION.SDK_INT >=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.purple));

        }


        verblistview=(ListView) findViewById(R.id.verb_list_view_id);

        String[] verbstringdata = getResources().getStringArray(R.array.verb_data);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.verb_layout_desigine,R.id.verb_layout_desigin_id,verbstringdata);
        verblistview.setAdapter(adapter);

    }
}

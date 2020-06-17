package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class verbs_activity extends AppCompatActivity {

    private ListView verblistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs_activity);


        verblistview=(ListView) findViewById(R.id.verb_list_view_id);

        String[] verbstringdata = getResources().getStringArray(R.array.verb_data);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.verb_layout_desigine,R.id.verb_layout_desigin_id,verbstringdata);
        verblistview.setAdapter(adapter);

    }
}

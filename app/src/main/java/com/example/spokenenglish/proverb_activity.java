package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class proverb_activity extends AppCompatActivity {


    private ListView proverblistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proverb_activity);


        proverblistview=(ListView) findViewById(R.id.proverb_list_id);

        String[] proverbdata=getResources().getStringArray(R.array.proverb_data);

        ArrayAdapter<String> adapterr=new ArrayAdapter<>(this,R.layout.proverb_layout_desigin,R.id.proverb_layout_desigin_id,proverbdata);
        proverblistview.setAdapter(adapterr);


    }
}

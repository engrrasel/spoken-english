package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class groupverb_activity extends AppCompatActivity {

    private ListView groupverblist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groupverb_activity);



        groupverblist=(ListView) findViewById(R.id.groupverb_listeid);


        String[] groupverbstring=getResources().getStringArray(R.array.phrase_data);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.activity_groupverb_activity,R.id.groupverb_listeid,groupverbstring);
        groupverblist.setAdapter(adapter);

    }
}

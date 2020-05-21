package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class spoken extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private Customadapter customAdapter;
    List<String> listdataHeader;
    HashMap<String,List<String>> listDatachild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoken);

        prepareListData();

        expandableListView = findViewById(R.id.expandableListViewId);
        customAdapter = new Customadapter(this,listdataHeader,listDatachild);
        expandableListView.setAdapter(customAdapter);


    }

    public void prepareListData()
    {

        String[] headerstring = getResources().getStringArray(R.array.spoken_header);
        String[] childstring = getResources().getStringArray(R.array.spoken_child);


        listdataHeader = new ArrayList<>();
        listDatachild = new HashMap<>();

        for(int i=0; i<headerstring.length; i++){


            //adding header data
            listdataHeader.add(headerstring[i]);

            List<String> child = new ArrayList<>();
            child.add(childstring[i]);

            listDatachild.put(listdataHeader.get(i),child);

        }

    }

}

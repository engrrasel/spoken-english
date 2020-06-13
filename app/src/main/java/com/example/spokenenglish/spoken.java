package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class spoken extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private Customadapter customAdapter;
    List<String> listdataHeader;
    HashMap<String,List<String>> listDatachild;
    Window window;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoken);

        prepareListData();

        expandableListView = findViewById(R.id.expandableListViewId);
        customAdapter = new Customadapter(this,listdataHeader,listDatachild);
        expandableListView.setAdapter(customAdapter);

        if (Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.ash));



            textView=findViewById(R.id.spoken_ruls);
            textView.setSelected(true);
        }



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

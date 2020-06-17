package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class verbs_activity extends AppCompatActivity {


    private SearchView searchView;
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

        searchView=findViewById(R.id.verb_search_view_id);
        verblistview=(ListView) findViewById(R.id.verb_list_view_id);

        String[] verbstringdata = getResources().getStringArray(R.array.verb_data);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.verb_layout_desigine,R.id.verb_layout_desigin_id,verbstringdata);
        verblistview.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

    }
}

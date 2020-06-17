package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class proverb_activity extends AppCompatActivity {


    private ListView proverblistview;
    private SearchView searchView;

    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proverb_activity);

        /*for statusbar color*/
        if (Build.VERSION.SDK_INT >=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.purple));

        }


        proverblistview=(ListView) findViewById(R.id.proverb_list_id);

        searchView=findViewById(R.id.proverb_search_view_id);

        String[] proverbdata=getResources().getStringArray(R.array.proverb_data);

        final ArrayAdapter<String> adapterr=new ArrayAdapter<>(this,R.layout.proverb_layout_desigin,R.id.proverb_layout_desigin_id,proverbdata);
        proverblistview.setAdapter(adapterr);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapterr.getFilter().filter(newText);
                return false;
            }
        });


    }
}

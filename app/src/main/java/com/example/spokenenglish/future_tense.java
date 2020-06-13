package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class future_tense extends AppCompatActivity {

    private TabLayout future_table;
    private ViewPager future_viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_tense);


        future_table= (TabLayout) findViewById(R.id.future_table_id);
        future_viewpager=(ViewPager) findViewById(R.id.future_viewpager_id);

        setViewPager(future_viewpager);
        future_table.setupWithViewPager(future_viewpager);




    }

    private void setViewPager(ViewPager viewpager) {


        Viewpagerfuture viewpagerfuture = new Viewpagerfuture(getSupportFragmentManager());
        viewpagerfuture.addFragment(new future_indefinite_tense(),"future \n indefinite");
        viewpagerfuture.addFragment(new future_Continuous_tense(),"furure \n Continuous");
        viewpagerfuture.addFragment(new future_perfect_tense(),"future \n perfect");
        viewpagerfuture.addFragment(new future_prfect_Continuous_tense(),"future \n per. Continuous");
        viewpager.setAdapter(viewpagerfuture);
    }

}

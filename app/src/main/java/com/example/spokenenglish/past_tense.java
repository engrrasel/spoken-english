package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class past_tense extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_tense);


        tabLayout = (TabLayout) findViewById(R.id.past_tab_layout_id);
        viewPager = (ViewPager) findViewById(R.id.past_viewpager_id);

        setViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setViewPager(ViewPager viewPager){


        Viewpagerpast viewpagerpast = new Viewpagerpast(getSupportFragmentManager());
        viewpagerpast.addFragment(new past_indefinite_tense(),"past \n indefinite");
        viewpagerpast.addFragment(new past_contiuous_tense(),"past \n Continuous");
        viewpagerpast.addFragment(new past_perfect_tense(),"past \n perfect");
        viewpagerpast.addFragment(new past_prfect_continuous_tense(),"past.\n per. Continuous");
        viewPager.setAdapter(viewpagerpast);




    }

}

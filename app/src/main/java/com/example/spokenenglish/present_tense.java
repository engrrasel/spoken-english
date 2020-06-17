package com.example.spokenenglish;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class present_tense extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    Window window;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_tense);

        /*toolbar = (Toolbar) findViewById(R.id.toolbarid);*/
        tabLayout = (TabLayout) findViewById(R.id.tablayoutid);
        viewPager = (ViewPager) findViewById(R.id.viewpagerid);


        /*for statusbar color*/
        if (Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.purple));

        }

        /*setSupportActionBar(toolbar);*/

        setViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);


    }

    private void setViewPager(ViewPager viewPager){

        ViewPagerAdpter viewPagerAdapter = new ViewPagerAdpter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new present_indefinite_tense(),"present\nindefinite");
        viewPagerAdapter.addFragment(new present_contiuous_tense(),"present\n Continuous");
        viewPagerAdapter.addFragment(new present_perfect_tense(),"present\n perfect");
        viewPagerAdapter.addFragment(new present_prfect_continuous_tense(),"present\n per. Continuous");
        viewPager.setAdapter(viewPagerAdapter);



    }
}

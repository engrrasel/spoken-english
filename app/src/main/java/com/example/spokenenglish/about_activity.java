package com.example.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;

public class about_activity extends AppCompatActivity {

    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_activity);

        /*for statusbar color*/
        if (Build.VERSION.SDK_INT >=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.purple));

        }
    }
}

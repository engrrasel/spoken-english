package com.example.spokenenglish;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class learn_everyday extends AppCompatActivity {


    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_everyday);


        /*//action bar*/
/*        ActionBar actionBar = getSupportActionBar();
        //title
        actionBar.setTitle("Corona info");*/

        //RecyclerView
        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        // set layout as linerlayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //send query to firebasedatabase
        mFirebaseDatabase=FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("Data");

    }

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<Model,ViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<Model, ViewHolder>(
                        Model.class,
                        R.layout.row,
                        ViewHolder.class,
                        mRef



                ) {
                    @Override
                    protected void populateViewHolder(ViewHolder viewHolder, Model model, int i) {

                        viewHolder.setDetails(getApplicationContext(), model.getTitle(),model.getDescription(),model.getImage());

                    }
                };

        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}

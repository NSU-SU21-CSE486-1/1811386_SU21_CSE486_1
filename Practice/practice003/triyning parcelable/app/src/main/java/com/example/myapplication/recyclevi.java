package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class recyclevi extends AppCompatActivity {
    private final ArrayList<Model> mWordList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private WordlistAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclevi);
        Intent intent = getIntent();
    String    message = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String    message2 = intent.getStringExtra(MainActivity.EXTRA_DOB);
        // Put initial data into the word list.
        for (int i = 0; i < 20; i++) {
            mWordList.add(new Model(message,message2+i));


        }
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new WordlistAdapter(this, mWordList);
        // Connect the adapter with the recycler view.
        mRecyclerView.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    } }

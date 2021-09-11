package com.example.quiz3uniclubz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Recyclevi2 extends AppCompatActivity {
private ViewModel viewModel;
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    List<Model> allmodels= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclevi2);
        Intent intent = getIntent();

        // Create recycler view.
        mRecyclerView = findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
 mAdapter = new WordListAdapter(this, (ArrayList<Model>) allmodels);
        // Connect the adapter with the recycler view.
        mRecyclerView.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    viewModel = ViewModelProviders.of(this).get(ViewModel.class);
    viewModel.getAllNotes().observe(this, new Observer<List<Model>>() {
        @Override
        public void onChanged(@Nullable List<Model> allmodels) {
                mAdapter.setNotes(allmodels);
            }

    });

}

}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent= getIntent();
        // String messagename = intent.getStringExtra(MainActivity.EXTRA_Name);
        //String messagenid = intent.getStringExtra(MainActivity.EXTRA_NID);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainview,new datafragment()).commit();

    }}
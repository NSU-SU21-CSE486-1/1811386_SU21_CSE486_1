package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class newsfeed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsfeed);
        Intent intent = getIntent();
    }

    public void gotoclubcreation(View view) {
        Intent intent = new Intent(this,clubcreation.class);
        startActivity(intent);
    }
}
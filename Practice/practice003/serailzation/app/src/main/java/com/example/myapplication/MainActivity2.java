package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String message8,message9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        message8 = intent.getStringExtra(MainActivity.EXTRA_Name);
        TextView textView = findViewById(R.id.display_name1);
        textView.setText(message8);

       // message9= intent.getStringExtra(MainActivity.EXTRA_NID);
    }
}
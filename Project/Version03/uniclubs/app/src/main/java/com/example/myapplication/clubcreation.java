package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clubcreation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubcreation);
        Intent intent = getIntent();
    }

    public void gotoclubdasroom(View view) {
        Intent intent = new Intent(this ,clubdashroom.class);
        startActivity(intent);
    }
}

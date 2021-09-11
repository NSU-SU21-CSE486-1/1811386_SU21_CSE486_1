package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME =
            "com.example.MainActivity2.NAME";

    public static final String EXTRA_DOB =
            "com.example.MainActivity2.extra.DOB";
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    private EditText messagename;
    private EditText massagedob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messagename= findViewById(R.id.Name);
        massagedob = findViewById(R.id.Name2);
    }


    public void Launchrecyclevi(View view){
        Log.d(LOG_TAG, "Form Submitted");

        Intent intent= new Intent(this,recyclevi.class);
        String message8 = messagename.getText().toString();
        intent.putExtra(EXTRA_NAME, message8);
        String message9 = massagedob.getText().toString();
        intent.putExtra(EXTRA_DOB, message9);

        startActivity(intent);
    }

}
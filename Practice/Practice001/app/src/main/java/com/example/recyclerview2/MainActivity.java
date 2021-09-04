package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_Name =
            "com.example.MainActivity.extra.name";
    public static final String EXTRA_NID =
            "com.example.MainActivity.extra.nid";

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    private EditText editname,editnid;
    private String messagename,messagenid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editname= findViewById(R.id.name);

        editnid= findViewById(R.id.nid);
    }

    public void gotosecond(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, recview.class);
        String message8 = editname.getText().toString();
        intent.putExtra(EXTRA_Name, message8);
        startActivity(intent);

    }
}
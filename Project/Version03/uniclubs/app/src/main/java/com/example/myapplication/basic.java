package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class basic extends AppCompatActivity {
    public static final String EXTRA_NAME =
            "com.example..extra.NAME";

    public static final String EXTRA_DOB =
            "com.example.basic.extra.DOB";

    public static final String EXTRA_NIDNUMBER =
            "com.example.basic.extra.NIDNUMBER";

    public static final String EXTRA_BG =
            "com.example.basic.extra.BG";



    private static final String LOG_TAG =
            basic.class.getSimpleName();

    private EditText editname;
    private EditText editdob;
    private EditText editnidnumber;
    private EditText editbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        Intent intent = getIntent();
        editname = findViewById(R.id.name);
        editdob = findViewById(R.id.dataofbirth);
        editnidnumber = findViewById(R.id.NID);
        editbg = findViewById(R.id.bloodgroup);
    }

    public void launchuni(View view) {
        Intent intent = new Intent(this, UniversityAffiliation.class);

        String message = editname.getText().toString();
        intent.putExtra(EXTRA_NAME, message);

        String message1 = editdob.getText().toString();
        intent.putExtra(EXTRA_DOB, message1);

        String message2 = editnidnumber.getText().toString();
        intent.putExtra(EXTRA_NIDNUMBER, message2);

        String message3 = editbg.getText().toString();
        intent.putExtra(EXTRA_BG, message3);

        startActivity(intent);
    }
}
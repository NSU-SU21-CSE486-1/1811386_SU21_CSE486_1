package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class laststop extends AppCompatActivity {
    private static final String LOG_TAG =
            laststop.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laststop);

        Intent intent = getIntent();
        String message4 = intent.getStringExtra(University_Affiliation.EXTRA_Spinner1);
        TextView textView4 = findViewById(R.id.display_spinner1);
        textView4.setText(message4);

        String message5 = intent.getStringExtra(University_Affiliation.EXTRA_Spinner2);
        TextView textView5 = findViewById(R.id.display_spinner2);
        textView5.setText(message5);
        String message6 = intent.getStringExtra(University_Affiliation.EXTRA_StudentID);
        TextView textView6 = findViewById(R.id.display_student_id);
        textView6.setText(message6);

        String message7 = intent.getStringExtra(University_Affiliation.EXTRA_Studentlevel);
        TextView textView7 = findViewById(R.id.display_studnet_level);
        textView7.setText(message7);

        String message8 = intent.getStringExtra(University_Affiliation.EXTRA_NAME);
        TextView textView8 = findViewById(R.id.display_name1);
        textView8.setText(message8);

        String message9 = intent.getStringExtra(University_Affiliation.EXTRA_DOB);
        TextView textView9 = findViewById(R.id.display_dob1);
        textView9.setText(message9);

        String message10 = intent.getStringExtra(University_Affiliation.EXTRA_NIDNUMBER);
        TextView textView10 = findViewById(R.id.display_nid1);
        textView10.setText(message10);

        String message11 = intent.getStringExtra(University_Affiliation.EXTRA_BG);
        TextView textView11 = findViewById(R.id.display_bloodgroup1);
        textView11.setText(message11);
    }
    public void launchfourthscreen(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this,fourthscreen.class);
        startActivity(intent);
}}
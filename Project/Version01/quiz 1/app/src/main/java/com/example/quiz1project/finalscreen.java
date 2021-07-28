package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finalscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalscreen);
        Intent intent = getIntent();

        String message8 = intent.getStringExtra(fourthscreen.EXTRA_NAME);
        TextView textView8 = findViewById(R.id.display_name2);
        textView8.setText(message8);

        String message9 = intent.getStringExtra(fourthscreen.EXTRA_DOB);
        TextView textView9 = findViewById(R.id.display_dob2);
        textView9.setText(message9);

        String message10 = intent.getStringExtra(fourthscreen.EXTRA_NIDNUMBER);
        TextView textView10 = findViewById(R.id.display_nid2);
        textView10.setText(message10);

        String message11 = intent.getStringExtra(fourthscreen.EXTRA_BG);
        TextView textView11 = findViewById(R.id.display_bloodgroup2);
        textView11.setText(message11);
        
        String message12 = intent.getStringExtra(fourthscreen.EXTRA_Spinner1);
        TextView textView12 = findViewById(R.id.display_spinner1_1);
        textView12.setText(message12);

        String message13 = intent.getStringExtra(fourthscreen.EXTRA_Spinner2);
        TextView textView13 = findViewById(R.id.display_spinner2_1);
        textView13.setText(message13);

        String message14 = intent.getStringExtra(fourthscreen.EXTRA_StudentID);
        TextView textView14 = findViewById(R.id.display_student_id1);
        textView14.setText(message14);

        String message15 = intent.getStringExtra(fourthscreen.EXTRA_Studentlevel);
        TextView textView15 = findViewById(R.id.display_studnet_level1);
        textView15.setText(message15);

        String message16 = intent.getStringExtra(fourthscreen.EXTRA_EMAIL);
        TextView textView16 = findViewById(R.id.email);
        textView16.setText(message16);

        String message17 = intent.getStringExtra(fourthscreen.EXTRA_PHONENUMBER);
        TextView textView17 = findViewById(R.id.phonenumber);
        textView17.setText(message17);
    }
}
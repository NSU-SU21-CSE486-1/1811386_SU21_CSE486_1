package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class phonenumber extends AppCompatActivity {
    public static final String EXTRA_Spinner1 =
            "com.example.phonenumber.extra.Spinner1";
    public static final String EXTRA_Spinner2 =
            "com.example.phonenumber.extra.Spinner2";
    public static final String EXTRA_StudentID =
            "com.example.phonenumber.extra.StudentID";
    public static final String EXTRA_Studentlevel =
            "com.example.phonenumber.extra.Studentlevel";
    public static final String EXTRA_NAME =
            "com.example.phonenumber.NAME";

    public static final String EXTRA_DOB =
            "com.example.phonenumber.extra.DOB";

    public static final String EXTRA_NIDNUMBER =
            "com.example.phonenumber.extra.NIDNUMBER";

    public static final String EXTRA_BG =
            "com.example.phonenumber.extra.BG";
    public static final String EXTRA_EMAIL =
            "com.example.phonenumber.extra.EMAIL";
    private String message, message1, message2, message3, message4, message5, message6, message7, message8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonenumber);
        Intent intent = getIntent();
        message = intent.getStringExtra(UniversityAffiliation.EXTRA_NAME);
        message1 = intent.getStringExtra(UniversityAffiliation.EXTRA_DOB);
        message2 = intent.getStringExtra(UniversityAffiliation.EXTRA_NIDNUMBER);
        message3 = intent.getStringExtra(UniversityAffiliation.EXTRA_BG);
        message4 = intent.getStringExtra(UniversityAffiliation.EXTRA_Spinner1);
     message5 = intent.getStringExtra(UniversityAffiliation.EXTRA_Spinner2);
        message6 = intent.getStringExtra(UniversityAffiliation.EXTRA_StudentID);
        message7 = intent.getStringExtra(UniversityAffiliation.EXTRA_Studentlevel);
        message8 = intent.getStringExtra(UniversityAffiliation.EXTRA_EMAIL);

    }

    public void gotoformsubmit(View view) {
        Intent intent = new Intent(this, formsubmitted.class);
      intent.putExtra(EXTRA_NAME, message);
        intent.putExtra(EXTRA_DOB, message1);
        intent.putExtra(EXTRA_NIDNUMBER, message2);
        intent.putExtra(EXTRA_BG, message3);
        intent.putExtra(EXTRA_Spinner1, message4);
        intent.putExtra(EXTRA_Spinner2, message5);
        intent.putExtra(EXTRA_StudentID, message6);
        intent.putExtra(EXTRA_Studentlevel, message7);
        intent.putExtra(EXTRA_EMAIL, message8);
        startActivity(intent);
    }
}
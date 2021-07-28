package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class fourthscreen extends AppCompatActivity {
    public static final String EXTRA_Spinner1 =
            "com.example.University_Affiliation.extra.Spinner1";
    public static final String EXTRA_Spinner2 =
            "com.example.University_Affiliation.extra.Spinner2";
    public static final String EXTRA_StudentID =
            "com.example.University_Affiliation.extra.StudentID";
    public static final String EXTRA_Studentlevel =
            "com.example.University_Affiliation.extra.Studentlevel";
    public static final String EXTRA_NAME =
            "com.example.University_Affiliation.NAME";
    public static final String EXTRA_DOB =
            "com.example.University_Affiliation.extra.DOB";
    public static final String EXTRA_NIDNUMBER =
            "com.exampleUniversity_Affiliation.extra.NIDNUMBER";
    public static final String EXTRA_BG =
            "com.example.University_Affiliation.extra.BG";
    public static final String EXTRA_EMAIL=
            "com.example.forthscreen.extra.EMAIL";
    public static final String EXTRA_PHONENUMBER=
            "com.example.forthscreen.extra.PHONENUMBER";
    private Spinner mMeassagespinner1;
    private Spinner mMeassagespinner2;
    private EditText mMeassagestudentid;
    private EditText mMeassagestudentlevel;
    private EditText messageemail;
    private EditText massagephonenumber;
    private String message, message1 ,message2, message3,message4,message5,message6,message7,message8,message9;
    private static final String LOG_TAG =
            fourthscreen.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthscreen);    messageemail= findViewById(R.id.email);
        massagephonenumber = findViewById(R.id.phonenumber);
    }

    public void launchfinalscreen(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, finalscreen.class);

        intent.putExtra(EXTRA_NAME,message);
        intent.putExtra(EXTRA_DOB,message1);
        intent.putExtra(EXTRA_NIDNUMBER,message2);
        intent.putExtra(EXTRA_BG,message3);
        intent.putExtra(EXTRA_Spinner1, message4);
        intent.putExtra(EXTRA_Spinner2, message5);
        intent.putExtra(EXTRA_StudentID, message6);
        intent.putExtra(EXTRA_Studentlevel, message7);

        String message6 = messageemail.getText().toString();
        intent.putExtra(EXTRA_EMAIL, message8);

        String message7 = massagephonenumber.getText().toString();
        intent.putExtra(EXTRA_PHONENUMBER, message9);

        startActivity(intent);
    }
}
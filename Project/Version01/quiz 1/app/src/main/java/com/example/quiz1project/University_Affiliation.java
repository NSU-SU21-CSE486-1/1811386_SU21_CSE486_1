package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class University_Affiliation extends AppCompatActivity {
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
    public static final String EXTRA_EMAIL =
            "com.example.University_Affiliation.extra.EMAIL";
    public static final String EXTRA_PHONENUMBER =
            "com.example.University_Affiliation.extra.PHONENUMBER";
    private Spinner mMeassagespinner1;
    private Spinner mMeassagespinner2;
    private EditText mMeassagestudentid;
    private EditText mMeassagestudentlevel;
    private EditText messageemail;
    private EditText massagephonenumber;
    private String message, message1, message2, message3;
    private static final String LOG_TAG =
            University_Affiliation.class.getSimpleName();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_affiliation);

        messageemail =          findViewById(R.id.email);
        massagephonenumber =    findViewById(R.id.phonenumber);
        mMeassagespinner1 =     findViewById(R.id.spinner1);
        mMeassagespinner2 =     findViewById(R.id.spinner2);
        mMeassagestudentid =    findViewById(R.id.StudentID);
        mMeassagestudentlevel = findViewById(R.id.StudentLevel);

        Intent intent = getIntent();

        message = intent.getStringExtra(MainActivity.EXTRA_NAME);
        TextView textView = findViewById(R.id.display_name1);
        textView.setText(message);


        message1 = intent.getStringExtra(MainActivity.EXTRA_DOB);
        TextView textView1 = findViewById(R.id.display_dob1);
        textView1.setText(message1);

        message2 = intent.getStringExtra(MainActivity.EXTRA_NIDNUMBER);
        TextView textView2 = findViewById(R.id.display_nid1);
        textView2.setText(message2);

        message3 = intent.getStringExtra(MainActivity.EXTRA_BG);
        TextView textView3 = findViewById(R.id.display_bloodgroup);
        textView3.setText(message3);


    }

    public void launchlaststop(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, laststop.class);
        intent.putExtra(EXTRA_NAME, message);
        intent.putExtra(EXTRA_DOB, message1);
        intent.putExtra(EXTRA_NIDNUMBER, message2);
        intent.putExtra(EXTRA_BG, message3);

        String message4 = mMeassagespinner1.getSelectedItem().toString();
        intent.putExtra(EXTRA_Spinner1, message4);
        String message5 = mMeassagespinner2.getSelectedItem().toString();
        intent.putExtra(EXTRA_Spinner2, message5);
        String message6 = mMeassagestudentid.getText().toString();
        intent.putExtra(EXTRA_StudentID, message6);
        String message7 = mMeassagestudentlevel.getText().toString();
        intent.putExtra(EXTRA_Studentlevel, message7);
        String message8 = messageemail.getText().toString();
        intent.putExtra(EXTRA_EMAIL, message8);
        String message9 = massagephonenumber.getText().toString();
        intent.putExtra(EXTRA_PHONENUMBER, message9);

        startActivity(intent);
    }

}
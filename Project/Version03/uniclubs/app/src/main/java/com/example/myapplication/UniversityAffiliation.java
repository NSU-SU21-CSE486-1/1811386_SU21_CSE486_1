package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class UniversityAffiliation extends AppCompatActivity {
    public static final String EXTRA_Spinner1 =
            "com.example.UniversityAffiliation.extra.Spinner1";
    public static final String EXTRA_Spinner2 =
            "com.example.UniversityAffiliation.extra.Spinner2";
    public static final String EXTRA_StudentID =
            "com.example.UniversityAffiliation.extra.StudentID";
    public static final String EXTRA_Studentlevel =
            "com.example.UniversityAffiliation.extra.Studentlevel";
    public static final String EXTRA_NAME =
            "com.example.UniversityAffiliation.NAME";

    public static final String EXTRA_DOB =
            "com.example.UniversityAffiliation.extra.DOB";

    public static final String EXTRA_NIDNUMBER =
            "com.exampleUniversityAffiliation.extra.NIDNUMBER";

    public static final String EXTRA_BG =
            "com.example.UniversityAffiliation.extra.BG";
    public static final String EXTRA_EMAIL =
            "com.example.UniversityAffiliation.extra.EMAIL";
    private static final String LOG_TAG =
            UniversityAffiliation.class.getSimpleName();

    private Spinner  editspinner1;
    private Spinner  editspinner2;
    private EditText editstudentid;
    private EditText editstudentlevel;
    private EditText editemail;
    private String message, message1, message2, message3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_affiliation);

        editemail =          findViewById(R.id.email);
        editspinner1 =     findViewById(R.id.spinner1);
       editspinner2 =     findViewById(R.id.spinner2);
        editstudentid =    findViewById(R.id.StudentID);
        editstudentlevel = findViewById(R.id.studentlevel);

        Intent intent = getIntent();
        message = intent.getStringExtra(sign_up.EXTRA_NAME);
        TextView textView = findViewById(R.id.display_name1);
        textView.setText(message);


        message1 = intent.getStringExtra(sign_up.EXTRA_DOB);
        TextView textView1 = findViewById(R.id.display_dob1);
        textView1.setText(message1);

        message2 = intent.getStringExtra(sign_up.EXTRA_NIDNUMBER);
        TextView textView2 = findViewById(R.id.display_nid1);
        textView2.setText(message2);

        message3 = intent.getStringExtra(sign_up.EXTRA_BG);
        TextView textView3 = findViewById(R.id.display_bloodgroup);
        textView3.setText(message3);
    }
    public void addfab0(View view){
        Log.d(LOG_TAG, "Button clicked!");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.wrapper1,new Uniaff2());
        frt.addToBackStack(null);
        frt.commit();
    }
    public void addfab1(View view){
        Log.d(LOG_TAG, "Button clicked!");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.wrapper2,new uniaff3());
        frt.addToBackStack(null);
        frt.commit();
    }
    public void addfab2(View view){
        Log.d(LOG_TAG, "Button clicked!");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.wrapper2,new uniaff4());
        frt.addToBackStack(null);
        frt.commit();
    }
    public void phonenumber(View view){
        Intent intent= new Intent(this,phonenumber.class);
        intent.putExtra(EXTRA_NAME, message);
        intent.putExtra(EXTRA_DOB, message1);
        intent.putExtra(EXTRA_NIDNUMBER, message2);
        intent.putExtra(EXTRA_BG, message3);

       String message4 = editspinner1.getSelectedItem().toString();
        intent.putExtra(EXTRA_Spinner1, message4);

        String message5 =editspinner2.getSelectedItem().toString();
        intent.putExtra(EXTRA_Spinner2, message5);

        String message6 = editstudentid.getText().toString();
        intent.putExtra(EXTRA_StudentID, message6);

        String message7 = editstudentlevel.getText().toString();
        intent.putExtra(EXTRA_Studentlevel, message7);

        String message8 = editemail.getText().toString();
        intent.putExtra(EXTRA_EMAIL, message8);


        startActivity(intent);

    }}
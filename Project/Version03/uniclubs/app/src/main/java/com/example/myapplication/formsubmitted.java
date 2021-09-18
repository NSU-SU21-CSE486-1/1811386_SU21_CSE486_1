package com.example.myapplication;

import static com.example.myapplication.UniversityAffiliation.EXTRA_EMAIL;
import static com.example.myapplication.UniversityAffiliation.EXTRA_PASSWORD;
import static com.example.myapplication.UniversityAffiliation.EXTRA_Spinner1;
import static com.example.myapplication.UniversityAffiliation.EXTRA_Spinner2;
import static com.example.myapplication.UniversityAffiliation.EXTRA_StudentID;
import static com.example.myapplication.UniversityAffiliation.EXTRA_Studentlevel;
import static com.example.myapplication.phonenumber.EXTRA_HOME1;
import static com.example.myapplication.phonenumber.EXTRA_HOME2;
import static com.example.myapplication.phonenumber.EXTRA_HOME3;
import static com.example.myapplication.phonenumber.EXTRA_HOME4;
import static com.example.myapplication.phonenumber.EXTRA_NUMBER1;
import static com.example.myapplication.phonenumber.EXTRA_NUMBER2;
import static com.example.myapplication.phonenumber.EXTRA_NUMBER3;
import static com.example.myapplication.phonenumber.EXTRA_NUMBER4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class formsubmitted extends AppCompatActivity {
String message, message1, message2, message3, message4,message5,message6,message7,message8, message9, message10, message11, message12, message13,message14,message15,message16;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formsubmitted);
        Intent intent = getIntent();

        message = intent.getStringExtra(phonenumber.EXTRA_NAME);
        TextView textView = findViewById(R.id.displayfinalname);
        textView.setText(message);

        message1 = intent.getStringExtra(phonenumber.EXTRA_DOB);
        TextView textView1 = findViewById(R.id.dispalyfinalbod);
        textView1.setText(message1);

        message2 = intent.getStringExtra(phonenumber.EXTRA_NIDNUMBER);
        TextView textView2 = findViewById(R.id.displayfinalnid);
        textView2.setText(message2);

        message3 = intent.getStringExtra(phonenumber.EXTRA_BG);
        TextView textView3 = findViewById(R.id.displayfinalbg);
        textView3.setText(message3);

        message4 = intent.getStringExtra(phonenumber.EXTRA_Spinner1);
        message5 =  intent.getStringExtra(phonenumber.EXTRA_Spinner2);
        message6 = intent.getStringExtra(phonenumber.EXTRA_StudentID);
        message7  = intent.getStringExtra(phonenumber.EXTRA_Studentlevel);
        message8 = intent.getStringExtra(phonenumber.EXTRA_EMAIL);
        message9 = intent.getStringExtra(phonenumber.EXTRA_HOME1);
        message10 =  intent.getStringExtra(phonenumber.EXTRA_HOME2);
        message11 = intent.getStringExtra(phonenumber.EXTRA_HOME3);
        message12  = intent.getStringExtra(phonenumber.EXTRA_HOME4);
        message13 = intent.getStringExtra(phonenumber.EXTRA_NUMBER1);
        message14 = intent.getStringExtra(phonenumber.EXTRA_NUMBER2);
        message15 = intent.getStringExtra(phonenumber.EXTRA_NUMBER3);
        message16 = intent.getStringExtra(phonenumber.EXTRA_NUMBER4);
    }

    public void gotodisplayUA(View view) {
        Intent intent = new Intent(this, displayUA.class);
        intent.putExtra(EXTRA_Spinner1, message4);
        intent.putExtra(EXTRA_Spinner2, message5);
        intent.putExtra(EXTRA_StudentID, message6);
        intent.putExtra(EXTRA_Studentlevel, message7);
        intent.putExtra(EXTRA_EMAIL,message8);

        intent.putExtra(EXTRA_HOME1,message9);
        intent.putExtra(EXTRA_HOME2,message10);
        intent.putExtra(EXTRA_HOME3,message11);
        intent.putExtra(EXTRA_HOME4,message12);
        intent.putExtra(EXTRA_NUMBER1,message13);
        intent.putExtra(EXTRA_NUMBER2,message14);
        intent.putExtra(EXTRA_NUMBER3,message15);
        intent.putExtra(EXTRA_NUMBER4,message16);


        startActivity(intent);
    }
}
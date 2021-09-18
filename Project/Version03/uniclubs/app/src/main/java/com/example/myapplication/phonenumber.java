package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    public static final String EXTRA_PASSWORD =
            "com.example.phonenumber.extra.password";

    public static final String EXTRA_HOME1 =
            "com.example.phonenumber.extra.home1";

    public static final String EXTRA_NUMBER1 =
            "com.example.phonenumber.extra.NUMBER1";

    public static final String EXTRA_HOME2 =
            "com.example.phonenumber.extra.home2";

    public static final String EXTRA_NUMBER2 =
            "com.example.phonenumber.extra.NUMBER2";
    public static final String EXTRA_HOME3 =
            "com.example.phonenumber.extra.home3";

    public static final String EXTRA_NUMBER3 =
            "com.example.phonenumber.extra.NUMBER3";

    public static final String EXTRA_HOME4 =
            "com.example.phonenumber.extra.home4";

    public static final String EXTRA_NUMBER4 =
            "com.example.phonenumber.extra.NUMBER4";


    private String message, message1, message2, message3, message4, message5, message6, message7, message8,message21;

    private EditText edithome1,edithome2,edithome3,edithome4,editnumber1,editnumber2,editnumber3,editnumber4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonenumber);
        edithome1= findViewById(R.id.home1);
        edithome2= findViewById(R.id.home2);
        edithome3= findViewById(R.id.home3);
        edithome4= findViewById(R.id.home4);
        editnumber1= findViewById(R.id.number1);
        editnumber2= findViewById(R.id.number2);
        editnumber3= findViewById(R.id.number3);
        editnumber4= findViewById(R.id.number4);

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

        String message4 = edithome1.getText().toString();
        intent.putExtra(EXTRA_HOME1, message4);

        String message5 =edithome2.getText().toString();
        intent.putExtra(EXTRA_HOME2, message5);

        String message6 = edithome3.getText().toString();
        intent.putExtra(EXTRA_HOME3, message6);

        String message7 = edithome4.getText().toString();
        intent.putExtra(EXTRA_HOME4, message7);

        String message8 = editnumber1.getText().toString();
        intent.putExtra(EXTRA_NUMBER1, message8);

        String message9 = editnumber2.getText().toString();
        intent.putExtra(EXTRA_NUMBER2, message9);

        String message10 = editnumber3.getText().toString();
        intent.putExtra(EXTRA_NUMBER3, message10);

        String message11 = editnumber4.getText().toString();
        intent.putExtra(EXTRA_NUMBER4, message11);




        startActivity(intent);
    }
}
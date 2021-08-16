package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class fourthscreen extends AppCompatActivity {
    public static final String EXTRA_Spinner1 =
            "com.example.fourthscreen.extra.Spinner1";
    public static final String EXTRA_Spinner2 =
            "com.example.fourthscreen.extra.Spinner2";
    public static final String EXTRA_StudentID =
            "com.example.fourthscreen.extra.StudentID";
    public static final String EXTRA_Studentlevel =
            "com.example.fourthscreen.extra.Studentlevel";
    public static final String EXTRA_NAME =
            "com.example.fourthscreen.NAME";
    public static final String EXTRA_DOB =
            "com.example.fourthscreen.extra.DOB";
    public static final String EXTRA_NIDNUMBER =
            "com.fourthscreen.extra.NIDNUMBER";
    public static final String EXTRA_BG =
            "com.example.fourthscreen.extra.BG";
    public static final String EXTRA_EMAIL =
            "com.example.fourthscreen.extra.EMAIL";
    public static final String EXTRA_PHONENUMBER =
            "com.example.fourthscreen.extra.PHONENUMBER";
    private EditText messageemail;
    private EditText massagephonenumber;
    private String message;
    private String message1;
    private String message2;
    private String message3;
    private String message4;
    private String message5;
    private String message6;
    private String message7;
    private String message8;
    private static final String LOG_TAG =
            fourthscreen.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthscreen);

        messageemail = findViewById(R.id.email);
        massagephonenumber = findViewById(R.id.phonenumber);

        Intent intent = getIntent();
         message = intent.getStringExtra(laststop.EXTRA_NAME);

         message1 = intent.getStringExtra(laststop.EXTRA_DOB);

         message2 = intent.getStringExtra(laststop.EXTRA_NIDNUMBER);

         message3 = intent.getStringExtra(laststop.EXTRA_BG);


         message4 = intent.getStringExtra(laststop.EXTRA_Spinner1);


         message5 = intent.getStringExtra(laststop.EXTRA_Spinner2);


         message6 = intent.getStringExtra(laststop.EXTRA_StudentID);


        String message7 = intent.getStringExtra(University_Affiliation.EXTRA_Studentlevel);
        TextView textView7 = findViewById(R.id.display_studnet_level);
        textView7.setText(message7);




    }

    public void launchfinalscreen(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, finalscreen.class);

        intent.putExtra(EXTRA_NAME, message);
        intent.putExtra(EXTRA_DOB, message1);
        intent.putExtra(EXTRA_NIDNUMBER, message2);
        intent.putExtra(EXTRA_BG, message3);
        intent.putExtra(EXTRA_Spinner1, message4);
        intent.putExtra(EXTRA_Spinner2, message5);
        intent.putExtra(EXTRA_StudentID, message6);
        intent.putExtra(EXTRA_Studentlevel, message7);

        message8 = messageemail.getText().toString();
        intent.putExtra(EXTRA_EMAIL, message8);
        String message9 = massagephonenumber.getText().toString();
        intent.putExtra(EXTRA_PHONENUMBER, message9);

        startActivity(intent);
    }
}
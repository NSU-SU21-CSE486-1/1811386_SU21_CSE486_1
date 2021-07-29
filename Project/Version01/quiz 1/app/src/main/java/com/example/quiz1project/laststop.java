package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class laststop extends AppCompatActivity {
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

    private static final String LOG_TAG =
            University_Affiliation.class.getSimpleName();
private String message,message1,message2,message3,message4,message5,message6,message7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laststop);

        Intent intent = getIntent();

        String message = intent.getStringExtra(University_Affiliation.EXTRA_NAME);
        TextView textView = findViewById(R.id.display_name1);
        textView.setText(message);

        String message1 = intent.getStringExtra(University_Affiliation.EXTRA_DOB);
        TextView textView1 = findViewById(R.id.display_dob1);
        textView1.setText(message1);

        String message2 = intent.getStringExtra(University_Affiliation.EXTRA_NIDNUMBER);
        TextView textView2 = findViewById(R.id.display_nid1);
        textView2.setText(message2);

        String message3 = intent.getStringExtra(University_Affiliation.EXTRA_BG);
        TextView textView3 = findViewById(R.id.display_bloodgroup1);
        textView3.setText(message3);

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

    }

    public void launchfourthscreen(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, fourthscreen.class);
        intent.putExtra(EXTRA_NAME, message);
        intent.putExtra(EXTRA_DOB, message1);
        intent.putExtra(EXTRA_NIDNUMBER, message2);
        intent.putExtra(EXTRA_BG, message3);
        intent.putExtra(EXTRA_Spinner1, message4);
        intent.putExtra(EXTRA_Spinner2, message5);
        intent.putExtra(EXTRA_StudentID, message6);
        intent.putExtra(EXTRA_Studentlevel, message7);
        startActivity(intent);
    }
}
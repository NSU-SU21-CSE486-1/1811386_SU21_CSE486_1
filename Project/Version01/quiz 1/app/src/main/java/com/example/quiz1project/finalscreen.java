package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class finalscreen extends AppCompatActivity {



    private String message, message1, message2, message3, message4, message5, message6, message7 ,message8,message9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalscreen);
        Intent intent = getIntent();

        message = intent.getStringExtra(fourthscreen.EXTRA_NAME);
        TextView textView = findViewById(R.id.display_name2);
        textView.setText(message);

         message1 = intent.getStringExtra(fourthscreen.EXTRA_DOB);
        TextView textView1 = findViewById(R.id.display_dob2);
        textView1.setText(message1);

         message2 = intent.getStringExtra(fourthscreen.EXTRA_NIDNUMBER);
        TextView textView2 = findViewById(R.id.display_nid2);
        textView2.setText(message2);

         message3 = intent.getStringExtra(fourthscreen.EXTRA_BG);
        TextView textView3 = findViewById(R.id.display_bloodgroup2);
        textView3.setText(message3);

         message4 = intent.getStringExtra(fourthscreen.EXTRA_Spinner1);
        TextView textView4 = findViewById(R.id.display_spinner1_1);
        textView4.setText(message4);

         message5 = intent.getStringExtra(fourthscreen.EXTRA_Spinner2);
        TextView textView5 = findViewById(R.id.display_spinner2_1);
        textView5.setText(message5);

         message6 = intent.getStringExtra(fourthscreen.EXTRA_StudentID);
        TextView textView6 = findViewById(R.id.display_student_id1);
        textView6.setText(message6);

         message7 = intent.getStringExtra(fourthscreen.EXTRA_Studentlevel);
        TextView textView7 = findViewById(R.id.display_studnet_level1);
        textView7.setText(message7);

         message8 = intent.getStringExtra(fourthscreen.EXTRA_EMAIL);
        TextView textView8 = findViewById(R.id.email);
        textView8.setText(message8);

         message9 = intent.getStringExtra(fourthscreen.EXTRA_PHONENUMBER);
        TextView textView9 = findViewById(R.id.phonenumber);
        textView9.setText(message9);
    }
}
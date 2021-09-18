package com.example.myapplication;

import static com.example.myapplication.phonenumber.EXTRA_HOME1;
import static com.example.myapplication.phonenumber.EXTRA_HOME2;
import static com.example.myapplication.phonenumber.EXTRA_HOME3;
import static com.example.myapplication.phonenumber.EXTRA_HOME4;
import static com.example.myapplication.phonenumber.EXTRA_NUMBER1;
import static com.example.myapplication.phonenumber.EXTRA_NUMBER2;
import static com.example.myapplication.phonenumber.EXTRA_NUMBER3;
import static com.example.myapplication.phonenumber.EXTRA_NUMBER4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class displayUA extends AppCompatActivity {
    private FirebaseAuth mAuth;
    String message4,message5,message6,message7,message8 ,message9, message10, message11, message12, message13,message14,message15,message16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_ua);
mAuth= FirebaseAuth.getInstance();


        Intent intent = getIntent();

         message4 = intent.getStringExtra(UniversityAffiliation.EXTRA_Spinner1);
        TextView textView4 = findViewById(R.id.displaystudentuniversity);
        textView4.setText(message4);

        message5 = intent.getStringExtra(UniversityAffiliation.EXTRA_Spinner2);
        TextView textView5 = findViewById(R.id.displaystudentdepartment);
        textView5.setText(message5);

        message6 = intent.getStringExtra(UniversityAffiliation.EXTRA_StudentID);
        TextView textView6 = findViewById(R.id.displaystudnetID);
        textView6.setText(message6);

      message7 = intent.getStringExtra(UniversityAffiliation.EXTRA_Studentlevel);
        TextView textView7 = findViewById(R.id.displaystudentlevel);
        textView7.setText(message7);

          message8 = intent.getStringExtra(UniversityAffiliation.EXTRA_EMAIL);
        TextView textView8 = findViewById(R.id.displayemail);
        textView8.setText(message8);

        message9 = intent.getStringExtra(phonenumber.EXTRA_HOME1);
        message10 =  intent.getStringExtra(phonenumber.EXTRA_HOME2);
        message11 = intent.getStringExtra(phonenumber.EXTRA_HOME3);
        message12  = intent.getStringExtra(phonenumber.EXTRA_HOME4);
        message13 = intent.getStringExtra(phonenumber.EXTRA_NUMBER1);
        message14 = intent.getStringExtra(phonenumber.EXTRA_NUMBER2);
        message15 = intent.getStringExtra(phonenumber.EXTRA_NUMBER3);
        message16 = intent.getStringExtra(phonenumber.EXTRA_NUMBER4);
    }




    public void gotodisplayphonenumbers(View view) {
        Intent intent = new Intent(this, display_phonenumber.class);
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
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class displayUA extends AppCompatActivity {
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_ua);

        Intent intent = getIntent();
        String message4 = intent.getStringExtra(UniversityAffiliation.EXTRA_Spinner1);
        TextView textView4 = findViewById(R.id.displaystudentuniversity);
        textView4.setText(message4);

        String message5 = intent.getStringExtra(UniversityAffiliation.EXTRA_Spinner2);
        TextView textView5 = findViewById(R.id.displaystudentdepartment);
        textView5.setText(message5);

        String message6 = intent.getStringExtra(UniversityAffiliation.EXTRA_StudentID);
        TextView textView6 = findViewById(R.id.displaystudnetID);
        textView6.setText(message6);

        String message7 = intent.getStringExtra(UniversityAffiliation.EXTRA_Studentlevel);
        TextView textView7 = findViewById(R.id.displaystudentlevel);
        textView7.setText(message7);

        String  message8 = intent.getStringExtra(UniversityAffiliation.EXTRA_EMAIL);
        TextView textView8 = findViewById(R.id.displayemail);
        textView8.setText(message8);

    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    public void gotodisplayphonenumbers(View view) {
        mAuth = FirebaseAuth.getInstance();
    }
}
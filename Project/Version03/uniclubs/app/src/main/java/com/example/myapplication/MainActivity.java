package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void launchsignup(View view){
        Intent intent= new Intent(this,sign_up.class);
        startActivity(intent);

    }

    public void gotonewsfeed(View view) {
        Intent intent= new Intent(this,newsfeed.class);
        startActivity(intent);
    }
}
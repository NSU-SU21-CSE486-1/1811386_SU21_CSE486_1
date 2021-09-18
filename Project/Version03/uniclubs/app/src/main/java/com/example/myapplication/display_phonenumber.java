package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class display_phonenumber extends AppCompatActivity {
    String message4,message5,message6,message7,message8 ,message9, message10, message11, message12, message13,message14,message15,message16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_phonenumber);
        Intent intent = getIntent();

        message4 = intent.getStringExtra(phonenumber.EXTRA_HOME1);
        TextView textView4 = findViewById(R.id.display_home1);
        textView4.setText(message4);

        message5 = intent.getStringExtra(phonenumber.EXTRA_HOME2);
        TextView textView5 = findViewById(R.id.display_home2);
        textView5.setText(message5);

        message6 = intent.getStringExtra(phonenumber.EXTRA_HOME3);
        TextView textView6 = findViewById(R.id.display_home3);
        textView6.setText(message6);

        message7 = intent.getStringExtra(phonenumber.EXTRA_HOME4);
        TextView textView7 = findViewById(R.id.display_home4);
        textView7.setText(message7);

        message8 = intent.getStringExtra(phonenumber.EXTRA_NUMBER1);
        TextView textView8 = findViewById(R.id.display_number1);
        textView8.setText(message8);

        message9 = intent.getStringExtra(phonenumber.EXTRA_NUMBER2);
        TextView textView9 = findViewById(R.id.display_number2);
        textView9.setText(message9);

        message10 = intent.getStringExtra(phonenumber.EXTRA_NUMBER3);
        TextView textView10 = findViewById(R.id.display_number3);
        textView10.setText(message10);

        message11 = intent.getStringExtra(phonenumber.EXTRA_NUMBER4);
        TextView textView11 = findViewById(R.id.display_number4);
        textView11.setText(message11);

    }

    public void gotonewsfeed(View view) {
        Intent intent = new Intent(this,newsfeed.class);
        startActivity(intent);
    }
}
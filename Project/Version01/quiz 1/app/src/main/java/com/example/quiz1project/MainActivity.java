package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME =
            "com.example.MainActivity.extra.NAME";

    public static final String EXTRA_DOB =
            "com.example.MainActivity.extra.DOB";

    public static final String EXTRA_NIDNUMBER =
            "com.example.MainActivity.extra.NIDNUMBER";

    public static final String EXTRA_BG =
            "com.example.MainActivity.extra.BG";
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    private EditText mMessageEditText;
    private EditText messagedateofbirth;
    private EditText messageNIDNUMBER;
    private EditText messagebg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.name);
        messagedateofbirth = findViewById(R.id.dataofbirth);
        messageNIDNUMBER = findViewById(R.id.NID);
        messagebg = findViewById(R.id.bloodgroup);
    }

    public void launchUniversity_Affiliation(View view) {
        Log.d(LOG_TAG, "Button clicked!");

        Intent intent = new Intent(this, University_Affiliation.class);

        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_NAME, message);
        String message1 = messagedateofbirth.getText().toString();
        intent.putExtra(EXTRA_DOB, message1);
        String message2 = messageNIDNUMBER.getText().toString();
        intent.putExtra(EXTRA_NIDNUMBER, message2);
        String message3 = messagebg.getText().toString();
        intent.putExtra(EXTRA_BG, message3);
        startActivity(intent);


    }
}
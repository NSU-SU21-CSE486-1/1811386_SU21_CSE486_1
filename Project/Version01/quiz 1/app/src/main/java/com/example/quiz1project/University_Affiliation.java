package com.example.quiz1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class University_Affiliation extends AppCompatActivity {
  private  ArrayAdapter<CharSequence> adapater,child_adapater;
  private  Spinner University_spinner,department_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_affiliation);
        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_NAME);
        TextView textView = findViewById(R.id.display_name);
        textView.setText(message);


        String message1 = intent.getStringExtra(MainActivity.EXTRA_DOB);
        TextView textView1 = findViewById(R.id.display_dob);
        textView1.setText(message1);

        String message2 = intent.getStringExtra(MainActivity.EXTRA_NIDNUMBER);
        TextView textView2 = findViewById(R.id.display_nid);
        textView2.setText(message2);

        String message3 = intent.getStringExtra(MainActivity.EXTRA_BG);
        TextView textView3 = findViewById(R.id.display_bloodgroup);
        textView3.setText(message3);
    }

    Spinner University_spinner =findViewById(R.id.spinner1);
    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array_uninersity, android.R.layout.simple_spinner_item);

adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

University_spinner.setAdapter(adapter);

}
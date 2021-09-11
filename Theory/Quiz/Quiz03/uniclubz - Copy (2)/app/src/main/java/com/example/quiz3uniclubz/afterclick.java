package com.example.quiz3uniclubz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class afterclick extends AppCompatActivity {
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.afterclick);


        tv1=(TextView)findViewById(R.id.desc_header);
        tv2=(TextView)findViewById(R.id.desc_desc);


        tv1.setText(getIntent().getStringExtra("name"));
        tv2.setText(getIntent().getStringExtra("nid"));
    }
    }

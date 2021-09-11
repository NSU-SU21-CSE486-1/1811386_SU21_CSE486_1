package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Current count
    private int mCount;
    // Current background color
    private int mColor;
    // Text view to display both count and color
    private TextView mShowCountTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mShowCountTextView = (TextView) findViewById(R.id.count_textview);
        mColor = ContextCompat.getColor(this, R.color.black);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
      String  message1 = intent.getStringExtra(MainActivity2.EXTRA_COUNT);
        TextView textView2 = findViewById(R.id.count_textview);
        textView2.setText(message1);
       // mCount = Integer.parseInt(message1);
    }
    public void settings(View View){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}
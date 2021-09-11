package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_COUNT =
            "com.example.myapplication.extra.count";
    // Current count
    private int mCount = 0;
    // Current background color
    private int mColor;
    // Text view to display both count and color
    private TextView mShowCountTextView;
    // Key for current count
    private final String COUNT_KEY = "count";
    // Key for current color
    private final String COLOR_KEY = "color";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mShowCountTextView = (TextView) findViewById(R.id.count_textview);
        mColor = ContextCompat.getColor(this, R.color.black);
        Intent intent = getIntent();
    }


    public void countUp(View view) {
        Intent intent= new Intent(this , MainActivity.class);
        mCount++;
     String message=   String.format("%s", mCount);
        intent.putExtra(EXTRA_COUNT,message);

        startActivity(intent);
    }
    public void changeBackground(View view) {
        Intent intent= new Intent(this , MainActivity.class);
        int color = ((ColorDrawable) view.getBackground()).getColor();
      intent.putExtra(color);
        ///mColor = color;
        startActivity(intent);
    }

}
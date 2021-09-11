package com.example.sendparcel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
public static final String   EXTRA_DATA = "EXTRA_DATA";
TextView textView,textView1,textView2;
private ArrayList<Employes>employes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);



        employes=getIntent().getParcelableArrayListExtra(EXTRA_DATA);
        textView.setText(employes.get(0).getName());
        textView1.setText(employes.get(0).getEmail());
        textView2.setText(employes.get(0).getAge()+"");
    }
}
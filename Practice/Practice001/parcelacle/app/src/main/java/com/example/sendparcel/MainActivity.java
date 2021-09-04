package com.example.sendparcel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Employes>employes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addEmployes(){
        employes= new ArrayList<>();
        employes.add(new Employes("ahadul","gmail",23));
        employes.add(new Employes("ahadul","gmail",23));
    }

    public void senddata(View view){
        Intent intent=new Intent(this,MainActivity2.class);
        addEmployes();
        intent.putParcelableArrayListExtra(MainActivity2.EXTRA_DATA,employes);
        startActivity(intent);
    }
}
package com.example.quiz2_uniclubz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class recycleview extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        Intent intent= getIntent();
        setTitle("Recycler and Card View Demo");
        rcv = (RecyclerView) findViewById(R.id.mainview);
        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);

    }
    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setName("Ahadul Islam");
        ob1.setNid("123456789");
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setName("Tom");
        ob2.setNid("987654321");

        holder.add(ob2);

        return holder;
    }
}
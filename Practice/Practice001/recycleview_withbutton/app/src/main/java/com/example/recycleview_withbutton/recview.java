package com.example.recycleview_withbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;



import java.util.ArrayList;

public class recview extends AppCompatActivity {

    RecyclerView rcv;
    myadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recview);

        Intent intent = getIntent();
        setTitle("Recycler and Card View Demo");


        rcv = (RecyclerView) findViewById(R.id.recview);
        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);

    }
   public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

    Model ob1=new Model();
        ob1.setHeader("C Programming");
        ob1.setDesc("Desktop Programming");
        holder.add(ob1);

    Model ob2=new Model();
        ob2.setHeader("C++ Programming");
        ob2.setDesc("Desktop Progamming Language");
        holder.add(ob2);

       return holder;
}

}
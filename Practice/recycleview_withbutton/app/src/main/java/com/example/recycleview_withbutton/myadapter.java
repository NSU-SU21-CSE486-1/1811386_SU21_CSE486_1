package com.example.recycleview_withbutton;


import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder> implements Parcelable
{
    ArrayList<Model> data;
    Context context;
    public myadapter(ArrayList<Model> data, Context context)

    {
        this.data = data;
        this.context=context;

    }

    protected myadapter(Parcel in) {
    }

    public static final Creator<myadapter> CREATOR = new Creator<myadapter>() {
        @Override
        public myadapter createFromParcel(Parcel in) {
            return new myadapter(in);
        }

        @Override
        public myadapter[] newArray(int size) {
            return new myadapter[size];
        }
    };

    @NonNull
@Override
public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
{
    LayoutInflater inflater= LayoutInflater.from(parent.getContext());
    View view=inflater.inflate(R.layout.singlerow,parent,false);
    return new myviewholder(view);
}

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, int position)
    {
        final Model temp=data.get(position);

        holder.t1.setText(data.get(position).getHeader());
        holder.t2.setText(data.get(position).getDesc());


        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override       public void onClick(View v) {

                Intent intent=new Intent(context,Main2Activity.class);

                intent.putExtra("header",temp.getHeader());
                intent.putExtra("desc",temp.getDesc());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
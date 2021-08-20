package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class viewadapter extends RecyclerView.Adapter<viewadapter.Viewholder> {


    ArrayList<data> datalist;


    public viewadapter(ArrayList<data> datalist) {
        this.datalist = datalist;
    }


    @NonNull
    @Override
    public viewadapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singleview, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewadapter.Viewholder holder, int position) {

        String cardname = datalist.get(position).getName();
        String cardnid = datalist.get(position).getNid();
        holder.setData(cardname, cardnid);
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView tapname, tapnid;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            tapname = itemView.findViewById(R.id.t1);
            tapnid = itemView.findViewById(R.id.t2);

        }


        public void setData(String cardname, String cardnid) {
            tapname.setText(cardname);
            tapnid.setText(cardnid);

        }
    }


}

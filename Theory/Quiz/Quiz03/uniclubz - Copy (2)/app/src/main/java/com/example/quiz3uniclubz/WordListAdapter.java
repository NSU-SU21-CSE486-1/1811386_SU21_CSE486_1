package com.example.quiz3uniclubz;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private  List<Model> allmodles = new ArrayList<>();
    private final LayoutInflater mInflater;
    private Context context;


    public static class WordViewHolder extends RecyclerView.ViewHolder {
        public final TextView wordItemView;
        public final TextView wordItemView2;
        public final TextView wordItemView3;
        final WordListAdapter mAdapter;
        RelativeLayout relativeLayout;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            wordItemView2 = itemView.findViewById(R.id.word1);
            wordItemView3 = itemView.findViewById(R.id.word2);
            relativeLayout= itemView.findViewById(R.id.cad);
            this.mAdapter = adapter;

        }


    }

    public WordListAdapter(Context context, ArrayList<Model> wordList) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
        this.allmodles = wordList;


    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {

        holder.wordItemView.setText(allmodles.get(position).name);
        holder.wordItemView2.setText(allmodles.get(position).nid);
        holder.wordItemView3.setText(allmodles.get(position).priority);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, afterclick.class);

                intent.putExtra("name", allmodles.get(position).name);
                intent.putExtra("nid",allmodles.get(position).nid);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    public void setNotes(List<Model> allmodles) {
        this.allmodles =allmodles;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return allmodles.size();
    }
}
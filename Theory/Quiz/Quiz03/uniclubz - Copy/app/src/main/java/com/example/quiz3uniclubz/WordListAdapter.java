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

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final ArrayList<Model> mWordList;
    private final LayoutInflater mInflater;
    private Context context;

    public static class WordViewHolder extends RecyclerView.ViewHolder {
        public final TextView wordItemView;
        public final TextView wordItemView2;
        final WordListAdapter mAdapter;
        RelativeLayout relativeLayout;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            wordItemView2 = itemView.findViewById(R.id.word1);
            relativeLayout= itemView.findViewById(R.id.cad);
            this.mAdapter = adapter;

        }


    }

    public WordListAdapter(Context context, ArrayList<Model> wordList) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mWordList = wordList;


    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        // Retrieve the data for that position.
        holder.wordItemView.setText(mWordList.get(position).name);
        holder.wordItemView2.setText(mWordList.get(position).nid);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, afterclick.class);

                intent.putExtra("name", mWordList.get(position).name);
                intent.putExtra("nid", mWordList.get(position).nid);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
package com.example.recyclerview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WordlistAdapter extends
        RecyclerView.Adapter<WordlistAdapter.WordViewHolder>{

    private final ArrayList<model> mWordList;

    private final LayoutInflater mInflater;


    public static class WordViewHolder extends RecyclerView.ViewHolder {
        public final TextView wordItemView;
        public final TextView wordItemView2;
        final WordlistAdapter mAdapter;

        public WordViewHolder(View itemView, WordlistAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            wordItemView2 = itemView.findViewById(R.id.word2);
            this.mAdapter = adapter;
            //  itemView.setOnClickListener(this);
        }


    }

    public WordlistAdapter(Context context, ArrayList<model> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = wordList;
    }
    @NonNull
    @Override
    public WordlistAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordlistAdapter.WordViewHolder holder, int position) {
      holder.wordItemView.setText (mWordList.get(position).name);
        holder.wordItemView2.setText(mWordList.get(position).nid);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}

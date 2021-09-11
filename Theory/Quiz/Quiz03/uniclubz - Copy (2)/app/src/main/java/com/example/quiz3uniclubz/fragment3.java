package com.example.quiz3uniclubz;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class fragment3 extends Fragment {
    public static final String EXTRA_NAME =
            "com.example.Fragment3.NAME";

    public static final String EXTRA_NID =
            "com.example.Fragment3.extra.NID";
    EditText messagename,messagenid;

Button b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment3, container, false);
       return v;


}}
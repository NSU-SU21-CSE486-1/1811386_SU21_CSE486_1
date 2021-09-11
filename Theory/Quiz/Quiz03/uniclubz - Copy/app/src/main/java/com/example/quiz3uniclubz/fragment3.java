package com.example.quiz3uniclubz;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
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
    private EditText editname,editnid;
Button b;
   // editname= findViewById(R.id.name);
    //editnid= findViewById(R.id.nid);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v= inflater.inflate(R.layout.fragment3, container, false);
      /*public void onClick3submitform(View view){
            Log.d(LOG_TAG, "Form Submitted");

            Intent intent= new Intent(this,Recyclevi2.class);
            String message8 = editname.getText().toString();
            intent.putExtra(EXTRA_NAME, message8);
            String message9 = editnid.getText().toString();
            intent.putExtra(EXTRA_NID, message9);
            startActivity(intent);*/

       return v;    }


}
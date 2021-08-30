package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String COMMON_TAG = "CombinedLifeCycle";
    private static final String ACTIVITY_NAME = MainActivity.class.getSimpleName();
    private static final String TAG = COMMON_TAG;

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, ACTIVITY_NAME+" onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, ACTIVITY_NAME+" onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, ACTIVITY_NAME+" onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, ACTIVITY_NAME+" onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, ACTIVITY_NAME+" onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, ACTIVITY_NAME+" onDestroy");
    }

    private void addFragment(){
        Fragment fragment=new SampleFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment,fragment,"demofragment");
        fragmentTransaction.addToBackStack("fragmentStack1");
        fragmentTransaction.commit();
    }
    public void startframent(View view){
        Log.d(LOG_TAG, "Button clicked!2");
        addFragment();
}}
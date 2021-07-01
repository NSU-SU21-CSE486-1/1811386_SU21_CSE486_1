package com.example.lab_tasks1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            for (int i = 0;i >=0; i++){
                println("jkhgjfsdadfgh");
            }
        }
        catch (Exception e) {
          log.e  ("MainActivity" , "Happy  Birthday");
        }
    }


}
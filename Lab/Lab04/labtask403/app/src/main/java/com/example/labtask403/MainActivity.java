package com.example.labtask403;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showDatePicker(View view){
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),"datePicker");
    }
    public void seetime(View view){
        DialogFragment newFragment = new timefragment();
        newFragment.show(getSupportFragmentManager(),"timepicker");
    }
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (day_string+
                "/" + month_string + "/" + year_string);

        Toast.makeText(this, "Date: " + dateMessage,
                Toast.LENGTH_SHORT).show();
        TextView textView= findViewById(R.id.displaydate);
        textView.setText("Date is :"+day_string+"/"+month_string+"/"+year_string);
    }


    public void processTimePickerResult(int hourOfDay, int minute) {
String hour= Integer.toString(hourOfDay);
String min= Integer.toString(minute);
String timemessage = (hour+":"+min);
        Toast.makeText(this, "Time: " +timemessage,
                Toast.LENGTH_SHORT).show();
        TextView textView2= findViewById(R.id.displaytime);
        textView2.setText("time is :"+hour+":"+min);
    }
}
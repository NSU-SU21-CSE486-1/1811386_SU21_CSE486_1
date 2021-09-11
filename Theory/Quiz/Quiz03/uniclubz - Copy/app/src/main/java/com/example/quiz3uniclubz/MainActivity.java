package com.example.quiz3uniclubz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_NAME =
            "com.example.MainActivity.NAME";

    public static final String EXTRA_DOB =
            "com.example.MainActivity.extra.DOB";

    public static final String EXTRA_NID =
            "com.example.MainActivity.extra.NID";

    private EditText editname,editnid;
    private String messagename,messagenid;

    private ViewPager viewPager;
    private TabLayout tabLayout;
    TabItem tabItem1,tabItem2,tabItem3;
    FloatingActionButton fab;
    VPadapter vpadapter;
    Button button;
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = findViewById(R.id.addfab);
        tabLayout = findViewById(R.id.tablayout1);
        viewPager = findViewById(R.id.viewpager);
        tabItem1= findViewById(R.id.basic);
        tabItem2= findViewById(R.id.uniaff);
        tabItem3= findViewById(R.id.numberfrg);
        editname= findViewById(R.id.name);
        editnid= findViewById(R.id.nid);

        vpadapter= new VPadapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(vpadapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2)
                    vpadapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
    public void onClick(View view){
        Log.d(LOG_TAG, "Button clicked!");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.wrapper1,new fragment2_1());
        frt.addToBackStack(null);
        frt.commit();
    }
    public void onClick2(View view){
        Log.d(LOG_TAG, "Button clicked!2");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.calledfragment,new fragment2_2());
        frt.addToBackStack(null);
        frt.commit();
    }
    public void addnumber(View view){
        Log.d(LOG_TAG, "Button clicked!2");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.wrapper3,new fragment3_1());
        frt.addToBackStack(null);
        frt.commit();
    }
    public void addnumber2(View view){
        Log.d(LOG_TAG, "Button clicked!2");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.wrapper3_1,new fragment3_2());
        frt.addToBackStack(null);
        frt.commit();
    }
   public void onClick3submitform(View view){
        Log.d(LOG_TAG, "Form Submitted");

        Intent intent= new Intent(this,Recyclevi2.class);

        startActivity(intent);
    }
}
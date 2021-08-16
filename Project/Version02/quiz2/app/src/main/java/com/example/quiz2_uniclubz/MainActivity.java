package com.example.quiz2_uniclubz;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    private ViewPager viewPager;
private TabLayout tabLayout;
TabItem tabItem1,tabItem2,tabItem3;
FloatingActionButton fab;
VPadapter vpadapter;

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


    }   public void onClick(View view){
        Log.d(LOG_TAG, "Button clicked!");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.wrapper,new fragment2_1());
        frt.addToBackStack(null);
        frt.commit();
    }
    public void onClick2(View view){
        Log.d(LOG_TAG, "Button clicked!");
        FragmentManager frm =getSupportFragmentManager();
        FragmentTransaction frt= frm.beginTransaction();
        frt.add(R.id.wrapper,new fragment2_2());
        frt.addToBackStack(null);
        frt.commit();
    }
}









package com.example.quiz2_uniclubz;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPadapter extends FragmentPagerAdapter{
int tabcount;
    public VPadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
         switch (position){
             case 0 : return new fragment1();
             case 1 : return new fragment2();
             case 2 : return new fragment3();
             default: return null;
         }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
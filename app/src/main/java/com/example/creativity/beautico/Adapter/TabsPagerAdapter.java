package com.example.creativity.beautico.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.creativity.beautico.Fragment.FragmentSalon;
import com.example.creativity.beautico.Fragment.FragmentYourPlace;

/**
 * Created by Creativity on 8/2/2017.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                // Top Rated fragment activity
                return new FragmentYourPlace();
            case 1:
                // Games fragment activity
                return new FragmentSalon();
        }
        return null;
    }

    @Override
    public int getCount() {

        return 2;
    }
}

package com.example.android.bestofstillwater;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryViewPager extends FragmentPagerAdapter {
    private Context context;

    public CategoryViewPager(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2){
            return new FunFragment();
        } else {
            return new FitnessFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.parks);
        } else if (position == 1) {
            return context.getString(R.string.food);
        } else if (position == 2) {
            return context.getString(R.string.fun);
        } else {
            return context.getString(R.string.fitness);
        }
    }
}
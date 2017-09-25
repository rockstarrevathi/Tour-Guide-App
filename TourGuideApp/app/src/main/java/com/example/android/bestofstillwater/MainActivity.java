package com.example.android.bestofstillwater;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Remove action bar shadow
        // From Tomer Mor's stack overflow answer
        // http://stackoverflow.com/questions/12246388/remove-shadow-below-actionbar
        getSupportActionBar().setElevation(0);

        // Find view pager in main xml layout
        ViewPager viewPager = (ViewPager) findViewById(R.id.category_view_pager);

        // Create instance of category view pager class
        viewPager.setAdapter(new CategoryViewPager(this, getSupportFragmentManager()));


        // Find tab layout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        // Connect the tabs to the view pager
        tabLayout.setupWithViewPager(viewPager);
    }
}

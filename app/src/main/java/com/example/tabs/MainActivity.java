package com.example.tabs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.tabs.Controlador.PagerController;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
TabLayout tabLayout;
ViewPager viewPager;
TabItem tab1,tab2,tab3, tab4, tab5;
PagerController pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout= findViewById(R.id.tablayout);
        viewPager= findViewById(R.id.viewpager);
        tab1= findViewById(R.id.tabdefensa);
        tab2= findViewById(R.id.tabportero);
        tab3= findViewById(R.id.tabmediocampista);
        tab4= findViewById(R.id.tabcambios);
        tab5= findViewById(R.id.tabdelantero);

pagerAdapter= new
        PagerController(getSupportFragmentManager(),
        tabLayout.getTabCount());
viewPager.setAdapter(pagerAdapter);
tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
        if(tab.getPosition()==0){
            pagerAdapter.notifyDataSetChanged();
        }
        if(tab.getPosition()==1){
            pagerAdapter.notifyDataSetChanged();
        }
        if(tab.getPosition()==2){
            pagerAdapter.notifyDataSetChanged();
        }
        if(tab.getPosition()==3){
            pagerAdapter.notifyDataSetChanged();
        }
        if(tab.getPosition()==4){
            pagerAdapter.notifyDataSetChanged();
        }
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
}
package com.yu_gi_ohrules.Chainrules;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.yu_gi_ohrules.Deckrulesstack.deckrulebook;
import com.yu_gi_ohrules.R;

public class Chain_Rules extends AppCompatActivity {


    chainrulebook seçici;
    ViewPager2 viewPager;
    TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_rules);

        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager2) findViewById(R.id.viewPager);
        seçici = new chainrulebook(this);//THİS ONE SECTİON TWO ALPHA
        viewPager.setAdapter(seçici);



        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());//SECTİON THREE ALPHA

                //  TaijutsuFragment fragment1=new TaijutsuFragment();
                //  FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                //  transaction.add(R.id.fragment1,fragment1).commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //SECTİON THREE BETA
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                //SECTİON THREE BETA
            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tablayout.getTabAt(position).select();//SECTİON FOUR HEXAGRAME EŞİTLEME
            }
        });

    }
}
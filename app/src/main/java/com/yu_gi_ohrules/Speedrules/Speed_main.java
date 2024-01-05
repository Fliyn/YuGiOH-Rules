package com.yu_gi_ohrules.Speedrules;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.yu_gi_ohrules.R;
import com.yu_gi_ohrules.Summoningrules.summonrules;

public class Speed_main extends AppCompatActivity {


    Speedrulebook seçici;
    ViewPager2 viewPager2;
    TabLayout tablayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_main);

        tablayout2 = (TabLayout) findViewById(R.id.tablayout);
        viewPager2 = (ViewPager2) findViewById(R.id.viewPager);
        seçici = new Speedrulebook(this);//THİS ONE SECTİON TWO ALPHA
        viewPager2.setAdapter(seçici);



        tablayout2.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());//SECTİON THREE ALPHA

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

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tablayout2.getTabAt(position).select();//SECTİON FOUR HEXAGRAME EŞİTLEME
            }
        });
    }
}
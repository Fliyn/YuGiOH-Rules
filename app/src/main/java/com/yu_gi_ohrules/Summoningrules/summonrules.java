package com.yu_gi_ohrules.Summoningrules;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;



public class summonrules extends FragmentStateAdapter {

    public summonrules(@NonNull FragmentActivity summon) {super(summon);}

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Normal_Summon();
            case 1:
                return new Normal_summon_lvl5_6();
            case 2:
                return new Normal_summon_lvl7();
            case 3:
                return new Normal_summon_Flip();
            case 4:
                return new Special_summon_gemini();
            default:
                return  new Normal_Summon();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

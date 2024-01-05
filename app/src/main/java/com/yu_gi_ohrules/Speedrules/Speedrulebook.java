package com.yu_gi_ohrules.Speedrules;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Speedrulebook extends FragmentStateAdapter {
    public Speedrulebook(@NonNull FragmentActivity spd) {super(spd);}

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Speed_spell();
            case 1:
                return new Speed_1();
            case 2:
                return new Speed_2();
            case 3:
                return new Speed_3();
            case 4:
                return new Speed_onceper();
            default:
                return new Speed_spell();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
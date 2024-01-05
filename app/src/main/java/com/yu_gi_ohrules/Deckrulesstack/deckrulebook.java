package com.yu_gi_ohrules.Deckrulesstack;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class deckrulebook extends FragmentStateAdapter {

    public deckrulebook(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Standart_Deck();
            case 1:
                return new Extra_Deck();
            case 2:
                return new Side_Deck();
            default:
                return  new Standart_Deck();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

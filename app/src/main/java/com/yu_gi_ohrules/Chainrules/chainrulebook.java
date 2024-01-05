package com.yu_gi_ohrules.Chainrules;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class chainrulebook extends FragmentStateAdapter
{
    public chainrulebook(@NonNull FragmentActivity ssummon) {
        super(ssummon);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Chain_();
            case 1:
                return new Chain_Start();
            case 2:
                return new Chain_Build();
            case 3:
                return new Chain_resolve();
            case 4:
                return new Chain_Simultaneous();
            default:
                return new Chain_();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

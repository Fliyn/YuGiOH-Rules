package com.yu_gi_ohrules.SpecialSummoningrules;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.yu_gi_ohrules.Card_Zonerules.The_mat_Deck;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Extra_Monster_zone;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Field_zone;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Graveyard;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Spell_zone;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_extra_deck;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_monster_zone;

public class SpecialSummonbook extends FragmentStateAdapter
{
    public SpecialSummonbook(@NonNull FragmentActivity ssummon) {
    super(ssummon);
}

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Special_Summon();
            case 1:
                return new Special_summon_xyz();
            case 2:
                return new Special_Summon_synchro();
            case 3:
                return new Special_Summon_pendulum();
            case 4:
                return new Special_Summon_Ritual();
            case 5:
                return new Special_Summon_Fusion();
            case 6:
                return new Special_Summon_Link();
            default:
                return new Special_Summon();
        }
    }

    @Override
    public int getItemCount() {
        return 7;
    }
}

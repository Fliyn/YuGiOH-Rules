package com.yu_gi_ohrules.Card_Zonerules;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Cards_zones_book extends FragmentStateAdapter
{
    public Cards_zones_book(@NonNull FragmentActivity carsnzones) {
        super(carsnzones);
    }//SAYFALARI RASTGELE DİZ SAĞA SOLA RANDOM GİDİYOR GİBİ DURSUN!!!

    @NonNull
    @Override
    public Fragment createFragment(int position) {//SAYFALARI RASTGELE DİZ SAĞA SOLA RANDOM GİDİYOR GİBİ DURSUN!!!
        switch (position) {//BURADA DEĞİŞİM YAPARAK KARIŞIK GÖRSELLER OLUŞACAKTIR.
            case 0:
                return new The_mat_Deck();
            case 1:
                return new The_mat_extra_deck();
            case 2:
                return new The_mat_monster_zone();
            case 3:
                return new The_mat_Extra_Monster_zone();
            case 4:
                return new The_mat_Field_zone();
            case 5:
                return new The_mat_Graveyard();
            case 6:
                return new The_mat_Spell_zone();
            case 7:
                return new The_mat_pendulum_zone(); //Other page from now on
            case 8:
                return new The_cards_monster(); //Other page from now on
            case 9:
                return new the_cards_EffectMonster();
            case 10:
                return new The_cards_spell();
            case 11:
                return new the_cards_trap();
            case 12:
                return new the_cards_xyz();
            case 13:
                return new the_cards_sync();
            case 14:
                return new the_cards_pendulum();
            case 15:
                return new The_cards_ritual();
            case 16:
                return new The_cards_fusion();
            case 17:
                return new The_cards_link();
            case 18:
                return new the_cards_tokenmonsters();
            case 19:
                return new the_cards_Counter();
            default:
                return new The_mat_Deck();
        }
    }
    @Override
    public int getItemCount() {
        return 20;
    }
}

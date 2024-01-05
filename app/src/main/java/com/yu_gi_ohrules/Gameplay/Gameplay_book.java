package com.yu_gi_ohrules.Gameplay;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.yu_gi_ohrules.Card_Zonerules.The_cards_fusion;
import com.yu_gi_ohrules.Card_Zonerules.The_cards_link;
import com.yu_gi_ohrules.Card_Zonerules.The_cards_monster;
import com.yu_gi_ohrules.Card_Zonerules.The_cards_ritual;
import com.yu_gi_ohrules.Card_Zonerules.The_cards_spell;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Deck;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Extra_Monster_zone;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Field_zone;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Graveyard;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_Spell_zone;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_extra_deck;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_monster_zone;
import com.yu_gi_ohrules.Card_Zonerules.The_mat_pendulum_zone;
import com.yu_gi_ohrules.Card_Zonerules.the_cards_Counter;
import com.yu_gi_ohrules.Card_Zonerules.the_cards_EffectMonster;
import com.yu_gi_ohrules.Card_Zonerules.the_cards_pendulum;
import com.yu_gi_ohrules.Card_Zonerules.the_cards_sync;
import com.yu_gi_ohrules.Card_Zonerules.the_cards_tokenmonsters;
import com.yu_gi_ohrules.Card_Zonerules.the_cards_trap;
import com.yu_gi_ohrules.Card_Zonerules.the_cards_xyz;

public class Gameplay_book extends FragmentStateAdapter
{
    public Gameplay_book(@NonNull FragmentActivity carsnzones) {
        super(carsnzones);
    }//SAYFALARI RASTGELE DİZ SAĞA SOLA RANDOM GİDİYOR GİBİ DURSUN!!!

    @NonNull
    @Override
    public Fragment createFragment(int position) {//SAYFALARI RASTGELE DİZ SAĞA SOLA RANDOM GİDİYOR GİBİ DURSUN!!!
        switch (position) {//BURADA DEĞİŞİM YAPARAK KARIŞIK GÖRSELLER OLUŞACAKTIR.
            case 0:
                return new Gameplay_turn();
            case 1:
                return new Gameplay_Drawphase();
            case 2:
                return new Gameplay_Standbyphase();
            case 3:
                return new Gameplay_Mainphase1();
            case 4:
                return new Gameplay_Battlephase();
            case 5:
                return new Gameplay_Mainphase2();
            case 6:
                return new Gameplay_Endphase();
            case 7:
                return new Gameplay_Battleposition();
            case 8:
                return new Gameplay_Battlepositionchange();
            case 9:
                return new Gameplay_Effectcontinuous();
            case 10:
                return new Gameplay_Effectignition();
            case 11:
                return new Gameplay_Effectquick();
            case 12:
                return new Gameplay_Effecttrigger();
            case 13:
                return new Gameplay_excavate();
            case 14:
                return new Gameplay_look();
            case 15:
                return new Gameplay_reveal();
            case 16:
                return new Gameplay_Equip();
            case 17:
                return new Gameplay_summon();
            case 18:
                return new Gameplay_set();
            case 19:
                return new Gameplay_attach();
            case 20:
                return new Gameplay_banish();
            case 21:
                return new Gameplay_destroy();
            case 22:
                return new Gameplay_negate();
            case 23:
                return new Gameplay_discard();
            case 24:
                return new Gameplay_Leavethefield();
            case 25:
                return new Gameplay_Gamestate();
            case 26:
                return new Gameplay_lifepoints();
            case 27:
                return new Gameplay_Handlimit();
            case 28:
                return new Gameplay_Publicknowlage();
            case 29:
                return new Gameplay_facedown();
            case 30:
                return new Gameplay_faceup();
            case 31:
                return new Gameplay_flip();
            case 32:
                return new Gameplay_owner();
            case 33:
                return new Gameplay_possess();
            case 34:
                return new Gameplay_duel();
            case 35:
                return new Gameplay_Match();
            case 36:
                return new Gameplay_surrender();


            default:
                return new Gameplay_turn();
        }
    }
    @Override
    public int getItemCount() {
        return 37;
    }
}

package com.yu_gi_ohrules.SpecialSummoningrules;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.yu_gi_ohrules.R;


public class Special_Summon_pendulum extends Fragment {

    TextView txt;
    View fragment1View;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragment1View   = inflater.inflate(R.layout.fragment_special__summon_pendulum, container, false);
        txt    =   fragment1View.findViewById(R.id.textView5);
        txt.setText("Once per turn, on one of your Main Phases, activate Pendulum Monster Cards as Spell Cards in your leftmost and rightmost Spell & Trap Zones. These Spell & Trap Zones also become Pendulum Zones. After you have one in each Pendulum Zone, once per turn during your Main Phase, declare that you’re Pendulum Summoning. Check the Pendulum Scales on the sides of your 2 Pendulum Monster Cards, then Special Summon as many monsters as you want from your hand and as many face-\u0002up Pendulum Monsters from your Extra Deck, whose Levels are in between those Pendulum Scales.");

        return fragment1View;
    }
}
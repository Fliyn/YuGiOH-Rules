package com.yu_gi_ohrules.SpecialSummoningrules;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yu_gi_ohrules.R;


public class Special_Summon_Ritual extends Fragment {

    View fragment1View;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fragment1View   = inflater.inflate(R.layout.fragment_special__summon__ritual, container, false);

        return fragment1View;
    }
}
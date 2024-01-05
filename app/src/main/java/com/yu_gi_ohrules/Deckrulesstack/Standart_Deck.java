package com.yu_gi_ohrules.Deckrulesstack;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.yu_gi_ohrules.R;


public class Standart_Deck extends Fragment {

    View fragment1View;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fragment1View   = inflater.inflate(R.layout.fragment_standart__deck, container, false);

        return fragment1View;
    }


}
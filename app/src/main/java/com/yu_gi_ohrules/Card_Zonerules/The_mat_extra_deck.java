package com.yu_gi_ohrules.Card_Zonerules;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yu_gi_ohrules.R;


public class The_mat_extra_deck extends Fragment {
    View fragment1View;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fragment1View   = inflater.inflate(R.layout.fragment_the_mat_extra_deck, container, false);

        return fragment1View;
    }
}
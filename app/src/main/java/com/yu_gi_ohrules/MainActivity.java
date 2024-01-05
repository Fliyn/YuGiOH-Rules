package com.yu_gi_ohrules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.yu_gi_ohrules.Card_Zonerules.Cards_Zone_Rules;
import com.yu_gi_ohrules.Chainrules.Chain_Rules;
import com.yu_gi_ohrules.Deckrulesstack.Deckrules;
import com.yu_gi_ohrules.Gameplay.Gameplay;
import com.yu_gi_ohrules.SpecialSummoningrules.Special_Summoningrules;
import com.yu_gi_ohrules.Speedrules.Speed_main;
import com.yu_gi_ohrules.Summoningrules.Summoningrules;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView    =   (ListView) findViewById(R.id.selectrule);



        ArrayList<String> arrayList =new ArrayList<>();



            arrayList.add("Gameplay Rules");//extra deck rules monster EFFECTS, qucik like effect ,continouns spells.Equip cards
            //Eveaty player must shuffle their deck ++,first player cannot attack second player draws +1 card .Card Sleeves.Main phase açıklamaları 1,2 aynı turda posizyon değişimi
            // excavate RULES  ,,, equip card ,field card, continus card, KAZANAN CANAVAR SALDIRAN VE SALDIRILANA OLANLARLA İLGİLİ BİR SAYFA EKLE.
            arrayList.add("Deck Rules");
            arrayList.add("Zone-Card Rules");//how cards work "Field spell"
            arrayList.add("Chain Rules");
            arrayList.add("Spell Speed Rules");
            arrayList.add("Normal Summon Rules");
            arrayList.add("Special Summon Rules");
//Negation?

            ListAdapter listAdapter=new ArrayAdapter<>(getApplicationContext(), R.layout.rowr,arrayList);
            //android.R.layout.simple_list_item_single_choice
            listView.setAdapter(listAdapter);
        listView.setChoiceMode(listView.CHOICE_MODE_SINGLE);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent gameplay =new Intent(getApplicationContext(), Gameplay.class);
                        startActivity(gameplay);
                        break;
                    case 1:
                        Intent deck =new Intent(getApplicationContext(), Deckrules.class);
                        startActivity(deck);
                        break;
                    case 2:
                        Intent czrules =new Intent(getApplicationContext(), Cards_Zone_Rules.class);
                        startActivity(czrules);
                        break;
                    case 3:
                        Intent chain =new Intent(getApplicationContext(), Chain_Rules.class);
                        startActivity(chain);
                        break;
                    case 4:
                        Intent speed =new Intent(getApplicationContext(), Speed_main.class);
                        startActivity(speed);
                        break;
                    case 5:
                        Intent summon =new Intent(getApplicationContext(), Summoningrules.class);
                        startActivity(summon);
                        break;
                    case 6:
                        Intent Ssummon =new Intent(getApplicationContext(), Special_Summoningrules.class);
                        startActivity(Ssummon);
                        break;
                }

            }
        });

    }
}
package com.yu_gi_ohrules.Card_Zonerules;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.yu_gi_ohrules.R;

public class Cards_Zone_Rules extends AppCompatActivity {


    public DrawerLayout drawerLayout;
    public RelativeLayout Relativviewer;
    private NavigationView navigation1;
    private NavigationView navigation2;
    Cards_zones_book seçici;
    ViewPager2 vpgr2;
    public DrawerLayout drawerLayout2;
    //public ActionBarDrawerToggle actionBarDrawerToggle;
    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards_zone_rules);

        vpgr2 = (ViewPager2) findViewById(R.id.vpgrmain);
        seçici = new Cards_zones_book(this);//THİS ONE SECTİON TWO ALPHA
        vpgr2.setAdapter(seçici);
        drawerLayout = findViewById(R.id.main_drawer);
        Relativviewer = findViewById(R.id.viewer);
        drawerLayout2 = findViewById(R.id.my_drawer_layout2);
        navigation1 = findViewById(R.id.nvmain);
        navigation2 = findViewById(R.id.nv2);
        button2 = findViewById(R.id.button);
        button = findViewById(R.id.button2);

        //vpgr2.setUserInputEnabled(false);//CLOSING THE DEAL

        navigation1.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {//SAYFALARI RASTGELE DİZ SAĞA SOLA RANDOM GİDİYOR GİBİ DURSUN!!! BOOK SAYFASI
                switch (item.getItemId()){
                    case R.id.Deck_zone:
                        vpgr2.setCurrentItem(0);
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Extra_Deck:
                        vpgr2.setCurrentItem(1);
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Monster_zone:
                        vpgr2.setCurrentItem(2);
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Extra_Monster_Zone:
                        vpgr2.setCurrentItem(3);
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Field_Zone:
                        vpgr2.setCurrentItem(4);
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Graveyard:
                        vpgr2.setCurrentItem(5);
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Spell_zone:
                        vpgr2.setCurrentItem(6);
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Pendulum_zone:
                        vpgr2.setCurrentItem(7);
                        drawerLayout.closeDrawer(Gravity.LEFT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                }
                return false;
            }
        });

        navigation2.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Monster:
                        vpgr2.setCurrentItem(8);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.EffectMonster:
                        vpgr2.setCurrentItem(9);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Spell:
                        vpgr2.setCurrentItem(10);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Trap:
                        vpgr2.setCurrentItem(11);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.xyz:
                        vpgr2.setCurrentItem(12);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.sync:
                        vpgr2.setCurrentItem(13);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.pen:
                        vpgr2.setCurrentItem(14);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.rit:
                        vpgr2.setCurrentItem(15);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.fus:
                        vpgr2.setCurrentItem(16);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.link:
                        vpgr2.setCurrentItem(17);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.token:
                        vpgr2.setCurrentItem(18);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.counter:
                        vpgr2.setCurrentItem(19);
                        drawerLayout2.closeDrawer(Gravity.RIGHT);
                        Relativviewer.setVisibility(View.VISIBLE);
                        break;
                }
                return false;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawerLayout2.isDrawerOpen(Gravity.RIGHT)){
                    drawerLayout2.closeDrawer(Gravity.RIGHT);
                    drawerLayout.openDrawer(Gravity.LEFT);
                    Relativviewer.setVisibility(View.INVISIBLE);
                }
                else if(drawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    drawerLayout.closeDrawer(Gravity.LEFT);
                    Relativviewer.setVisibility(View.INVISIBLE);
                }
                else {
                    drawerLayout.openDrawer(Gravity.LEFT);
                    Relativviewer.setVisibility(View.INVISIBLE);
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(drawerLayout.isDrawerOpen(Gravity.LEFT)){
                    drawerLayout.closeDrawer(Gravity.LEFT);
                    drawerLayout2.openDrawer(Gravity.RIGHT);
                    Relativviewer.setVisibility(View.INVISIBLE);
                }
                else if(drawerLayout2.isDrawerOpen(Gravity.RIGHT)) {
                    drawerLayout2.closeDrawer(Gravity.RIGHT);
                    Relativviewer.setVisibility(View.INVISIBLE);
                }
                else {
                    drawerLayout2.openDrawer(Gravity.RIGHT);
                    Relativviewer.setVisibility(View.INVISIBLE);
                }

            }
        });

        drawerLayout2.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {
                //Relativviewer.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });

        drawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {
            }

            @Override
            public void onDrawerOpened(@NonNull View drawerView) {
                //Relativviewer.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onDrawerClosed(@NonNull View drawerView) {
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }





}
package com.yu_gi_ohrules.Gameplay;

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
import com.yu_gi_ohrules.Card_Zonerules.Cards_Zone_Rules;
import com.yu_gi_ohrules.Card_Zonerules.Cards_zones_book;
import com.yu_gi_ohrules.R;

public class Gameplay extends AppCompatActivity {

    public RelativeLayout viewer;
    private NavigationView nvmain;
    Gameplay_book seçici;
    ViewPager2 vpgrmain;
    public DrawerLayout main_drawer;
    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);

        vpgrmain = (ViewPager2) findViewById(R.id.vpgrmain);
        seçici = new Gameplay_book(this);//THİS ONE SECTİON TWO ALPHA
        vpgrmain.setAdapter(seçici);
        main_drawer = findViewById(R.id.main_drawer);
        viewer = findViewById(R.id.viewer);
        nvmain = findViewById(R.id.nvmain);
        button3 = findViewById(R.id.button3);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(main_drawer.isDrawerOpen(Gravity.RIGHT)){
                    main_drawer.closeDrawer(Gravity.RIGHT);
                    viewer.setVisibility(View.INVISIBLE);
                }
                else if(main_drawer.isDrawerOpen(Gravity.LEFT)) {
                    main_drawer.closeDrawer(Gravity.LEFT);
                    viewer.setVisibility(View.INVISIBLE);
                }
                else {
                    main_drawer.openDrawer(Gravity.LEFT);
                    viewer.setVisibility(View.INVISIBLE);
                }

            }
        });


        //vpgrmain.setUserInputEnabled(false);//CLOSING THE DEAL(Pager)

        nvmain.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {//SAYFALARI RASTGELE DİZ SAĞA SOLA RANDOM GİDİYOR GİBİ DURSUN!!! BOOK SAYFASI
                switch (item.getItemId()){
                    case R.id.Turn:
                        vpgrmain.setCurrentItem(0);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Draw_Phase:
                        vpgrmain.setCurrentItem(1);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Standby_Phase:
                        vpgrmain.setCurrentItem(2);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Mainphase1:
                        vpgrmain.setCurrentItem(3);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Battle_Phase:
                        vpgrmain.setCurrentItem(4);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Mainphase2:
                        vpgrmain.setCurrentItem(5);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.End_Phase:
                        vpgrmain.setCurrentItem(6);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Battle_position:
                        vpgrmain.setCurrentItem(7);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Battle_position_change:
                        vpgrmain.setCurrentItem(8);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Effect_Continous:
                        vpgrmain.setCurrentItem(9);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                    case R.id.Effect_ignition:
                        vpgrmain.setCurrentItem(10);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Effect_quick:
                        vpgrmain.setCurrentItem(11);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Effect_Trigger:
                        vpgrmain.setCurrentItem(12);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Excavate:
                        vpgrmain.setCurrentItem(13);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Look:
                        vpgrmain.setCurrentItem(14);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Reveal:
                        vpgrmain.setCurrentItem(15);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.equip:
                        vpgrmain.setCurrentItem(16);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Summon:
                        vpgrmain.setCurrentItem(17);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Set:
                        vpgrmain.setCurrentItem(18);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Attach:
                        vpgrmain.setCurrentItem(19);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Banish:
                        vpgrmain.setCurrentItem(20);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Destroy:
                        vpgrmain.setCurrentItem(21);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Negate:
                        vpgrmain.setCurrentItem(22);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Discard:
                        vpgrmain.setCurrentItem(23);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Leave_field:
                        vpgrmain.setCurrentItem(24);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.gamestate:
                        vpgrmain.setCurrentItem(25);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Life_Points:
                        vpgrmain.setCurrentItem(26);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Hand_Limit:
                        vpgrmain.setCurrentItem(27);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Public_knowledge:
                        vpgrmain.setCurrentItem(28);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Face_down:
                        vpgrmain.setCurrentItem(29);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Face_up:
                        vpgrmain.setCurrentItem(30);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Flip:
                        vpgrmain.setCurrentItem(31);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Owner:
                        vpgrmain.setCurrentItem(32);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Possess:
                        vpgrmain.setCurrentItem(33);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Duel:
                        vpgrmain.setCurrentItem(34);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Match:
                        vpgrmain.setCurrentItem(35);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);
                        break;
                        case R.id.Surrender:
                        vpgrmain.setCurrentItem(36);
                        main_drawer.closeDrawer(Gravity.LEFT);
                        viewer.setVisibility(View.VISIBLE);

                        break;
                }
                return false;
            }
        });
    }
}
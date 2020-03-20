package com.aliaboubakr.corona;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.aliaboubakr.corona.ui.FragmentGrideEaight;
import com.aliaboubakr.corona.ui.FragmentGrideFive;
import com.aliaboubakr.corona.ui.FragmentGrideFoure;
import com.aliaboubakr.corona.ui.FragmentGrideOne;
import com.aliaboubakr.corona.ui.FragmentGrideSeven;
import com.aliaboubakr.corona.ui.FragmentGrideSix;
import com.aliaboubakr.corona.ui.FragmentGrideThree;
import com.aliaboubakr.corona.ui.FragmentGrideTwo;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActiviy extends AppCompatActivity {
BottomNavigationView bottomNavigationView;
GridLayout gridLayout;
//AdView adView1;
//InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//adView1=findViewById(R.id.main_banner);



/*
MobileAds.initialize(this,"ca-app-pub-8211960783436333~2288908103");
AdRequest adRequest=new AdRequest.Builder().build();
adView1.loadAd(adRequest);
interstitialAd=new InterstitialAd(this);
interstitialAd.setAdUnitId("ca-app-pub-8211960783436333/1485008616");
interstitialAd.loadAd(new AdRequest.Builder().build());
interstitialAd.show();
*/




        gridLayout=findViewById(R.id.main_grid);
//bottomNavigationView=findViewById(R.id.button_nav);
//bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        setSingleEvent(gridLayout);

    }





    private void setSingleEvent(GridLayout gridLayout){

        for (int i = 0; i <gridLayout.getChildCount() ; i++) {


            CardView cardView= (CardView) gridLayout.getChildAt(i);
            final int Final=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment selectedFragment=null;

                   /* if (Final==0){selectedFragment=new FragmentGrideOne();
                    }
                    if (Final==1){selectedFragment=new FragmentGrideTwo();
                    }
                    if (Final==2){selectedFragment=new FragmentGrideThree();
                    }
                    if (Final==3){selectedFragment=new FragmentGrideFoure();
                    }
                    if (Final==4){selectedFragment=new FragmentGrideFive();
                    }if (Final==5){selectedFragment=new FragmentGrideSix();
                    }
                    if (Final==6){selectedFragment=new FragmentGrideSeven();
                    }
                    if (Final==7){selectedFragment=new FragmentGrideEaight();
                    }


                    */

                    switch (Final){

                        case (0):
                            selectedFragment=new FragmentGrideOne();

                            break;


                        case (1):
                            selectedFragment=new FragmentGrideTwo();
                            break;

                        case (2):
                            selectedFragment=new FragmentGrideThree();
                            Toast.makeText(MainActiviy.this, "جار التحميل ... ", Toast.LENGTH_SHORT).show();
                            break;
                        case (3):
                            selectedFragment=new FragmentGrideFoure();
                            Toast.makeText(MainActiviy.this, "جار التحميل ... ", Toast.LENGTH_SHORT).show();
                            break;


                        case (4):
                            selectedFragment=new FragmentGrideFive();
                            Toast.makeText(MainActiviy.this, "جار التحميل ... ", Toast.LENGTH_SHORT).show();
                            break;

                        case (5):
                            selectedFragment=new FragmentGrideSix();
                            Toast.makeText(MainActiviy.this, "جار التحميل ... ", Toast.LENGTH_SHORT).show();
                            break;

                        case (6):
                            selectedFragment=new FragmentGrideSeven();

                            break;


                        case (7):
                            selectedFragment=new FragmentGrideEaight();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,selectedFragment).addToBackStack(null).commit();


                }
            });
        }
    }



    /*
    private BottomNavigationView.OnNavigationItemSelectedListener navListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            Fragment selectedFragment=null;
            switch (item.getItemId()){

                case (R.id.prevention):
                    selectedFragment=new FragmentGrideOne();

                    break;


                case (R.id.symptoms):
                    selectedFragment=new FragmentGrideTwo();
                    break;

                case (R.id.News):
                    selectedFragment=new FragmentGrideThree();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,selectedFragment).commit();
return true;
        }
    };



     */
}

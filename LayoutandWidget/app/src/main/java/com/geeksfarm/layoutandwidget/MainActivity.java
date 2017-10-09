package com.geeksfarm.layoutandwidget;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout simpleFrameLayout;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Mengambil referensi FrameLayout dan TabLayout
        simpleFrameLayout = (FrameLayout) findViewById(R.id.simpleFrameLayout);
        tabLayout = (TabLayout) findViewById(R.id.simpleTabLayout);
        // Create tab baru dengan nama "Layout1"
        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("Layout1"); // Set Text untuk Tab ke satu
        firstTab.setIcon(R.drawable.ic_launcher); // Set icon untuk Tab ke satu
        tabLayout.addTab(firstTab); // Menambahkan Tab di TabLayout
        // Create tab baru dengan nama "Layout2"
        TabLayout.Tab secondTab = tabLayout.newTab();
        secondTab.setText("Layout2"); // set Text untuk Tab ke dua
        secondTab.setIcon(R.drawable.ic_launcher); // set icon untuk Tab ke dua
        tabLayout.addTab(secondTab); // Menambahkan Tab di TabLayout
        // Create tab baru dengan nama "Layout3"
        TabLayout.Tab thirdTab = tabLayout.newTab();
        thirdTab.setText("Layout3"); // set Text untuk Tab ke tiga
        thirdTab.setIcon(R.drawable.ic_launcher); // set icon untuk Tab ke tiga
        tabLayout.addTab(thirdTab); // Menambahkan Tab di TabLayout


        // Setting setOnTabSelectedListener event di TabLayout
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Mendeteksi posisi tab yang di pilih dan mengganti fragment dengan tab yang di pilih
                Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new FirstFragment();
                        break;
                    case 1:
                        fragment = new SecondFragment();
                        break;
                    case 2:
                        fragment = new ThirdFragment();
                        break;
                }
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.simpleFrameLayout, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}

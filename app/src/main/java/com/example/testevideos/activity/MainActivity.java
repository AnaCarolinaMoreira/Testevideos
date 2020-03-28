package com.example.testevideos.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.testevideos.R;
import com.example.testevideos.fragment.FundamentosFragment;
import com.example.testevideos.fragment.InsightFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_fundamentos, R.id.nav_insight)
                .build();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment =null;

                    switch (item.getItemId()){
                        case R.id.nav_fundamentos:
                            selectedFragment = new FundamentosFragment();
                            break;
                        case R.id.nav_insight:
                            selectedFragment = new InsightFragment();
                            break;
                    }

                  getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                  return true;

                }
            };
}
/*
 */
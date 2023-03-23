package com.example.brainwashers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainScreen extends AppCompatActivity {
//This is where Navigation Bottom switches Fake Friend

//    This is the Navigation
    BottomNavigationView bottomNavigationView;

//    Fragments
    HomeFragment homeFragment = new HomeFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    AboutFragment aboutFragment = new AboutFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        bottomNavigationView = findViewById(R.id.BottomNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

       bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case R.id.HomeNav:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                       return true;
                   case R.id.ProfileNav:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();
                       return true;
                   case R.id.AboutNav:
                       getSupportFragmentManager().beginTransaction().replace(R.id.container,aboutFragment).commit();
                       return true;
               }
               return false;
           }
       });
    }
}
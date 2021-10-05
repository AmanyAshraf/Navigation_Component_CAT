package com.pactise.navigationcomponentcat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // if you use fragment
    /*    BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_nav);
        NavController navController= Navigation.findNavController(this,R.id.Frag_Host);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);*/

        // if you use fragment container view
        BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_nav);
        NavHostFragment navHostFragment=(NavHostFragment) getSupportFragmentManager().
                findFragmentById(R.id.Frag_Host);
        NavController navController=navHostFragment.getNavController();
        NavigationUI.setupWithNavController(bottomNavigationView,navController);



    }
}
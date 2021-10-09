package com.pactise.navigationcomponentcat;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
 AppBarConfiguration appBarConfiguration;
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

        //set Up toolbar
        Toolbar toolbar=findViewById(R.id.toolbar);
        DrawerLayout drawerLayout =findViewById(R.id.drawer_layout);
        Set<Integer> topDes= new HashSet<>();
        topDes.add(R.id.homeFragment);
        topDes.add(R.id.categoryFragment);
        topDes.add(R.id.profileFragment);
        appBarConfiguration =new AppBarConfiguration
                .Builder(topDes)
                .setOpenableLayout(drawerLayout)
                .build();
        NavigationUI.setupWithNavController(toolbar,navController,appBarConfiguration);

        //set up slider
        NavigationView slider =findViewById(R.id.slider);
        NavigationUI.setupWithNavController(slider,navController);



    }
}
package com.example.assignment;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity<navigationView> extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    navigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout =(DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView =(navigationView) findViewById(R.id.navigation_view);
        



    }
}

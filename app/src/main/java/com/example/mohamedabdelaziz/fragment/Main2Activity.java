package com.example.mohamedabdelaziz.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent() ;
        Bundle bundle = intent.getExtras() ;
        Main2ActivityFragment main2ActivityFragment=new Main2ActivityFragment() ;
        main2ActivityFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.frame2,main2ActivityFragment).commit();



    }

}

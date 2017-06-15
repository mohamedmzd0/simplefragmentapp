package com.example.mohamedabdelaziz.fragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements listener{



    boolean twopane =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MainActivityFragment mainActivityFragment = new MainActivityFragment() ;
        mainActivityFragment.getselecetedname(this);
        getSupportFragmentManager().beginTransaction().add(R.id.frame1,mainActivityFragment).commit();

            if(findViewById(R.id.frame2)!=null)
                twopane=true ;



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




    @Override
    public void sendname(String name) {

        if(twopane)
        {
            Main2ActivityFragment main2ActivityFragment=new Main2ActivityFragment() ;
            getSupportFragmentManager().beginTransaction().replace(R.id.frame2,main2ActivityFragment).commit();
            Bundle bundle=new Bundle();
            bundle.putString("name",name);
            main2ActivityFragment.setArguments(bundle);

        }else
        {
            Intent intent= new Intent(this,Main2Activity.class);
            intent.putExtra("name",name) ;
            startActivity(intent);


        }
    }
}

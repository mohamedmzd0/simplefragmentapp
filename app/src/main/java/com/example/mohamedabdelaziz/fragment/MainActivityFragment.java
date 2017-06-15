package com.example.mohamedabdelaziz.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }


    Button b1 , b2 ;
    listener listen ;
    void getselecetedname(listener listen)
    {

        this.listen=listen ;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        b1= (Button) view.findViewById(R.id.buttonone);
        b2= (Button) view.findViewById(R.id.buttontwo);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listen.sendname("one");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listen.sendname("two");
            }
        });
        return view;
    }
}

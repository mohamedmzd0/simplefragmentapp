package com.example.mohamedabdelaziz.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class Main2ActivityFragment extends Fragment {

    public Main2ActivityFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main2, container, false) ;
        TextView textView = (TextView) view.findViewById(R.id.textview);
        Bundle bundle= getArguments();
        textView.setText(bundle.getString("name"));
        return view;
    }
}

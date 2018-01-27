package com.coding_blocks.stonedcoder.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlueFragment extends Fragment {


    public BlueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false);


        View rootView = inflater.inflate(R.layout.fragment_blue, null);
        FrameLayout flBackground = rootView.findViewById(R.id.flBackground);
        flBackground.setBackgroundColor(Color.BLUE);

        return rootView;

    }

}

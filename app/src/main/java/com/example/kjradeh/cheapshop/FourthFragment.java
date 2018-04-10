package com.example.kjradeh.cheapshop;


import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class FourthFragment extends Fragment {

    public static FourthFragment newInstance(int instance) {
        Bundle args = new Bundle();
        args.putInt("argsInstance", instance);
        FourthFragment fourthFragment = new FourthFragment();
        fourthFragment.setArguments(args);
        return fourthFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fourth, container, false);
    }

}
package com.ezra.elon.technologiaandahzaka.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ezra.elon.technologiaandahzaka.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayJobFragment extends Fragment {


    public DisplayJobFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display_job, container, false);
    }

}

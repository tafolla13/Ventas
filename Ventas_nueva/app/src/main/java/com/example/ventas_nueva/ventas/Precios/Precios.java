package com.example.ventas_nueva.ventas.Precios;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ventas_nueva.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Precios extends Fragment {


    public Precios() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_precios, container, false);
    }

}

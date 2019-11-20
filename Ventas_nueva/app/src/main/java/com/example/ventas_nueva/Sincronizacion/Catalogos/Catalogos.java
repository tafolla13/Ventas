package com.example.ventas_nueva.Sincronizacion.Catalogos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ventas_nueva.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Catalogos extends Fragment {


    public Catalogos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_catalogos, container, false);
    }

}

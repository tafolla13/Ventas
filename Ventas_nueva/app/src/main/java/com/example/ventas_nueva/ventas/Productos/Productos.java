package com.example.ventas_nueva.ventas.Productos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.ventas_nueva.R;

import io.realm.Realm;

/**
 * A simple {@link Fragment} subclass.
 */
public class Productos extends Fragment {
    private EditText id,producto,detalle,precio;
    private Button guardar;
    Realm realmDb;

    public Productos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_productos, container, false);

    }
}

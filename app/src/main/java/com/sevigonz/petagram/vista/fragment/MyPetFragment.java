package com.sevigonz.petagram.vista.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sevigonz.petagram.R;
import com.sevigonz.petagram.adapter.MyPetAdaptador;
import com.sevigonz.petagram.pojo.Mascota;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyPetFragment extends Fragment {


    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_my_pet, container, false);




        listaMascotas = (RecyclerView) v.findViewById(R.id.recycler_my_pet);
        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.HORIZONTAL);

        int numberOfColumns = 4;

        listaMascotas.setLayoutManager(new GridLayoutManager
                (getContext(),
                        numberOfColumns,
                        GridLayoutManager.VERTICAL, false));
        //listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        inicializaAdaptador();
        return v;

    }


    private void inicializaAdaptador() {

        MyPetAdaptador adaptador = new MyPetAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    /**
     *
     */
    private void inicializarListaMascotas() {


        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 2));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 4));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 2));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 6));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 9));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 3));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 2));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 12));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 8));
    }


}

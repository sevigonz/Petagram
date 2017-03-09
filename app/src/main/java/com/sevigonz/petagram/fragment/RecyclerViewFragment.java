package com.sevigonz.petagram.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sevigonz.petagram.R;
import com.sevigonz.petagram.adapter.MascotaAdaptador;
import com.sevigonz.petagram.model.Mascota;

import java.util.ArrayList;

/**
 * Created by angel on 25/02/17.
 */

public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);




        listaMascotas = (RecyclerView) v.findViewById(R.id.recycler_mascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        inicializaAdaptador();
        return v;

    }


    private void inicializaAdaptador() {

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);

    }

    /**
     *
     */
    private void inicializarListaMascotas() {


        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Coby", R.drawable.gato_1, 4));
        mascotas.add(new Mascota("Pegy", R.drawable.perro_1, 1));
        mascotas.add(new Mascota("Tor", R.drawable.gato_2, 2));
        mascotas.add(new Mascota("Ronny", R.drawable.perro_2, 2));
        mascotas.add(new Mascota("Toby", R.drawable.gato_3, 6));
        mascotas.add(new Mascota("Nala", R.drawable.perro_3, 8));
        mascotas.add(new Mascota("Catty", R.drawable.gato_4, 9));
        mascotas.add(new Mascota("Luna", R.drawable.perro_4, 8));
    }


}

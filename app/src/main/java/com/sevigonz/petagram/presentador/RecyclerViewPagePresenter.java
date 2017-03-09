package com.sevigonz.petagram.presentador;


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sevigonz.petagram.R;
import com.sevigonz.petagram.adapter.MascotaAdaptador;
import com.sevigonz.petagram.model.ConstructorMascotas;
import com.sevigonz.petagram.model.Mascota;
import com.sevigonz.petagram.vista.activity.IFavoritasView;
import com.sevigonz.petagram.vista.fragment.IRecyclerViewFragmentView;

import java.util.ArrayList;

/**
 * Created by anahisalgado on 21/04/16.
 */
public class RecyclerViewPagePresenter implements IRecyclerViewPagePresenter {

    private IFavoritasView iFavoritasView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public  RecyclerViewPagePresenter(IFavoritasView iFavoritasView, Context context) {
        this.iFavoritasView = iFavoritasView;
        this.context = context;

         obtenerMascotas();
    }

    @Override
    public void obtenerMascotas() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRv();
    }

    @Override
    public void mostrarMascotasRv() {


        iFavoritasView.inicializarAdaptadorRV(iFavoritasView.crearAdaptador(mascotas));
        iFavoritasView.generarLinearLayoutVertical();
    }


}

package com.sevigonz.petagram.vista.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sevigonz.petagram.R;
import com.sevigonz.petagram.adapter.MascotaAdaptador;
import com.sevigonz.petagram.model.Mascota;
import com.sevigonz.petagram.presentador.IRecyclerViewPagePresenter;
import com.sevigonz.petagram.presentador.RecyclerViewPagePresenter;

import java.util.ArrayList;

/**
 * Created by angel on 8/03/17.
 */

public class FavoritasView implements IFavoritasView {

    private Context context;
    private AppCompatActivity appCompatActivity;
    private ViewGroup view;

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private IRecyclerViewPagePresenter presenter;

    public FavoritasView(Context context, AppCompatActivity appCompatActivity, ViewGroup view) {
        this.context = context;
        this.appCompatActivity = appCompatActivity;
        this.view = view;
    }


    @Nullable
    public View onCreateView() {


        LayoutInflater inflater = new LayoutInflater(context) {
            @Override
            public LayoutInflater cloneInContext(Context newContext) {
                return null;
            }
        };

        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = RecyclerView.inflate(this.context, R.layout.fragment_recyclerview, this.view);

        this.rvMascotas = (RecyclerView) v.findViewById(R.id.recycler_mascotas);
        this.presenter = new RecyclerViewPagePresenter(this, context);
        return v;
    }


    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(appCompatActivity);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);

    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, appCompatActivity);
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        rvMascotas.setAdapter(adaptador);
    }



    /*
    public void inicializarDatos(){
        contactos = new ArrayList<>();
        contactos.add(new Contacto(R.drawable.candy_icon, "Anahi Salgado", "77779999", "anahi@gmail.com", likes));
        contactos.add(new Contacto(R.drawable.yammi_banana_icon, "Pedro Sanchez", "88882222", "pedro@gmail.com", likes));
        contactos.add(new Contacto(R.drawable.shock_rave_bonus_icon, "Mireya Lopez", "33331111", "mireya@gmail.com", likes));
        contactos.add(new Contacto(R.drawable.forest_mushroom_icon, "Juan Lopez", "44442222", "juan@gmail.com", likes));

    }*/


}

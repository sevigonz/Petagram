package com.sevigonz.petagram;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.sevigonz.petagram.adapter.MascotaAdaptador;
import com.sevigonz.petagram.model.ConstructorMascotas;
import com.sevigonz.petagram.model.Mascota;
import com.sevigonz.petagram.vista.activity.FavoritasView;
import com.sevigonz.petagram.vista.activity.IFavoritasView;

import java.util.ArrayList;

public class FavoritasActivity extends AppCompatActivity  {



    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private FavoritasView favoritasView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        generarLinearLayoutVertical();

        //inicializarListaMascotas();

        //inicializaAdaptador();

        inicializarActionBar();



        final ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this
                .findViewById(android.R.id.content)).getChildAt(0);

        favoritasView = new FavoritasView(getBaseContext(), this, viewGroup);

        favoritasView.onCreateView();
            // */

    }



    public void inicializaAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    /**
     *
     */
    public void inicializarListaMascotas(){


        //ConstructorMascotas constructorMascotas = new ConstructorMascotas(this);

       // mascotas = constructorMascotas.obtenerDatos();

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Coby", R.drawable.gato_1, 4));
        mascotas.add(new Mascota("Toby", R.drawable.gato_3, 6));
        mascotas.add(new Mascota("Nala", R.drawable.perro_3, 8));
        mascotas.add(new Mascota("Catty", R.drawable.gato_4, 9));
        mascotas.add(new Mascota("Luna", R.drawable.perro_4, 8));

    }



    /**
     *
     */
    public void inicializarActionBar(){


        Toolbar actionBar = (Toolbar) findViewById(R.id.action_bar_fav);
        setSupportActionBar(actionBar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();
        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

    }

    public void generarLinearLayoutVertical() {

        listaMascotas = (RecyclerView) findViewById(R.id.recycler_mascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }


}

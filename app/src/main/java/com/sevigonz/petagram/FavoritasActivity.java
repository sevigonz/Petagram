package com.sevigonz.petagram;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.sevigonz.petagram.adapter.MascotaAdaptador;
import com.sevigonz.petagram.pojo.Mascota;

import java.util.ArrayList;

public class FavoritasActivity extends AppCompatActivity {



    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);


        listaMascotas = (RecyclerView) findViewById(R.id.recycler_mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        inicializaAdaptador();

        inicializarActionBar();

    }


    public void inicializaAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    /**
     *
     */
    public void inicializarListaMascotas(){


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
}

package com.sevigonz.petagram.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sevigonz.petagram.R;
import com.sevigonz.petagram.model.Mascota;

import java.util.ArrayList;

/**
 * Created by angel on 22/02/17.
 */

public class MyPetAdaptador extends  RecyclerView.Adapter<MyPetAdaptador.MascotaViewHolder>{

    /**
     * Array list de mascotas para que lo procese el adaptador
     */
    ArrayList<Mascota> mascotas;
    Activity activity;

    public MyPetAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }


    /**
     * Inflar el layout y pasarlo al viewHolder para que obtenga los views
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_my_pet, parent, false);

        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        mascotaViewHolder.mascotaImagen.setImageResource(mascota.getImagen());
        mascotaViewHolder.raiting.setText(String.valueOf(mascota.getRaiting()));
    }

    /**
     * Cantidad de elementos que contiene la lista
     */
    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView mascotaImagen;
        private TextView raiting;


        public MascotaViewHolder(View itemView) {
            super(itemView);

            mascotaImagen = (ImageView) itemView.findViewById(R.id.imagen_mascota);
            raiting = (TextView) itemView.findViewById(R.id.raiting_mascota);
        }
    }
}

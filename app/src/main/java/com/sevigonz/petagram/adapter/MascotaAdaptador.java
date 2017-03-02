package com.sevigonz.petagram.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sevigonz.petagram.R;
import com.sevigonz.petagram.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by angel on 22/02/17.
 */

public class MascotaAdaptador extends  RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    /**
     * Array list de mascotas para que lo procese el adaptador
     */
    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
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

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);

        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        mascotaViewHolder.mascotaImagen.setImageResource(mascota.getImagen());
        mascotaViewHolder.nombre.setText(mascota.getNombre());
        mascotaViewHolder.raiting.setText(String.valueOf(mascota.getRaiting()));

        final Mascota finalMascota = mascota;

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView _raiting = (TextView) activity.findViewById(R.id.raiting_mascota);


                if(!finalMascota.isLiked()){

                    Integer _current_raiting = Integer.parseInt((_raiting.getText().toString()));
                    Integer _final_raiting = _current_raiting + 1;
                    //_raiting.setText(String.valueOf(_final_raiting));
                    finalMascota.setLiked(true);
                    //Display message
                    Toast.makeText(activity, "Ahora te gusta " + finalMascota.getNombre(), Toast.LENGTH_SHORT).show();

                } else {
                    Integer _current_raiting = Integer.parseInt((_raiting.getText().toString()));
                    Integer _final_raiting = _current_raiting - 1;
                    //_raiting.setText(String.valueOf(_final_raiting));
                    finalMascota.setLiked(false);
                    //Display message
                    Toast.makeText(activity, "Ya no te gusta " + finalMascota.getNombre(), Toast.LENGTH_SHORT).show();
                }

            }
        });


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
        private TextView nombre;
        private TextView raiting;
        private ImageButton btnLike;


        public MascotaViewHolder(View itemView) {
            super(itemView);

            mascotaImagen = (ImageView) itemView.findViewById(R.id.imagen_mascota);
            nombre = (TextView) itemView.findViewById(R.id.nombre_mascota);
            raiting = (TextView) itemView.findViewById(R.id.raiting_mascota);
            btnLike = (ImageButton) itemView.findViewById(R.id.boton_like_mascota);
        }
    }
}

package com.sevigonz.petagram.vista.activity;

import com.sevigonz.petagram.adapter.MascotaAdaptador;
import com.sevigonz.petagram.model.Mascota;

import java.util.ArrayList;

/**
 * Created by angel on 5/03/17.
 */

public interface IFavoritasView {



    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);


}

package com.sevigonz.petagram.vista.fragment;

import com.sevigonz.petagram.adapter.MascotaAdaptador;
import com.sevigonz.petagram.model.Mascota;

import java.util.ArrayList;

/**
 * Created by angel on 5/03/17.
 */

public interface IRecyclerViewFragmentView {



    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> contactos);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);


}

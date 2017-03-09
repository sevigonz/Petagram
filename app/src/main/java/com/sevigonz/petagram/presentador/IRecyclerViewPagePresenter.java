package com.sevigonz.petagram.presentador;

import com.sevigonz.petagram.adapter.MascotaAdaptador;
import com.sevigonz.petagram.model.Mascota;

import java.util.ArrayList;

/**
 * Created by angel on 7/03/17.
 */

public interface IRecyclerViewPagePresenter {

    public void obtenerMascotas();

    public void mostrarMascotasRv();
}


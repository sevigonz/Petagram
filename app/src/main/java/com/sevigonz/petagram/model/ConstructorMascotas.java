package com.sevigonz.petagram.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.sevigonz.petagram.R;
import com.sevigonz.petagram.db.BaseDatos;
import com.sevigonz.petagram.db.ConstantesBaseDatos;

import java.util.ArrayList;


/**
 * Created by anahisalgado on 21/04/16.
 */
public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos() {
        BaseDatos db = new BaseDatos(context);

        /*SQLiteDatabase sqlDb = db.getWritableDatabase();
        db.onUpgrade(sqlDb, ConstantesBaseDatos.DATABASE_VERSION, ConstantesBaseDatos.DATABASE_VERSION);
        insertarCincoMascotas(db);*/
        return  db.obtenerTodasLasMascotas();
    }



    public void insertarCincoMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Coby");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_IMAGEN, R.drawable.gato_1);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Toby");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_IMAGEN, R.drawable.gato_2);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Nala");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_IMAGEN, R.drawable.perro_3);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Catty");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_IMAGEN, R.drawable.gato_4);
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Luna");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_IMAGEN, R.drawable.perro_4);
        db.insertarMascota(contentValues);
    }


    public void darLikeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);

        db.insertarLikeMascota(contentValues);
    }

    public int obtenerLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);
    }


}

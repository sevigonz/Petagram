package com.sevigonz.petagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sevigonz.petagram.pojo.ContactForm;

public class ConfirmacionContactoActivity extends AppCompatActivity {


    ContactForm contacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_confirmacion_contacto);

        Bundle parametros = getIntent().getExtras();

        String nombre_completo = parametros.getString(getResources().getString(R.string.nombre_completo));
        String email = parametros.getString(getResources().getString(R.string.email));
        String mensaje = parametros.getString(getResources().getString(R.string.mensaje));


        contacto = new ContactForm(nombre_completo, email, mensaje);

        TextView cc_nombre_completo = (TextView) findViewById(R.id.cc_nombre_completo);

        contacto.sendMail();
        cc_nombre_completo.setText(contacto.getNombre());


        addButtonSiguiente();

    }




    public void addButtonSiguiente() {

        Button editarContacto = (Button) findViewById(R.id.goHome);



        editarContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ConfirmacionContactoActivity.this, MascotasActivity.class);
                startActivity(intent);
            };
        });

    }

}

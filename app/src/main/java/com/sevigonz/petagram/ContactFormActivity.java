package com.sevigonz.petagram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sevigonz.petagram.pojo.ContactForm;

public class ContactFormActivity extends PetagramAppActivity {


    ContactForm contactForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_contact_form);

        addButtonSiguiente();

        super.onCreate(savedInstanceState);

        Toast.makeText(getApplicationContext(), "Para poder enviar el mensage configura las propiedades del envio en" +
                " la clase  /pojo/ContactForm ", Toast.LENGTH_LONG).show();
    }


    public void addButtonSiguiente() {

        Button buttonSiguiente = (Button) findViewById(R.id.f_c_enviar_contacto);


        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ContactFormActivity.this, ConfirmacionContactoActivity.class);

                intent.putExtra(getResources().getString(R.string.nombre_completo), (String) ((EditText) findViewById(R.id.f_c_nombre_completo)).getText().toString());
                intent.putExtra(getResources().getString(R.string.email), (String) ((EditText) findViewById(R.id.f_c_email)).getText().toString());
                intent.putExtra(getResources().getString(R.string.mensaje), (String) ((EditText) findViewById(R.id.f_c_mensage)).getText().toString());


                String nombre = (String) ((EditText) findViewById(R.id.f_c_nombre_completo)).getText().toString();
                String email = (String) ((EditText) findViewById(R.id.f_c_email)).getText().toString();
                String mensaje = (String) ((EditText) findViewById(R.id.f_c_mensage)).getText().toString();


                if (nombre.isEmpty() ||
                        email.isEmpty() ||
                        mensaje.isEmpty()) {
                    Context context = getApplicationContext();
                    CharSequence text = "Todos los campos son reuqeridos";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else {
                    startActivity(intent);
                }
            }

            ;
        });

    }


}

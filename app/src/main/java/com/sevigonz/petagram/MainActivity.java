package com.sevigonz.petagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButtonSiguiente();
    }



    public void addButtonSiguiente() {

        Button buttonSiguiente = (Button) findViewById(R.id.boton_entrar_aplicacion);



        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MascotasActivity.class);

                startActivity(intent);
            };
        });

    }
}

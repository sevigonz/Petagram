package com.sevigonz.petagram;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUsActivity extends PetagramAppActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_about_us);


        //AppBarLayout outer = (AppBarLayout)findViewById(R.id.actionBar);
        //Toolbar toolbar = (Toolbar)outer.findViewById(R.id.toolbar);

        //if(toolbar!= null){
        //  setSupportActionBar(toolbar);
        //}

        addButtonSiguiente();
        super.onCreate(savedInstanceState);
    }


    public void addButtonSiguiente() {

        Button editarContacto = (Button) findViewById(R.id.goHome);


        editarContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AboutUsActivity.this, MascotasActivity.class);
                startActivity(intent);
            }

            ;
        });

    }
}

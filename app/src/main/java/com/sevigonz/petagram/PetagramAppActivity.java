package com.sevigonz.petagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class PetagramAppActivity extends AppCompatActivity {


    protected Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppBarLayout outer = (AppBarLayout) findViewById(R.id.actionBar);
        toolbar = (Toolbar) outer.findViewById(R.id.toolbar);

        if(toolbar!= null){
            setSupportActionBar(toolbar);
        }

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        addButtonFavoritas();

    }

    /**
     *
     */
    public void addButtonFavoritas() {

        ImageView buttonSiguiente = (ImageView) findViewById(R.id.cinco_favoritas);



        buttonSiguiente.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(PetagramAppActivity.this,  FavoritasActivity.class);
                startActivity(mainIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.mAbout:

                Intent intentAbout = new Intent(PetagramAppActivity.this, AboutUsActivity.class);
                startActivity(intentAbout);
                break;

            case R.id.mSettings:

                Intent intentContactForm = new Intent(PetagramAppActivity.this, ContactFormActivity.class);
                startActivity(intentContactForm);
                break;


        }

        return super.onOptionsItemSelected(item);
    }

}

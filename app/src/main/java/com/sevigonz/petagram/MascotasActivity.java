package com.sevigonz.petagram;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.sevigonz.petagram.adapter.PageAdapter;
import com.sevigonz.petagram.fragment.MyPetFragment;
import com.sevigonz.petagram.fragment.RecyclerViewFragment;

import java.util.ArrayList;

public class MascotasActivity extends PetagramAppActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_mascotas);

        AppBarLayout outer = (AppBarLayout)findViewById(R.id.actionBar);
        tabLayout = (TabLayout)outer.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();

        super.onCreate(savedInstanceState);
    }


    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new MyPetFragment());

        return fragments;
    }


    private void setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

    }


}

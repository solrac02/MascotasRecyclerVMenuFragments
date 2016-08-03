package com.juanmorales.mascotasrv;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.juanmorales.mascotasrv.adapter.MascotaAdaptador;
import com.juanmorales.mascotasrv.pojo.Mascota;

import java.util.ArrayList;

public class MascotasFavoritasActivity extends AppCompatActivity {

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;
    public MascotaAdaptador adaptador;
    Activity activity;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        //Incluyendo la barra a cada activitie
        //Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        listaMascotas = (RecyclerView)findViewById(R.id.rvTopMascotas);
        LinearLayoutManager llm_mascotas = new LinearLayoutManager(this);
        llm_mascotas.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm_mascotas);
        inicializarListaMascotas();
        inicializarAdaptador();

        if (toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        //mascotas.add(new Mascota("Dashita", R.drawable.mascota_1, "3",R.drawable.dogbone_1, R.drawable.dogbone_2));
        //mascotas.add(new Mascota("Aldo", R.drawable.maecota_2, "2",R.drawable.dogbone_1, R.drawable.dogbone_2));
        //mascotas.add(new Mascota("Grenitas", R.drawable.mascota_3, "4",R.drawable.dogbone_1, R.drawable.dogbone_2));
        //mascotas.add(new Mascota("Dona", R.drawable.mascota_4, "4",R.drawable.dogbone_1, R.drawable.dogbone_2));
        //mascotas.add(new Mascota("manchas", R.drawable.mascota_5, "1",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Deisy", R.drawable.mascota_6, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Laydi", R.drawable.mascota_7, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Mister", R.drawable.mascota_8, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Sauer", R.drawable.mascota_9, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Dino", R.drawable.mascota_10, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));

    }



}

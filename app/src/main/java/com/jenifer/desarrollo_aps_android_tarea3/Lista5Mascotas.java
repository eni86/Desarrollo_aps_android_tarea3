package com.jenifer.desarrollo_aps_android_tarea3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Lista5Mascotas extends AppCompatActivity {

    private ArrayList <Mascota> mascotas = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista5_mascotas);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.actionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mascotas.add(new Mascota(R.drawable.cute_dog_headshot, "Toby", 15,false));
        mascotas.add(new Mascota(R.drawable.perro2, "Hugo", 16,true));
        mascotas.add(new Mascota(R.drawable.perro3, "Paco", 5,false));
        mascotas.add(new Mascota(R.drawable.perro4, "Luis", 17,true));
        mascotas.add(new Mascota(R.drawable.perro5, "Alvin", 20,false));

        listaMascotas = (RecyclerView) findViewById(R.id.rv5Mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarAdaptador();


       }
    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }




}

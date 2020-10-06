package com.jenifer.desarrollo_aps_android_tarea3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Lista5Mascotas extends AppCompatActivity {

    @Override
    private ArrayList <Mascota> mascotas = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista5_mascotas);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.actionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mascotas.add(new Mascota(R.drawable.cute_dog_headshot, "Toby",false, 15));
        mascotas.add(new Mascota(R.drawable.perro2, "Hugo",true, 16));
        mascotas.add(new Mascota(R.drawable.perro3, "Paco",false, 5));
        mascotas.add(new Mascota(R.drawable.perro4, "Luis",true, 17));
        mascotas.add(new Mascota(R.drawable.perro5, "Alvin",false, 20));

        listaMascotas = (RecyclerView) findViewById(R.id.rv5Mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarAdaptador();

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();

       }
    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador); MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }




}

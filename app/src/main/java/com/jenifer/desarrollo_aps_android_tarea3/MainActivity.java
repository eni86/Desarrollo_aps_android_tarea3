package com.jenifer.desarrollo_aps_android_tarea3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList <Mascota> mascotas = new ArrayList<Mascota>();
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.actionBar);


        mascotas.add(new Mascota(R.drawable.cute_dog_headshot, "Toby", 15,false));
        mascotas.add(new Mascota(R.drawable.perro2, "Hugo", 16,true));
        mascotas.add(new Mascota(R.drawable.perro3, "Paco", 5,false));
        mascotas.add(new Mascota(R.drawable.perro4, "Luis", 17,true));
        mascotas.add(new Mascota(R.drawable.perro5, "Alvin", 20,false));
        mascotas.add(new Mascota(R.drawable.perro6, "Simon", 12,true));
        mascotas.add(new Mascota(R.drawable.perro7, "Theodore", 10,true));




        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarAdaptador();


    }
    private void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
    public void ir5mascoras(){
        Intent i = new Intent(this, Lista5Mascotas.class);
        startActivity(i);
    }


}
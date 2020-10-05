package com.jenifer.desarrollo_aps_android_tarea3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayList <Mascota> mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.cute_dog_headshot, "Toby",false, 15));
        mascotas.add(new Mascota(R.drawable.perro2, "Hugo",true, 16));
        mascotas.add(new Mascota(R.drawable.perro3, "Paco",false, 5));
        mascotas.add(new Mascota(R.drawable.perro4, "Luis",true, 17));
        mascotas.add(new Mascota(R.drawable.perro5, "Alvin",false, 20));
        mascotas.add(new Mascota(R.drawable.perro6, "Simon",true, 12));
        mascotas.add(new Mascota(R.drawable.perro7, "Theodore",true, 10));
        private RecyclerView listaMascotas;

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }


}
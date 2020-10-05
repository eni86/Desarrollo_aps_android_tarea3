package com.jenifer.desarrollo_aps_android_tarea3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Lista5Mascotas extends AppCompatActivity {
    ArrayList <Mascota> mascotas;

    mascotas.add(new Mascota(R.drawable.cute_dog_headshot, "Toby",false, 15));
    mascotas.add(new Mascota(R.drawable.perro2, "Hugo",true, 16));
    mascotas.add(new Mascota(R.drawable.perro3, "Paco",false, 5));
    mascotas.add(new Mascota(R.drawable.perro4, "Luis",true, 17));
    mascotas.add(new Mascota(R.drawable.perro5, "Alvin",false, 20));

    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista5_mascotas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listaMascotas = (RecyclerView) findViewById(R.id.rv5Mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarAdaptador();
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
}

    }
}
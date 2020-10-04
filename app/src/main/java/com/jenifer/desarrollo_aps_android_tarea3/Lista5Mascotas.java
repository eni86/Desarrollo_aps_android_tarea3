package com.jenifer.desarrollo_aps_android_tarea3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

public class Lista5Mascotas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista5_mascotas);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
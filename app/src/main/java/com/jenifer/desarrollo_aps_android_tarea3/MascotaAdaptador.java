package com.jenifer.desarrollo_aps_android_tarea3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{
    ArrayList<> mascotas;
    public MascotaViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new MascotaViewHolder(v);
    }

    public void onBindViewHolder (MascotaViewHolder holder, int position){
        ArrayList<> mascota = mascotas.get(position);
        holder.fotoMascota.setImageResource(mascota.getFoto());
        holder.nombreMascota.setText(mascota.getNombre());
        holder.descripMascota.setText(mascota.getDescripcion());

    }

    public int itemCount(){
        return mascotas.size();
    }
    public static class MascotaViewHolder  extends RecyclerView.ViewHolder {
        private ImageView fotoMascota;
        private TextView nombreMascota;
        private TextView descripMascota;

        public MascotaViewHolder (View itemView){
            super(itemView);
            fotoMascota = (ImageView) itemView.findViewById(R.id.foto);
            nombreMascota = (TextView) itemView.findViewById(R.id.nombreMascota);
            descripMascota = (TextView) itemView.findViewById(R.id.descripcionMascota);

        }
    }

    public MascotaAdaptador (ArrayList <Mascota> mascotas){
        this.mascotas = mascotas;
    }
}

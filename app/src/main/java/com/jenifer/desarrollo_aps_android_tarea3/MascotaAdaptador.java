package com.jenifer.desarrollo_aps_android_tarea3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{
    ArrayList<Mascota> mascotas;
    public MascotaViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new MascotaViewHolder(v);
    }

    public void onBindViewHolder (MascotaViewHolder holder, int position){
        final Mascota mascota = mascotas.get(position);
        holder.fotoMascota.setImageResource(mascota.getFoto());
        holder.nombreMascota.setText(mascota.getNombre());

        holder.likeMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int contador = mascota.getLike();
                if (mascota.isLiked() == true ){
                    mascota.setLike(contador - 1);
                    mascota.setLiked(false);
                } else{
                    mascota.setLike(contador + 1);
                    mascota.setLiked(true);
                }
                holder.likeMascota.setText(mascota.getLike());
            }
        });


    }

    public int itemCount(){
        return mascotas.size();
    }
    public static class MascotaViewHolder  extends RecyclerView.ViewHolder {
        private ImageView fotoMascota;
        private TextView nombreMascota;
        private ImageButton likeMascota;

        public MascotaViewHolder (View itemView){
            super(itemView);
            fotoMascota = (ImageView) itemView.findViewById(R.id.foto);
            nombreMascota = (TextView) itemView.findViewById(R.id.nombreMascota);
            likeMascota = (ImageButton) itemView.findViewById(R.id.btLike);

        }
    }

    public MascotaAdaptador (ArrayList <Mascota> mascotas){
        this.mascotas = mascotas;
    }
}

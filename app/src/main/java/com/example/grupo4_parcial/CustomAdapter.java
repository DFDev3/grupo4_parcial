package com.example.grupo4_parcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    public void setListadoinformacion(ArrayList<Producto> listadoinformacion) {
        this.listadoinformacion = listadoinformacion;
        notifyDataSetChanged();
    }

    private ArrayList<Producto> listadoinformacion;
    private View.OnClickListener onClickListener;

    public CustomAdapter(ArrayList<Producto> listadoinformacion){
        this.listadoinformacion = listadoinformacion;
        this.onClickListener = null;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View miview = LayoutInflater.from(parent.getContext().inflate(R.layout.))
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_rival,tv_marcador,tv_gf,tv_gc;
        private ImageView iv_escudo;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_rival = itemView.findViewById(R.id.tv_rival);
            tv_gc = itemView.findViewById(R.id.tv_gc);
            tv_gf= itemView.findViewById(R.id.tv_gf);
            tv_marcador = itemView.findViewById(R.id.tv_marcador);
        }

        public  void  enlazar(Producto miproducto){
            tv_rival.setText(miproducto.getRival());
            tv_gf.setText(miproducto.getGf());
            tv_gc.setText(miproducto.getGf());
            Picasso.get().load(miproducto.getRivalUrl())
                    .error(R.drawable.ic_launcher_background)
                    .into(Producto);
    }
    }
}


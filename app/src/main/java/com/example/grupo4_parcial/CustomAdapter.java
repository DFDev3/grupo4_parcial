package com.example.grupo4_parcial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends  RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    public void setListadoinformacion(ArrayList<Partido> listadoinformacion) {
        this.listadoinformacion = listadoinformacion;
        notifyDataSetChanged();
    }

    private ArrayList<Partido> listadoinformacion;

    private OnClickListener onClickListener;

    public CustomAdapter(ArrayList<Partido> listadoinformacion) {
        this.listadoinformacion = listadoinformacion;
        this.onClickListener = null;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View miview = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_producto,parent,false);
        return new ViewHolder(miview);

    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {

        Partido miPartido = listadoinformacion.get(position);
        holder.enlazar(miPartido);
    }

    @Override
    public int getItemCount() {
        return listadoinformacion.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvmarcador,tvgf,tvgc,tvtitulo;
        private ImageView ivrival;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvtitulo=itemView.findViewById(R.id.tv_rival);
            tvmarcador=itemView.findViewById(R.id.tv_marcador);
            tvgf=itemView.findViewById(R.id.tv_gf);
            tvgc=itemView.findViewById(R.id.tv_gc);
            ivrival=itemView.findViewById(R.id.iv_escudo);
        }
        public  void  enlazar(Partido miPartido){
            tvtitulo.setText(miPartido.getRival());
            tvmarcador.setText(R.string.marcador2);
            Picasso.get().load(miPartido.getRivalUrl())
                    .error(R.drawable.ic_launcher_background)
                    .into(ivrival);

            if (onClickListener != null){
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onClickListener.OnItemClick(miPartido,getAdapterPosition());
                    }
                });
            }
        }

    }
    public interface OnClickListener {
        void OnItemClick(Partido miPartido, int posicion);
    }
}

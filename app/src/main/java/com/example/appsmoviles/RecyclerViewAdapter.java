package com.example.appsmoviles;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appsmoviles.R;
import com.example.appsmoviles.clases.Comida;

import java.util.ArrayList;

/**
 * Created by Aws on 28/01/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private ArrayList<Comida> mData ;


    public RecyclerViewAdapter(Context mContext, ArrayList<Comida> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_comida,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.nombre_comida.setText(mData.get(position).getNombre());
        holder.img_comida.setImageResource(mData.get(position).getImagen());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,DetalleComida.class);

                // Le paso la info a la otra pantalla
                intent.putExtra("Nombre",mData.get(position).getNombre());
                intent.putExtra("Calorias", Integer.toString(mData.get(position).getCalorias()));
                intent.putExtra("Hidratos",Integer.toString(mData.get(position).getHidratos()));
                intent.putExtra("Grasas",Integer.toString(mData.get(position).getGrasas()));
                intent.putExtra("Proteinas",Integer.toString(mData.get(position).getProteinas()));
                intent.putExtra("Imagen",Integer.toString(mData.get(position).getImagen()));

                // Arranco la actividad
                mContext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nombre_comida;
        ImageView img_comida;
        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            nombre_comida = (TextView) itemView.findViewById(R.id.comida_nombre_id) ;
            img_comida = (ImageView) itemView.findViewById(R.id.comida_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);


        }
    }


}
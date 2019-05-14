package com.example.appsmoviles;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.appsmoviles.clases.Comida;

import java.util.ArrayList;

public class Piramide extends AppCompatActivity {
    ArrayList<String> listaComida = new ArrayList<String>();
    ListView listado;
    ConstraintLayout constraintLayout;
    ImageView manito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramide);
        manito=findViewById(R.id.manito);
        constraintLayout=findViewById(R.id.ctly);
        listado= findViewById(R.id.listado);
        //parte baja
        listaComida.add("Fideos");
        listaComida.add("Pan");
        listaComida.add("Granola");
        listaComida.add("Papas");
        listaComida.add("Batatas");
        //parte media
        listaComida.add("Sandia");
        listaComida.add("Pera");
        listaComida.add("banana");
        listaComida.add("Tomate");
        listaComida.add("palta");
        listaComida.add("berenjena");
        //parte casi alta
        listaComida.add("Queso");
        listaComida.add("Pollo");
        listaComida.add("Carne");
        listaComida.add("Huevos");
        listaComida.add("Leche");
        //parte alta
        listaComida.add("Helado");
        listaComida.add("Galletitas");
        listaComida.add("Golosinas");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listaComida);
        listado.setAdapter(arrayAdapter);
        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                if (position < 5) {
                    constraintSet.connect(R.id.manito, ConstraintSet.TOP, R.id.barra2, ConstraintSet.BOTTOM, 700);
                }
                if (position>4 && position<11) {
                    constraintSet.connect(R.id.manito, ConstraintSet.TOP, R.id.barra2, ConstraintSet.BOTTOM, 500);
                }
                if (position>10 && position<16) {
                    constraintSet.connect(R.id.manito, ConstraintSet.TOP, R.id.barra2, ConstraintSet.BOTTOM, 300);
                }
                if (position>15 && position<19) {
                    constraintSet.connect(R.id.manito, ConstraintSet.TOP, R.id.barra2, ConstraintSet.BOTTOM, 100);
                }
                constraintSet.applyTo(constraintLayout);
            }
        });
    }


}


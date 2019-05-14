package com.example.appsmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.appsmoviles.clases.Comida;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Declaro la lista que va a contener las comidas
    ArrayList<Comida> listaComida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancio la lista vacía
        listaComida = new ArrayList<>();

        //Agrego comidas
        listaComida.add( new Comida ("Serenísima",57, 5, 3, 3, R.drawable.serenisima) );
        listaComida.add( new Comida ("Nesquik",385, 5, 81, 4, R.drawable.nesquik) );
        listaComida.add( new Comida ("Oreo",510, 5, 66, 26, R.drawable.oreo) );
        listaComida.add( new Comida ("Dulce de Leche",300, 7, 55, 7, R.drawable.dulcedeleche) );
        listaComida.add( new Comida ("Quaker",300, 10, 44, 6, R.drawable.quaker) );
        listaComida.add( new Comida ("Terrabusi",390, 15, 60, 15, R.drawable.terrabusi) );
        listaComida.add( new Comida ("Don Satur",400, 9, 55, 27, R.drawable.donsatur) );

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,listaComida);
        myrv.setLayoutManager(new GridLayoutManager(this,2));

        myrv.setAdapter(myAdapter);

    }
}

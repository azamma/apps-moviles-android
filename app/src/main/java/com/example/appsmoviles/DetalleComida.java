package com.example.appsmoviles;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class DetalleComida extends AppCompatActivity {

    //Declaro los textos de vistas
    TextView detalleNombre, detalleCal, detalleGrasas, detalleProtes, detalleHidratos;
    ImageView imagen;
    Intent intent;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_comida);

        //Recupero los datos que viajan de la activity principal
        intent = getIntent();

        //Recupero los objetos de texto en pantalla
        detalleNombre = findViewById(R.id.detalle_nombre);
        detalleCal = findViewById(R.id.calorias_detalle);
        detalleGrasas = findViewById(R.id.grasas_detalle);
        detalleProtes = findViewById(R.id.proteinas_detalle);
        detalleHidratos = findViewById(R.id.hidratos_detalle);
        imagen = findViewById(R.id.imagen_detalle);

        //Y ahora le doy los valores que traigo de la activity principal
        detalleNombre.setText(Objects.requireNonNull(intent.getExtras()).getString("Nombre"));
        detalleCal.setText(intent.getExtras().getString("Calorias") + " Kcal");
        detalleGrasas.setText(intent.getExtras().getString("Grasas") + " Grs.");
        detalleProtes.setText(intent.getExtras().getString("Proteinas") + " Grs.");
        detalleHidratos.setText(intent.getExtras().getString("Hidratos") + " Grs.");
        imagen.setImageResource(Integer.parseInt(Objects.requireNonNull(intent.getExtras().getString("Imagen"))));

    }
}

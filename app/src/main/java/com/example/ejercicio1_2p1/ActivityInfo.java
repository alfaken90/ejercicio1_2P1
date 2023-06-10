package com.example.ejercicio1_2p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityInfo extends AppCompatActivity {

    TextView nombre, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        nombre = (TextView) findViewById(R.id.nombreCompleto);
        edad = (TextView) findViewById(R.id.edadCompleta);
        correo = (TextView) findViewById(R.id.correoCompleto);

        Intent i = getIntent();
        String name = i.getStringExtra("NOMBRE");
        String lastName = i.getStringExtra("APELLIDOS");
        String age = i.getStringExtra("EDAD");
        String email = i.getStringExtra("CORREO");

        nombre.setText(name + " " + lastName);
        edad.setText(age + " Años");
        correo.setText(email);
    }
}
package com.example.ejercicio1_2p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellidos, edad, correo;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        apellidos = (EditText) findViewById(R.id.apellidos);
        edad = (EditText) findViewById(R.id.edad);
        correo = (EditText) findViewById(R.id.correo);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nombre.getText().toString();
                String lastName = apellidos.getText().toString();
                int edadF = Integer.parseInt(edad.getText().toString());
                String age = String.valueOf(edadF);
                String email = correo.getText().toString();

                Intent i = new Intent(getApplicationContext(),ActivityInfo.class);
                i.putExtra("NOMBRE", name);
                i.putExtra("APELLIDOS", lastName);
                i.putExtra("EDAD", age);
                i.putExtra("CORREO", email);

                startActivity(i);
            }
        });

    }
}
package com.example.app11_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TerceraActivity extends AppCompatActivity {
    private TextView tv12;
    private TextView tv222;

    private EditText et11;
    private EditText et12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        tv12 = (TextView)findViewById(R.id.tv12);
        et11 = (EditText)findViewById(R.id.et11);
        et12 = (EditText)findViewById(R.id.et12);
        tv222 = (TextView)findViewById(R.id.tv222);

        String parametre3 = getIntent().getStringExtra("Resul");
        tv12.setText(parametre3);
    }

    public void Calcular(View view){
        String valor1 = et11.getText().toString();
        String valor2 = et12.getText().toString();

        if(valor1.isEmpty() || valor2.isEmpty()) {
            String mensaje = "Introduïu valors";
            tv222.setText(mensaje);
            return;
        }
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int resta=n1-n2;
        String resultat = String.valueOf(resta);
        tv222.setText(resultat);
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
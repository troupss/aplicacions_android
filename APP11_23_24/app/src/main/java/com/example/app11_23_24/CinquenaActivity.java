package com.example.app11_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CinquenaActivity extends AppCompatActivity {
    private TextView tv14;
    private TextView tvv1;
    private EditText ett1;
    private EditText ett2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinquena);

        tv14 = (TextView)findViewById(R.id.tv14);
        tvv1 = (TextView)findViewById(R.id.tvv1);
        ett1 = (EditText)findViewById(R.id.ett1);
        ett2 = (EditText)findViewById(R.id.ett2);

        String parametre3 = getIntent().getStringExtra("Resul");
        tv14.setText(parametre3);
    }
    public void Calcular(View view){
        String valor1 = ett1.getText().toString();
        String valor2 = ett2.getText().toString();

        if(valor1.isEmpty() || valor2.isEmpty()) {
            String mensaje = "Introduïu valors";
            tvv1.setText(mensaje);
            return;
        }

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        if(n2==0){
            String error = "Error";
            tvv1.setText(error);
        }else{
            int divisio=n1/n2;
            String resultat = String.valueOf(divisio);
            tvv1.setText(resultat);
        }
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
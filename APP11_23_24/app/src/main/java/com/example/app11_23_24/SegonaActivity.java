package com.example.app11_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegonaActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv111;
    private EditText et1;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv111 = (TextView)findViewById(R.id.tv111);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        String parametre2 = getIntent().getStringExtra("Resul");
        tv1.setText(parametre2);
    }

    public void Calcular(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        if(valor1.isEmpty() || valor2.isEmpty()) {
            String mensaje = "Introduïu valors";
            tv111.setText(mensaje);
            return;
        }
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int suma=n1+n2;
        String resultat = String.valueOf(suma);
        tv111.setText(resultat);
    }

    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }


}
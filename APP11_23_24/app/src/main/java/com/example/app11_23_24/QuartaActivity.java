package com.example.app11_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class QuartaActivity extends AppCompatActivity {
    private TextView tv13;
    private TextView tv2222;
    private EditText et111;
    private EditText et222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        tv13 = (TextView)findViewById(R.id.tv13);
        tv2222 = (TextView)findViewById(R.id.tv2222);
        et111 = (EditText)findViewById(R.id.et111);
        et222 = (EditText)findViewById(R.id.et222);

        String parametre3 = getIntent().getStringExtra("Resul");
        tv13.setText(parametre3);
    }

    public void Calcular(View view){
        String valor1 = et111.getText().toString();
        String valor2 = et222.getText().toString();

        if(valor1.isEmpty() || valor2.isEmpty()) {
            String mensaje = "Introduïu valors";
            tv2222.setText(mensaje);
            return;
        }

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int multiplicació=n1*n2;
        String resultat = String.valueOf(multiplicació);
        tv2222.setText(resultat);
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
package com.example.app3_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    int numero = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);
        String resultat = String.valueOf(numero);
        tv1.setText(resultat);

    }

    public void Incrementar(View dibuix){
        numero++;
        String resultat = String.valueOf(numero);
        tv1.setText(resultat);
    }
    public void Decrementar(View dibuix){
        numero--;
        String resultat = String.valueOf(numero);
        tv1.setText(resultat);
    }
    public void Resetear(View dibuix){
        numero=0;
        String resultat = String.valueOf(numero);
        tv1.setText(resultat);
    }



}
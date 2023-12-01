package com.example.app1_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView)findViewById(R.id.tv1);
    }

    public void sumar(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int suma=n1+n2;

        String resultat = String.valueOf(suma);
        tv1.setText(resultat);
    }
    public void restar(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int suma=n1-n2;

        String resultat = String.valueOf(suma);
        tv1.setText(resultat);
    }
    public void multiplicar(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int suma=n1*n2;

        String resultat = String.valueOf(suma);
        tv1.setText(resultat);
    }
    public void combinacions(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        if (n1 < n2) {
            String error = "n1 ha de ser major que n2!";
            tv1.setText(error);
        } else {
            int resultado = combinacion(n1, n2);
            String resultat = ("!(" + n1 + ", " + n2 + ") = " + resultado);
            tv1.setText(resultat);
        }

    }
    public void dividir(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int suma=n1/n2;

        String resultat = String.valueOf(suma);
        tv1.setText(resultat);
    }

    public void mod(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int suma=n1%n2;

        String resultat = String.valueOf(suma);
        tv1.setText(resultat);
    }
    public void elevar(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        double elevat=Math.pow(n1,n2);

        String resultat = String.valueOf(elevat);
        tv1.setText(resultat);

    }
    public int factorial(int n1) {
        if (n1 == 0) return 1;
        return n1 * factorial(n1 - 1);
    }
    public int combinacion(int n1, int n2) {
        return factorial(n1) / (factorial(n2) * factorial(n1 - n2));
    }
}
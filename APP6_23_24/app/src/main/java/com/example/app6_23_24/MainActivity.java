package com.example.app6_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private RadioButton rb1, rb2, rb3, rb4, rb5, rb6, rb7, rb8;
    String resultat = "";
    String error="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
        rb3=(RadioButton) findViewById(R.id.rb3);
        rb4=(RadioButton) findViewById(R.id.rb4);
        rb5=(RadioButton) findViewById(R.id.rb5);
        rb6=(RadioButton) findViewById(R.id.rb6);
        rb7=(RadioButton) findViewById(R.id.rb7);
        rb8=(RadioButton) findViewById(R.id.rb8);
    }
    public void Calcular(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        //Comprovar q introdueixes numeros i no estigui buit
        if(valor1.isEmpty() || valor2.isEmpty()) {
            error = "Introduïu valors";
            return;
        }
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        //Comprovar q estigui al menos una opcio marcada
        if(!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked() && !rb5.isChecked() && !rb6.isChecked() && !rb7.isChecked() && !rb8.isChecked()) {
            error = "Seleccioneu una operació";
            return;
        }
        if(rb1.isChecked()==true){
            int suma=n1+n2;
            resultat = String.valueOf(suma);

        }else if(rb2.isChecked()==true){
            int resta=n1-n2;
            resultat = String.valueOf(resta);

        }else if(rb3.isChecked()==true){
            int multiplicacio=n1*n2;
            resultat = String.valueOf(multiplicacio);

        }else if(rb4.isChecked()==true){
            int divisio=n1/n2;
            resultat = String.valueOf(divisio);

        }else if(rb5.isChecked()==true){
            double elevat=Math.pow(n1,n2);
            resultat = String.valueOf(elevat);

        }else if(rb6.isChecked()==true){
            int mod=n1%n2;
            resultat = String.valueOf(mod);

        }else if(rb7.isChecked()==true){
            if (n1 < n2) {
                error = "n1 ha de ser major que n2!";
            } else {
                int resultado = combinacion(n1, n2);
            }
        }else if(rb8.isChecked()==true){
            if (n2 < 0) {
                error = "n2 no pot ser negatiu";
            } else {
                double arrel = Math.sqrt(n2);
                resultat = "l'arrel quadrada de " + n2 + " és: " + arrel;
            }
        }
        Intent i = new Intent(this, SegonaActivity2.class);
        i.putExtra("Resul",resultat.toString());
        startActivity(i);
    }
    public int factorial(int n1) {
        if (n1 == 0) return 1;
        return n1 * factorial(n1 - 1);
    }
    public int combinacion(int n1, int n2) {
        return factorial(n1) / (factorial(n2) * factorial(n1 - n2));
    }
    public void Sortir(View view) {
        finishAffinity();
        System.exit(0);
    }
    public void Borrar(View dibuix){
        et1.setText("");
        et2.setText("");
        rb1.setChecked(false);
        rb2.setChecked(false);
        rb3.setChecked(false);
        rb4.setChecked(false);
        rb5.setChecked(false);
        rb6.setChecked(false);
        rb7.setChecked(false);
        rb8.setChecked(false);
    }

}
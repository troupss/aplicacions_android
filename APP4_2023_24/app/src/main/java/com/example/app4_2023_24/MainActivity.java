package com.example.app4_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
    String resultat = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView)findViewById(R.id.tv1);

        cb1=(CheckBox) findViewById(R.id.cb1);
        cb2=(CheckBox) findViewById(R.id.cb2);
        cb3=(CheckBox) findViewById(R.id.cb3);
        cb4=(CheckBox) findViewById(R.id.cb4);
        cb5=(CheckBox) findViewById(R.id.cb5);
        cb6=(CheckBox) findViewById(R.id.cb6);
        cb7=(CheckBox) findViewById(R.id.cb7);
        cb8=(CheckBox) findViewById(R.id.cb8);
    }
    public void Calcular(View dibuix){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        //Comprovar q introdueixes numeros i no estigui buit
        if(valor1.isEmpty() || valor2.isEmpty()) {
            String mensaje = "Introduïu valors";
            tv1.setText(mensaje);
            return;
        }
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        //Comprovar q estigui al menos una opcio marcada
        if(!cb1.isChecked() && !cb2.isChecked() && !cb3.isChecked() && !cb4.isChecked() && !cb5.isChecked() && !cb6.isChecked() && !cb7.isChecked()&& !cb8.isChecked()) {
            String mensaje = "Seleccioneu una operació";
            tv1.setText(mensaje);
            return;
        }
        //SUMA
        if(cb1.isChecked()==true){
            int suma=n1+n2;
            resultat = resultat + "la suma es: "+ String.valueOf(suma);
            tv1.setText(resultat);
        }
        //RESTA
        if(cb2.isChecked()==true){
            int resta=n1-n2;
            resultat = resultat + "la resta es: " + String.valueOf(resta);
            tv1.setText(resultat);
        }
        //MULTIPLICACIÓ
        if(cb3.isChecked()==true){
            int multiplicacio=n1*n2;
            resultat =  resultat + "la multiplicació es: " + String.valueOf(multiplicacio);
            tv1.setText(resultat);
        }
        //DIVISIÓ
        if(cb4.isChecked()==true){
            int divisio=n1/n2;
            resultat =  resultat + "la divisió es: " + String.valueOf(divisio);
            tv1.setText(resultat);
        }
        //ELEVACIÓ
        if(cb5.isChecked()==true){
            double elevat=Math.pow(n1,n2);
            resultat = resultat + "l'elevació es: " + String.valueOf(elevat);
            tv1.setText(resultat);
        }
        //MOD
        if(cb6.isChecked()==true){
            int mod=n1%n2;
            resultat = resultat + "el mod es: "+ String.valueOf(mod);
            tv1.setText(resultat);
        }
        //COMBINACIONS
        if(cb7.isChecked()==true){
            if (n1 < n2) {
                String error = "n1 ha de ser major que n2!";
                tv1.setText(error);
            } else {
                int resultado = combinacion(n1, n2);
                resultat = resultat + "la combinació es: "+("!(" + n1 + ", " + n2 + ") = " + resultado);
                tv1.setText(resultat);
            }
        }
        //ARREL
        if(cb8.isChecked()==true) {
            if (n2 < 0) {
                String error = "n2 no pot ser negatiu";
                tv1.setText(error);
            } else {
                double arrel = Math.sqrt(n2);
                resultat = resultat + "l'arrel quadrada de " + n2 + " és: " + arrel;
                tv1.setText(resultat);
            }
        }
    }

    private void BorrarTexte() {
        et1.setText("");
        et2.setText("");
        tv1.setText("");
    }

    public int factorial(int n1) {
        if (n1 == 0) return 1;
        return n1 * factorial(n1 - 1);
    }
    public int combinacion(int n1, int n2) {
        return factorial(n1) / (factorial(n2) * factorial(n1 - n2));
    }
    //Creant el boto Borrar i fer q tot estigui default sense res
    public void Borrar(View dibuix){
        et1.setText("");
        et2.setText("");

        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        cb4.setChecked(false);
        cb5.setChecked(false);
        cb6.setChecked(false);
        cb7.setChecked(false);
        cb8.setChecked(false);

        tv1.setText("");
    }
    public void Sortir(View view) {
        finish();
        System.exit(0);
    }
}
package com.example.prova1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv1 = (TextView)findViewById(R.id.tv1);

        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
        rb3=(RadioButton) findViewById(R.id.rb3);
        rb4=(RadioButton) findViewById(R.id.rb4);
        rb5=(RadioButton) findViewById(R.id.rb5);
        rb6=(RadioButton) findViewById(R.id.rb6);
        rb7=(RadioButton) findViewById(R.id.rb7);
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
        if(!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked() && !rb5.isChecked() && !rb6.isChecked() && !rb7.isChecked()) {
            String mensaje = "Seleccioneu una operació";
            tv1.setText(mensaje);
            return;
        }

        if(rb1.isChecked()==true){
            int suma=n1+n2;
            String resultat = String.valueOf(suma);
            tv1.setText(resultat);
        }else if(rb2.isChecked()==true){
            int resta=n1-n2;
            String resultat = String.valueOf(resta);
            tv1.setText(resultat);
        }else if(rb3.isChecked()==true){
            int multiplicacio=n1*n2;
            String resultat = String.valueOf(multiplicacio);
            tv1.setText(resultat);
        }else if(rb4.isChecked()==true){
            int divisio=n1/n2;
            String resultat = String.valueOf(divisio);
            tv1.setText(resultat);
        }else if(rb5.isChecked()==true){
            double elevat=Math.pow(n1,n2);
            String resultat = String.valueOf(elevat);
            tv1.setText(resultat);
        }else if(rb6.isChecked()==true){
            int mod=n1%n2;
            String resultat = String.valueOf(mod);
            tv1.setText(resultat);
        }else if(rb7.isChecked()==true){
            if (n1 < n2) {
                String error = "n1 ha de ser major que n2!";
                tv1.setText(error);
            } else {
                int resultado = combinacion(n1, n2);
                String resultat = ("!(" + n1 + ", " + n2 + ") = " + resultado);
                tv1.setText(resultat);
            }
        }
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

        rb1.setChecked(false);
        rb2.setChecked(false);
        rb3.setChecked(false);
        rb4.setChecked(false);
        rb5.setChecked(false);
        rb6.setChecked(false);
        rb7.setChecked(false);

        tv1.setText("");
    }
}
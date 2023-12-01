package com.example.app5_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp1;
    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb1,rb2,rb3,rb11,rb12,rb13;
    String resultat = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);

        tv1 = (TextView)findViewById(R.id.tv1);

        sp1 =(Spinner)findViewById(R.id.sp1);

        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
        rb3=(RadioButton) findViewById(R.id.rb3);
        rb3=(RadioButton) findViewById(R.id.rb11);
        rb3=(RadioButton) findViewById(R.id.rb12);
        rb3=(RadioButton) findViewById(R.id.rb13);

        String [ ] opcions = {"suma","resta","multiplicació","divisió","elevat","mod","combinacions"};

        ArrayAdapter<String> adaptar = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opcions);
        sp1.setAdapter(adaptar);
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

        String seleccio = sp1.getSelectedItem().toString();

        if(seleccio.equals("suma")){
            int suma=n1+n2;
            resultat = String.valueOf(suma);
            tv1.setText(resultat);
        }
        if(seleccio.equals("resta")){
            int resta=n1-n2;
            resultat = String.valueOf(resta);
            tv1.setText(resultat);
        }
        if(seleccio.equals("multiplicació")){
            int multiplicacio=n1*n2;
            resultat = String.valueOf(multiplicacio);
            tv1.setText(resultat);
        }
        if(seleccio.equals("divisió")){
            int divisio=n1/n2;
            resultat = String.valueOf(divisio);
            tv1.setText(resultat);
        }
        if(seleccio.equals("elevat")){
            double elevat=Math.pow(n1,n2);
            resultat = String.valueOf(elevat);
            tv1.setText(resultat);
        }
        if(seleccio.equals("mod")){
            int mod=n1%n2;
            resultat = String.valueOf(mod);
            tv1.setText(resultat);
        }
        if(seleccio.equals("combinacions")){
            if (n1 < n2) {
                String error = "n1 ha de ser major que n2!";
                tv1.setText(error);
            } else {
                int resultado = combinacion(n1, n2);
                resultat = ("!(" + n1 + ", " + n2 + ") = " + resultado);
                tv1.setText(resultat);
            }
        }
        CanviarResultat(resultat);
        //CanviarLletra(resultat);
    }
    public int factorial(int n1) {
        if (n1 == 0) return 1;
        return n1 * factorial(n1 - 1);
    }
    public int combinacion(int n1, int n2) {
        return factorial(n1) / (factorial(n2) * factorial(n1 - n2));
    }
    public void Borrar(View dibuix){
        et1.setText("");
        et2.setText("");
        rb1.setChecked(false);
        rb2.setChecked(false);
        rb3.setChecked(false);

        tv1.setText("");
    }
    public void Sortir(View view) {
        finish();
        System.exit(0);
    }
    public String CanviarResultat(String resultat){
        String resultatCanviat ="";
        if(rb1.isChecked()==true){
            tv1.setTextSize(20);
            resultatCanviat=resultat;
        }else if(rb2.isChecked()==true){
            resultatCanviat=resultat;
            tv1.setTextSize(24);
        }else if(rb3.isChecked()==true){
            resultatCanviat=resultat;
            tv1.setTextSize(34);
        }
        return resultatCanviat;
    }

    public String CanviarLletra(String resultat){
        String resultatCanviat ="";
        if(rb11.isChecked()==true){

        }else if(rb12.isChecked()==true){

        }else if(rb13.isChecked()==true){

        }
        return resultatCanviat;
    }
}
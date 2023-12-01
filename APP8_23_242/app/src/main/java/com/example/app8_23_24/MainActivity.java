package com.example.app8_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacio = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setText("0");
    }
    //Escriu els numeros a la pantalla
    public void Escriure0(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("0");
        }else{
            tv1.setText(tv1.getText()+"0");
        }
    }
    public void Escriure1(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("1");
        }else{
            tv1.setText(tv1.getText()+"1");
        }
    }
    public void Escriure2(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("2");
        }else{
            tv1.setText(tv1.getText()+"2");
        }
    }
    public void Escriure3(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("3");
        }else{
            tv1.setText(tv1.getText()+"3");
        }
    }
    public void Escriure4(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("4");
        }else{
            tv1.setText(tv1.getText()+"4");
        }
    }
    public void Escriure5(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("5");
        }else{
            tv1.setText(tv1.getText()+"5");
        }
    }
    public void Escriure6(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("6");
        }else{
            tv1.setText(tv1.getText()+"6");
        }
    }
    public void Escriure7(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("7");
        }else{
            tv1.setText(tv1.getText()+"7");
        }
    }
    public void Escriure8(View view){
       float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("8");
        }else{
            tv1.setText(tv1.getText()+"8");
        }
    }
    public void Escriure9(View view){
        float valor = Float.parseFloat(tv1.getText().toString());
        if(valor == 0.0f){
            tv1.setText("9");
        }else{
            tv1.setText(tv1.getText()+"9");
        }
    }
    //Neteja els numeros i el text view
    public void NetejarPantalla(View view){
        tv1.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacio = "";
    }

    public void dividir(View view){
        numero1 = Float.parseFloat(tv1.getText().toString());
        operacio ="/";
        tv1.setText("0");
    }
    public void sumar(View view){
        numero1 = Float.parseFloat(tv1.getText().toString());
        operacio ="+";
        tv1.setText("0");
    }
    public void restar(View view){
        numero1 = Float.parseFloat(tv1.getText().toString());
        operacio ="-";
        tv1.setText("0");
    }
    public void multiplicacio(View view){
        numero1 = Float.parseFloat(tv1.getText().toString());
        operacio ="*";
        tv1.setText("0");
    }
    //Metode per calcular, afaga el valor de la operacio i els numeros
    public void mostrarResultat(View view){
        numero2 = Float.parseFloat(tv1.getText().toString());
        if(operacio.equals("/")){
            if(numero2 == 0.0f){
                tv1.setText("0");
                //perque no es pot dividir entre 0
                Toast.makeText(this, "OPERACIO INVALIDA", Toast.LENGTH_LONG).show();
            }else{
                float resultat = numero1 / numero2;
                tv1.setText(resultat + "");
            }
        }else if(operacio.equals("+")){
            float resultat = numero1 + numero2;
            tv1.setText(resultat + "");
        }else if(operacio.equals("-")){
            float resultat = numero1 - numero2;
            tv1.setText(resultat + "");
        }else if(operacio.equals("*")){
            float resultat = numero1 * numero2;
            tv1.setText(resultat + "");
        }
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacio = "";
    }
}
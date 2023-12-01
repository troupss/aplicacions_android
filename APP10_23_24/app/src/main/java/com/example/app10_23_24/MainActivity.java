package com.example.app10_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private TextView tv1;
    private ImageView iv1;
    private int contadorBilletes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        tv1 = findViewById(R.id.tv1);
        iv1 = findViewById(R.id.iv1);
    }

    public void Calcular(View dibuix) {
        double cantidadIntroducida = Double.parseDouble(et1.getText().toString());
        int cantidadEnteros = (int) cantidadIntroducida;

        int[][] resultadoCalculo = calcularBilletes(cantidadEnteros);

        if (contadorBilletes < resultadoCalculo.length) {
            int billete = resultadoCalculo[resultadoCalculo.length - 1 - contadorBilletes][0];
            int cantidad = resultadoCalculo[resultadoCalculo.length - 1 - contadorBilletes][1];

            // Verifica si se utilizó al menos un billete antes de actualizar el texto del botón
            if (cantidad > 0) {
                String resultadoTexto = "Se necesitan " + cantidad + " billetes de " + billete;
                tv1.setText(resultadoTexto);

                // Obtén el ID de la imagen correspondiente al billete desde los recursos
                int idImagen = obtindreIdImatge(billete);
                // Establece la imagen en la ImageView
                iv1.setImageResource(idImagen);
            } else {
                // Si no se utilizó ningún billete, no actualices el texto del botón
                tv1.setText("");
            }

            contadorBilletes++;
        } else {
            contadorBilletes = 0;
        }
    }

    private int[][] calcularBilletes(int cantidad) {
        int[] billetes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[][] resultado = new int[billetes.length][2];

        for (int i = 0; i < billetes.length; i++) {
            for (int billete : billetes) {
                if (cantidad >= billete) {
                    int numBilletes = cantidad / billete;
                    resultado[i][0] = billete;
                    resultado[i][1] = numBilletes;
                    cantidad -= numBilletes * billete;
                }
            }
        }

        return resultado;
    }

    private int obtindreIdImatge(int billete) {

        switch (billete) {
            case 500:
                return R.drawable.a500;
            case 200:
                return R.drawable.a200;
            case 100:
                return  R.drawable.a100;
            case 50:
                return  R.drawable.a50;
            case 20:
                return  R.drawable.a20;
            case 10:
                return  R.drawable.a10;
            case 5:
                return  R.drawable.a5;
            case 2:
                return  R.drawable.a2;
            case 1:
                return  R.drawable.a1;
            default:
                return R.drawable.billetsdefault;
        }
    }
}



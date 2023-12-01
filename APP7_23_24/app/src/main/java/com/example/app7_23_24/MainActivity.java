package com.example.app7_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    String resultat="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);
    }
    public void SegonaActivity(View view){
        Intent i = new Intent(this, SegonaActivity.class);
        resultat = "Segona Activity";
        i.putExtra("Resul",resultat.toString());
        startActivity(i);
    }
    public void TerceraActivity(View view){
        Intent i = new Intent(this, TerceraActivity.class);
        resultat = "Tercera Activity";
        i.putExtra("Resul",resultat.toString());
        startActivity(i);
    }
    public void QuartaActivity(View view){
        Intent i = new Intent(this, QuartaActivity.class);
        resultat = "Quarta Activity";
        i.putExtra("Resul",resultat.toString());
        startActivity(i);
    }
    public void CinquenaActivity(View view){
        Intent i = new Intent(this, CinquenaActivity.class);
        resultat = "Cinquena Activity";
        i.putExtra("Resul",resultat.toString());
        startActivity(i);
    }
    public void Sortir(View view) {
        finishAffinity();
        System.exit(0);
    }
}
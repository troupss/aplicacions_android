package com.example.app11_23_24;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String parametre = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if(id == R.id.group1){
            Toast.makeText(this, "Multiplicació", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(this, QuartaActivity.class);
            parametre = "Multiplicació";
            i.putExtra("Resul",parametre.toString());
            startActivity(i);
        }
        if(id == R.id.group2){
            Toast.makeText(this, "Divisió", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(this, CinquenaActivity.class);
            parametre = "Divisió";
            i.putExtra("Resul",parametre.toString());
            startActivity(i);

        }
        if(id == R.id.numero2){
            Toast.makeText(this, "Suma", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(this, SegonaActivity.class);
            parametre = "Suma";
            i.putExtra("Resul",parametre.toString());
            startActivity(i);
        }
        if(id == R.id.numero3){
            Toast.makeText(this, "Resta", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(this, TerceraActivity.class);
            parametre = "Resta";
            i.putExtra("Resul",parametre.toString());
            startActivity(i);
        }
        return true;
    }


    public void Suma(View view){
        Intent i = new Intent(this, SegonaActivity.class);
        parametre = "Suma";
        i.putExtra("Resul",parametre.toString());
        startActivity(i);
    }
    public void Resta(View view){
        Intent i = new Intent(this, TerceraActivity.class);
        parametre = "Resta";
        i.putExtra("Resul",parametre.toString());
        startActivity(i);
    }
    public void Multiplicació(View view){
        Intent i = new Intent(this, QuartaActivity.class);
        parametre = "Multiplicació";
        i.putExtra("Resul",parametre.toString());
        startActivity(i);
    }
    public void Divisió(View view){
        Intent i = new Intent(this, CinquenaActivity.class);
        parametre = "Divisió";
        i.putExtra("Resul",parametre.toString());
        startActivity(i);
    }
}
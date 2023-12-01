package com.example.app7_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TerceraActivity extends AppCompatActivity {
    private TextView tv111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        tv111 = (TextView)findViewById(R.id.tv111);
        String resultat3 = getIntent().getStringExtra("Resul");
        tv111.setText(resultat3);
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
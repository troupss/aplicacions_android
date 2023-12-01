package com.example.app7_23_24;

import static com.example.app7_23_24.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuartaActivity extends AppCompatActivity {
    private TextView tv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_quarta);

        tv12 = (TextView)findViewById(id.tv12);
        String resultat4 = getIntent().getStringExtra("Resul");
        tv12.setText(resultat4);
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
package com.example.app7_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CinquenaActivity extends AppCompatActivity {
    private TextView tv13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinquena);

        tv13 = (TextView)findViewById(R.id.tv13);
        String resultat5 = getIntent().getStringExtra("Resul");
        tv13.setText(resultat5);
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
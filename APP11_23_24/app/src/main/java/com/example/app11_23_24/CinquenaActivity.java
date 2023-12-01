package com.example.app11_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CinquenaActivity extends AppCompatActivity {
    private TextView tv14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinquena);

        tv14 = (TextView)findViewById(R.id.tv14);

        String parametre3 = getIntent().getStringExtra("Resul");
        tv14.setText(parametre3);
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
package com.example.app11_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TerceraActivity extends AppCompatActivity {
    private TextView tv12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        tv12 = (TextView)findViewById(R.id.tv12);

        String parametre3 = getIntent().getStringExtra("Resul");
        tv12.setText(parametre3);
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }
}
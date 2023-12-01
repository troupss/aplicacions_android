package com.example.app7_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegonaActivity extends AppCompatActivity {
    private TextView tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona);

        tv11 = (TextView)findViewById(R.id.tv11);
        String resultat2 = getIntent().getStringExtra("Resul");
        tv11.setText(resultat2);
    }
    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

}
package com.example.app11_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SegonaActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona);

        tv1 = (TextView)findViewById(R.id.tv1);

        String parametre2 = getIntent().getStringExtra("Resul");
        tv1.setText(parametre2);
    }

    public void Tornar(View view){
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }


}
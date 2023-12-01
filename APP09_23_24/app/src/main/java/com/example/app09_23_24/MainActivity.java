package com.example.app09_23_24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Selecccion(View view) {
        int viewId = view.getId();
        if (view.getId() == R.id.ib1) {
            Toast.makeText(this, "blackberry", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib2) {
            Toast.makeText(this, "grapes", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib3) {
            Toast.makeText(this, "watermelon", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib4) {
            Toast.makeText(this, "pineapple", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib5) {
            Toast.makeText(this, "pear", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib6) {
            Toast.makeText(this, "orange", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib7) {
            Toast.makeText(this, "melon", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib8) {
            Toast.makeText(this, "apple", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib9) {
            Toast.makeText(this, "mango", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib10) {
            Toast.makeText(this, "kiwi", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib11) {
            Toast.makeText(this, "strawberries", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib12) {
            Toast.makeText(this, "raspberries", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib13) {
            Toast.makeText(this, "cherries", Toast.LENGTH_SHORT).show();
        }else if (view.getId() == R.id.ib14) {
            Toast.makeText(this, "banana", Toast.LENGTH_SHORT).show();
        }
    }


}
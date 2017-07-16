package com.example.pc.sitestour.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.pc.sitestour.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void hoteles(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        startActivity(i);
        finish();

    }
    public void restaurantes(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        startActivity(i);
        finish();

    }
    public void museos(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        startActivity(i);
        finish();

    }
    public void iglesias(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        startActivity(i);
        finish();

    }
    public void centroC(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        startActivity(i);
        finish();

    }

    public void lugares(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        startActivity(i);
        finish();

    }
    public void salir(View v){

        finish();

    }
}

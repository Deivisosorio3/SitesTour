package com.example.pc.sitestour.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.pc.sitestour.R;
import com.example.pc.sitestour.controlador.ControladorLugares;
import com.example.pc.sitestour.modelo.Lugares;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Lugares> lugares= new ArrayList<>() ;
        ControladorLugares controladorLugares =new ControladorLugares();
        if (controladorLugares.consultarTipoT("Hoteles").size()==0) {


            //Centros Comerciales:

            lugares.add(new Lugares("Plaza Colonial", "Centros Comerciales", "2.447865", "-76.606308"));
            lugares.add(new Lugares(" El empedrado  ", "Centros Comerciales", "2.443235", "-76.606694"));
            lugares.add(new Lugares("La Estacion  ", "Centros Comerciales", "2.447050", "-76.604892"));
            lugares.add(new Lugares("Calima  ", "Centros Comerciales", "2.447822", "-76.606179"));
            lugares.add(new Lugares("La Casona  ", "Centros Comerciales", "2.441112", "-76.606200"));


            //iglesias
            lugares.add(new Lugares("Parroquia de Aida Lucia ", "Iglesias", "2.459994", "-76.580586"));
            lugares.add(new Lugares("Parroquia Amo Jesús de Puelenje", "Iglesias", "2.435058", "-76.625763"));
            lugares.add(new Lugares("Iglesia Santisima Trinidad ", "Iglesias", "2.459994", "-76.580586"));
            lugares.add(new Lugares("Centro Cristiano Casa del Rey ", "Iglesias", "2.433903", "-76.61724"));

            //Restaurantes:


            lugares.add(new Lugares("Amaranta", "Restaurantes", "2.459933", "-76.594465"));
            lugares.add(new Lugares("Rancho Grande Restaurante", "Restaurantes", "2.463665", "-76.589014"));
            lugares.add(new Lugares("Tragaldabas ", "Restaurantes", "2.461682", "-76.586504"));
            lugares.add(new Lugares("Arepas Doña Torta", "Restaurantes", "2.461296", "-76.586804"));
            lugares.add(new Lugares("Asadero Cali & Cali", "Restaurantes", "2.456987", "-76.590184"));

            //hoteles
            lugares.add(new Lugares("Puerta del Sol", "Hoteles", "2.451019", "-76.609579"));
            lugares.add(new Lugares("Los Andes", "Hoteles", "2.446539", "-76.613399"));
            lugares.add(new Lugares("Valle de Pubensa", "Hoteles", "2.449529", "-76.609536"));
            lugares.add(new Lugares("Dann Monasterio", "Hoteles", "2.443555", "-76.609045"));
            lugares.add(new Lugares("Boutique Confort suite", "Hoteles", "2.446957", "-76.606060"));


            //lugares
            lugares.add(new Lugares("Club campestre de Popayan", "Lugares", "2.463255", "-76.580796"));
            lugares.add(new Lugares("Cine RoyalFilms ", "Lugares", "2.454361", "-76.594583"));
            lugares.add(new Lugares("Estadio Ciro Lopez", "Lugares", "2.454361", " -76.591654"));
            lugares.add(new Lugares("Notivision ", "Lugares", "2.452238", "-76.600679"));
            lugares.add(new Lugares("Policia metropolitana de popayan", "Lugares", "2.454821", "-76.601806"));


            controladorLugares.llenarSitios(lugares);

        }

    }
    public void hoteles(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        String lugar="Hoteles";
        i.putExtra("nombre",lugar);
        startActivity(i);

        finish();

    }
    public void restaurantes(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        String lugar="Restaurantes";
        i.putExtra("nombre",lugar);
        startActivity(i);

        finish();

    }
    public void museos(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);
        String lugar="Museos";
        i.putExtra("nombre",lugar);
        startActivity(i);
        finish();

    }
    public void iglesias(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);

        String lugar="Iglesias";
        i.putExtra("nombre",lugar);
        startActivity(i);
        finish();

    }
    public void centroC(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);

        String lugar="Centros Comerciales";
        i.putExtra("nombre",lugar);
        startActivity(i);
        finish();

    }

    public void lugares(View v){
        Intent i =new Intent(MainActivity.this,Sitios.class);

        String lugar="Lugares";
        i.putExtra("nombre",lugar);
        startActivity(i);
        finish();

    }
    public void salir(View v){

        finish();

    }
}

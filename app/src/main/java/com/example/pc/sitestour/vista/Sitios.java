package com.example.pc.sitestour.vista;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pc.sitestour.R;
import com.example.pc.sitestour.controlador.ControladorLugares;
import com.example.pc.sitestour.modelo.Lugares;

import java.util.ArrayList;
import java.util.List;

public class Sitios extends AppCompatActivity {
    ControladorLugares controladorLugares;
    ListView listView;
    List<Lugares> lugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);
        listView=(ListView)findViewById(R.id.lis_lugares);
        lugares=new ArrayList<>();


        controladorLugares=new ControladorLugares();
        String tipo=getIntent().getStringExtra("nombre");
        if (tipo=="Iglesias"){
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();



        }else if (tipo.equals("Hoteles")){
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();

        }else if (tipo.equals("Restaurantes")){

            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();
           }else if (tipo.equals("Centro Comerciales")) {
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();
        }  else if (tipo.equals("Lugares")){
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();

          }else if (tipo.equals("Museos")){
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();

        }

    }
    public void llenarListas(){

        final String[] lugar= new String[lugares.size()];
        for (int f=0;f<lugares.size();f++){
            lugar[f]=lugares.get(f).getNombre();
        }
        ArrayAdapter<CharSequence> arrayAdapter=new ArrayAdapter<CharSequence>(this,android.R.layout.simple_list_item_1,lugar);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Sitios.this, "Sitios Turisticos", Toast.LENGTH_SHORT).show();
                Intent i= new  Intent(Sitios.this,Mapa.class);
                i.putExtra("nom", lugar[position]);
                startActivity(i);
                finish();

            }
        });



    }



}

package com.example.pc.sitestour.vista;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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



        }else if (tipo=="Hoteles"){
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();

        }else if (tipo=="Restaurantes"){

            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();
           }else if (tipo=="Centro Comerciales") {
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();
        }  else if (tipo=="Lugares"){
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();

          }else if (tipo=="Museos"){
            lugares=controladorLugares.consultarTipoT(tipo);
            llenarListas();

        }

    }
    public void llenarListas(){

        String[] lugar= new String[lugares.size()];
        for (int f=0;f<lugares.size();f++){
            lugar[f]=lugares.get(f).getNombre();
        }
        ArrayAdapter<CharSequence> arrayAdapter=new ArrayAdapter<CharSequence>(this,android.R.layout.simple_list_item_1,lugar);
        listView.setAdapter(arrayAdapter);



    }



}

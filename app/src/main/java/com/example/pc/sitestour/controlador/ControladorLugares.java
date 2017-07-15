package com.example.pc.sitestour.controlador;

import com.example.pc.sitestour.modelo.Lugares;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14/07/2017.
 */

public class ControladorLugares {





    public  void llenarSitios(ArrayList<Lugares> lugares){
        for (int f=0;f<lugares.size();f++){
          Lugares lu=lugares.get(f);
            lu.save();



        }


    }
    public Lugares consultarTipoU(String nombre){
        List<Lugares> lu= Lugares.find(Lugares.class,"nombre = ? ",nombre);



  return lu.get(0);
    }
    public List<Lugares>  consultarTipoT(String tipo){
        List<Lugares> lu= Lugares.find(Lugares.class,"tipo = ?",tipo);





        return lu;
    }
}

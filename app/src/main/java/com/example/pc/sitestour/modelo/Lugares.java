package com.example.pc.sitestour.modelo;

import com.orm.SugarRecord;

/**
 * Created by user on 14/07/2017.
 */

public class Lugares extends SugarRecord<Lugares>{
    private  String nombre,tipo;
    private  String ubicacionLat ,ubicacionLon;


    public Lugares(String nombre, String tipo, String ubicacionLat, String ubicacionLon) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacionLat = ubicacionLat;
        this.ubicacionLon = ubicacionLon;
    }

    public Lugares() {

    }
}

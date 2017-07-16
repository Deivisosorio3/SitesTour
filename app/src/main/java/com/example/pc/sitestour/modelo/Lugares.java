package com.example.pc.sitestour.modelo;

import com.orm.SugarRecord;

/**
 * Created by user on 14/07/2017.
 */

public class Lugares extends SugarRecord<Lugares>{
    private  String nombre,tipo;
    private  String ubicacionLat ,ubicacionLon;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacionLat() {
        return ubicacionLat;
    }

    public void setUbicacionLat(String ubicacionLat) {
        this.ubicacionLat = ubicacionLat;
    }

    public String getUbicacionLon() {
        return ubicacionLon;
    }

    public void setUbicacionLon(String ubicacionLon) {
        this.ubicacionLon = ubicacionLon;
    }

    public Lugares(String nombre, String tipo, String ubicacionLat, String ubicacionLon) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacionLat = ubicacionLat;
        this.ubicacionLon = ubicacionLon;
    }

    public Lugares() {

    }
}

package com.example.pc.sitestour.vista;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.example.pc.sitestour.R;
import com.example.pc.sitestour.controlador.ControladorLugares;
import com.example.pc.sitestour.modelo.Lugares;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ControladorLugares controladorLugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        controladorLugares=new ControladorLugares();

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        String lugar=getIntent().getStringExtra("nom");
        String tipo=getIntent().getStringExtra("nomb");
        if (tipo == null){

            Lugares lugares= controladorLugares.consultarTipoU(lugar);
            LatLng coordenadas=new LatLng(Double.parseDouble(lugares.getUbicacionLat()),Double.parseDouble(lugares.getUbicacionLon()));
            mMap.addMarker(new MarkerOptions().position(coordenadas));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordenadas,16f));
        }else {  //el usuario dio click en ver todos
            List<Lugares> lis =controladorLugares.consultarTipoT(tipo);
            for (int f=0;f<lis.size();f++){
                Lugares tLugar=lis.get(f);
                LatLng coordenadas2=new LatLng(Double.parseDouble(tLugar.getUbicacionLat()),Double.parseDouble(tLugar.getUbicacionLon()));
                mMap.addMarker(new MarkerOptions().position(coordenadas2));

            }
            Lugares tLugar=lis.get(0);
            LatLng coordenadas2=new LatLng(Double.parseDouble(tLugar.getUbicacionLat()),Double.parseDouble(tLugar.getUbicacionLon()));
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(coordenadas2,16f));

        }
    }
}

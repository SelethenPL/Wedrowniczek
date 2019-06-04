package com.example.wedrowniczek;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity
        implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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

        LatLng you = new LatLng(52.407635, 16.933707);

        mMap.addMarker(new MarkerOptions()
                .position(you)
                .title("TUTAJ JESTES!"));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(52.407427, 16.934769))
                .title("Muzeum Archeologiczne"));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(52.409209, 16.931229))
                .title("Zamek Królewski"));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(52.406595, 16.935145))
                .title("Pomnik Koziołków"));

        mMap.addMarker(new MarkerOptions()
                .position(new LatLng(52.408564, 16.929921))
                .title("Muzeum Narodowe"));

        // TODO Zrób, żeby się wyświetlały wszystkie nazwy bez klikania.
        // TODO Zrób, żeby na kliknięcie popupa było przejście do następnej sceny.

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(you, 16.0f));
    }



    public void ViewActivity1 (View view){
        Intent intent = new Intent(this, View_Activity.class);
        startActivity(intent);
        this.finish();
    }
    public void ViewActivity2 (View view){
        Intent intent = new Intent(this, View_Activity.class);
        startActivity(intent);
        this.finish();
    }
}
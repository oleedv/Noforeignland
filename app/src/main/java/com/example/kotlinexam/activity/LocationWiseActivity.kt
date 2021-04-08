package com.example.kotlinexam.activity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.kotlinexam.R
import com.example.kotlinexam.model.PlaceModel
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class LocationWiseActivity : FragmentActivity(), OnMapReadyCallback {
    private lateinit var latlong: LatLng
    private var mMap: GoogleMap? = null
    private lateinit var placeModel: PlaceModel
    private var nameString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_wise)

        placeModel = intent.getSerializableExtra("Place") as PlaceModel

        if (placeModel != null) {
            latlong = LatLng(placeModel.getLat()!!, placeModel.getLon()!!)
            nameString = placeModel.getName()!!
        }
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)


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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        // Add a marker in Sydney and move the camera
        mMap!!.addMarker(MarkerOptions().position(latlong).title(nameString))
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(latlong))
    }
}
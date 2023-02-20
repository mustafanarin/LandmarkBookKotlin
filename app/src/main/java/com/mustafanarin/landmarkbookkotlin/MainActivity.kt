package com.mustafanarin.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mustafanarin.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.mustafanarin.landmarkbookkotlin.databinding.ActivityMainBinding

var chosenLandmark :  Landmark? = null

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val pyramid = Landmark("Pyramid","Egypt",R.drawable.piramid)
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffel)
        val tower_bridge = Landmark("Tower Bridge","London",R.drawable.london_bridge)
        val collesium = Landmark("Colloseum","Italy",R.drawable.collesium)

        landmarkList.add(pyramid)
        landmarkList.add(eiffel)
        landmarkList.add(tower_bridge)
        landmarkList.add(collesium)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdaptor = LandmarkAdaptor(landmarkList)
        binding.recyclerView.adapter = landmarkAdaptor

    }
}
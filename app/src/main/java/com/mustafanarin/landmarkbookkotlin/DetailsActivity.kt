package com.mustafanarin.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mustafanarin.landmarkbookkotlin.databinding.ActivityDetailsBinding


class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        //val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        var selectedLandmark = chosenLandmark

        selectedLandmark?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView2.setImageResource(it.image)
        }



    }
}
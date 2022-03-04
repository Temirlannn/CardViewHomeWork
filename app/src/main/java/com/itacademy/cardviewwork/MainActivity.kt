package com.itacademy.cardviewwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.itacademy.cardviewwork.databinding.ActivityMainBinding
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {

    var image: ArrayList<Int> = ArrayList()
    var CarouselView: CarouselView? = null

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        image.add(R.drawable.images)
        image.add(R.drawable.cat)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNavigation()

        CarouselView = findViewById(R.id.carouselView)
        CarouselView!!
            .pageCount = image
            .size
             CarouselView!!
            .setImageListener(imageListener)
    }
    var imageListener =
        ImageListener {
                position,
                imageView
            -> imageView.setImageResource(image[position]
        ) }

    fun setupBottomNavigation() {
        val navController = findNavController(R.id.container)
        val BottomNavigationView = findViewById<BottomNavigationView>(R.id.Bottom_Navigation)
        binding.BottomNavigation.setupWithNavController(navController)

    }
}
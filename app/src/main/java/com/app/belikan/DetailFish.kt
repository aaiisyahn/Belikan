package com.app.belikan

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.belikan.databinding.ActivityDetailFishBinding


class DetailFish : AppCompatActivity() {
    private lateinit var binding: ActivityDetailFishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailFishBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set padding untuk menyesuaikan dengan system bars (status bar dan navigation bar)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        // Handle klik pada imageView10 untuk kembali ke halaman sebelumnya
        val backDetail = findViewById<ImageButton>(R.id.button_back_detail)
        backDetail.setOnClickListener {
            onBackPressed()
        }

        // Get the fish object from the intent
        val fish: List<Fish>? = null

// Set the fish name and description in the layout
//        binding.productNameDetail.text = fish?.firstOrNull()?.name
//        binding.priceDetail.text = fish?.firstOrNull()?.price
        binding.cartDetail.setOnClickListener{
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }

// Set the fish image in the layout
        fish?.firstOrNull()?.imageResource?.let { binding.imageFishDetail.setImageResource(it) }
    }
}
package com.app.belikan

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailStoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_store)

        // Menerima intent dari MainActivity
        val storeName = intent.getStringExtra("STORE_NAME")

        // Menampilkan nama toko yang sesuai
        val storeNameTextView = findViewById<TextView>(R.id.textView1)
        storeNameTextView.text = storeName

        // TODO: Menggunakan storeName untuk mendapatkan data toko yang sesuai dari sumber data Anda
        val store = Store.dataList.find { it.storeName == storeName }

        // Menampilkan informasi toko lainnya
        store?.let {
            val locationTextView = findViewById<TextView>(R.id.textView2)
            locationTextView.text = it.location

            val logoImageView = findViewById<ImageView>(R.id.imageView1)
            logoImageView.setImageResource(it.imageLogo)

            val distanceTextView = findViewById<TextView>(R.id.textView3)
            distanceTextView.text = it.distance

            val ratingTextView = findViewById<TextView>(R.id.textView9)
            ratingTextView.text = it.rating.toString()

            val descriptionTextView = findViewById<TextView>(R.id.textView5)
            descriptionTextView.text = it.description

            val headerImageView = findViewById<ImageView>(R.id.imageViewTop)
            headerImageView.setImageResource(it.imageHeader)

        }


        // Inisialisasi data dummy untuk RecyclerView
        val favoriteFishList = listOf(
            Fish("Kerapu Kerang", "Rp50.000", "4.5", R.drawable.kerapu, true),
            Fish("Kakap Merah", "Rp65.000", "4.6", R.drawable.kakap, true),
            Fish("Bandeng Juwana", "Rp40.000", "4.7", R.drawable.bandeng, true),
            Fish("Tuna Cakalang", "Rp53.500", "4.5", R.drawable.tuna, true),
            Fish("Salmon Chum", "Rp85.000", "4.8", R.drawable.salmon, true),
            Fish("Tongkol Jagung", "Rp45.000", "4.5", R.drawable.tongkoljagung, true)
        )

        // Inisialisasi RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val adapter = FavoriteFishAdapter(favoriteFishList)

        // Atur GridLayoutManager dengan 2 kolom
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager

        // Set adapter untuk RecyclerView
        recyclerView.adapter = adapter

        // Set padding untuk menyesuaikan dengan system bars (status bar dan navigation bar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Handle klik pada imageView10 untuk kembali ke halaman sebelumnya
        val imageView10 = findViewById<ImageView>(R.id.imageView10)
        imageView10.setOnClickListener {
            onBackPressed()
        }
    }
}

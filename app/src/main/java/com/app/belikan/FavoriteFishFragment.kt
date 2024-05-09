package com.app.belikan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FavoriteFishFragment : Fragment() {

    private lateinit var favoriteFishList: MutableList<Fish>
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FavoriteFishAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_favorite_fish, container, false)

        // Initialize dummy data for RecyclerView
        favoriteFishList = mutableListOf(
            Fish("Kerapu Kerang", "Rp50.000", "4.5", R.drawable.kerapu, true),
            Fish("Kakap Merah", "Rp65.000", "4.6", R.drawable.kakap, true),
            Fish("Bandeng Juwana", "Rp40.000", "4.7", R.drawable.bandeng, true),
            Fish("Tuna Cakalang", "Rp53.500", "4.5", R.drawable.tuna, true),
            Fish("Salmon Chum", "Rp85.000", "4.8", R.drawable.salmon, true),
            Fish("Tongkol Jagung", "Rp45.000", "4.5", R.drawable.tongkoljagung, true),
            Fish("Kakap Merah", "Rp65.000", "4.6", R.drawable.kakap, true),
            Fish("Bandeng Juwana", "Rp40.000", "4.7", R.drawable.bandeng, true),
            Fish("Tuna Cakalang", "Rp53.500", "4.5", R.drawable.tuna, true),
            Fish("Salmon Chum", "Rp85.000", "4.8", R.drawable.salmon, true),
            Fish("Tongkol Jagung", "Rp45.000", "4.5", R.drawable.tongkoljagung, true)
        )

        // Initialize RecyclerView
        recyclerView = rootView.findViewById(R.id.recyclerView)
        adapter = FavoriteFishAdapter(favoriteFishList)

        // Set GridLayoutManager with 2 columns
        val layoutManager = GridLayoutManager(context, 2)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = adapter

        // Add listener to handle item clicks
        adapter.setOnItemClickListener(object : FavoriteFishAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                // Get the Fish object at the clicked position
                val fish = favoriteFishList[position]

                // Toggle the favorite status
                fish.isFavorite = !fish.isFavorite

                // Update the item view in the RecyclerView
                adapter.notifyItemChanged(position)
            }
        })

        return rootView
    }
}

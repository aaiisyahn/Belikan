package com.app.belikan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FavoriteStoreFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_favorite_store, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)

        // Mengatur GridLayoutManager dengan spanCount 2 (2 kolom)
        val layoutManager = GridLayoutManager(requireContext(), 2)
        recyclerView.layoutManager = layoutManager

        // Buat instance dari adapter
        val adapter = FavoriteStoreAdapter(requireContext(), Store.dataList)
        recyclerView.adapter = adapter

        return view
    }

}

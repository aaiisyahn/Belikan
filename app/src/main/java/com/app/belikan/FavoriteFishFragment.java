package com.app.belikan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavoriteFishFragment extends Fragment {

    private List<Fish> favoriteFishList;
    private RecyclerView recyclerView;
    private FavoriteFishAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_favorite_fish, container, false);

        // Inisialisasi data dummy untuk RecyclerView
        favoriteFishList = new ArrayList<>();
        favoriteFishList.add(new Fish("Kerapu Kerang", "Rp50.000", "4.5", R.drawable.kerapu, true));
        favoriteFishList.add(new Fish("Kakap Merah", "Rp65.000", "4.6", R.drawable.kakap, true));
        favoriteFishList.add(new Fish("Bandeng Juwana", "Rp40.000", "4.7", R.drawable.bandeng, true));
        favoriteFishList.add(new Fish("Tuna Cakalang", "Rp53.500", "4.5", R.drawable.tuna, true));
        favoriteFishList.add(new Fish("Salmon Chum", "Rp85.000", "4.8", R.drawable.salmon, true));
        favoriteFishList.add(new Fish("Tongkol Jagung", "Rp45.000", "4.5", R.drawable.tongkoljagung, true));
        favoriteFishList.add(new Fish("Kakap Merah", "Rp65.000", "4.6", R.drawable.kakap, true));
        favoriteFishList.add(new Fish("Bandeng Juwana", "Rp40.000", "4.7", R.drawable.bandeng, true));
        favoriteFishList.add(new Fish("Tuna Cakalang", "Rp53.500", "4.5", R.drawable.tuna, true));
        favoriteFishList.add(new Fish("Salmon Chum", "Rp85.000", "4.8", R.drawable.salmon, true));
        favoriteFishList.add(new Fish("Tongkol Jagung", "Rp45.000", "4.5", R.drawable.tongkoljagung, true));
        // Tambahkan data lainnya sesuai kebutuhan Anda

        // Inisialisasi RecyclerView
        recyclerView = rootView.findViewById(R.id.recyclerView);
        adapter = new FavoriteFishAdapter(favoriteFishList);

        // Atur GridLayoutManager dengan 2 kolom
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        // Tambahkan listener untuk menangani klik item
        adapter.setOnItemClickListener(new FavoriteFishAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Mengambil objek Fish dari posisi yang diklik
                Fish fish = favoriteFishList.get(position);

                // Mengubah status favorit menjadi kebalikannya
                fish.setFavorite(!fish.isFavorite());

                // Memperbarui tampilan item di RecyclerView
                adapter.notifyItemChanged(position);
            }
        });


        return rootView;
    }
}

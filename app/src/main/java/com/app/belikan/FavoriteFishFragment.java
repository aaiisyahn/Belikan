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
        favoriteFishList.add(new Fish("Fish 1", "Price 1", "Rating 1", R.drawable.tuna, false));
        favoriteFishList.add(new Fish("Fish 2", "Price 2", "Rating 2", R.drawable.tongkol, false));
        // Tambahkan data lainnya sesuai kebutuhan Anda

        // Inisialisasi RecyclerView
        recyclerView = rootView.findViewById(R.id.recyclerView);
        adapter = new FavoriteFishAdapter(favoriteFishList);

        // Atur GridLayoutManager dengan 2 kolom
        GridLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}

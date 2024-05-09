package com.app.belikan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FavoriteFishAdapter extends RecyclerView.Adapter<FavoriteFishAdapter.FavoriteFishViewHolder> {

    private List<Fish> favoriteFishList;
    private OnItemClickListener listener; // Menambahkan listener

    public FavoriteFishAdapter(List<Fish> favoriteFishList) {
        this.favoriteFishList = favoriteFishList;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public FavoriteFishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_fish_favorite, parent, false);
        return new FavoriteFishViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteFishViewHolder holder, int position) {
        Fish fish = favoriteFishList.get(position);
        holder.bind(fish);

        // Menangani klik item di sini
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int adapterPosition = holder.getAdapterPosition();
                if (adapterPosition != RecyclerView.NO_POSITION) {
                    // Mengambil objek Fish dari posisi yang diklik
                    Fish clickedFish = favoriteFishList.get(adapterPosition);

                    // Mengubah status favorit menjadi kebalikannya
                    clickedFish.setFavorite(!clickedFish.isFavorite());

                    // Memperbarui tampilan item di RecyclerView
                    notifyItemChanged(adapterPosition);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return favoriteFishList.size();
    }

    public static class FavoriteFishViewHolder extends RecyclerView.ViewHolder {

        private TextView tvFishName;
        private TextView tvPrice;
        private TextView tvRating;
        private ImageView imageViewFish;
        private ImageView imageViewLove;

        public FavoriteFishViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFishName = itemView.findViewById(R.id.tvFishName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvRating = itemView.findViewById(R.id.tvRating);
            imageViewFish = itemView.findViewById(R.id.imageViewFish);
            imageViewLove = itemView.findViewById(R.id.imageViewLove);
        }

        public void bind(Fish fish) {
            tvFishName.setText(fish.getName());
            tvPrice.setText(fish.getPrice());
            tvRating.setText(fish.getRating());
            imageViewFish.setImageResource(fish.getImageResource());
            imageViewLove.setImageResource(fish.isFavorite() ? R.drawable.ic_redlove : R.drawable.ic_outlinedlove);
        }
    }


    // Antarmuka listener untuk menangani klik item
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}

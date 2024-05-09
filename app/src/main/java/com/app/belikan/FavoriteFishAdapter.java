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

    public FavoriteFishAdapter(List<Fish> favoriteFishList) {
        this.favoriteFishList = favoriteFishList;
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
}


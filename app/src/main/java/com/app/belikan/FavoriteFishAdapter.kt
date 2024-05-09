package com.app.belikan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FavoriteFishAdapter(private val favoriteFishList: List<Fish>) :
    RecyclerView.Adapter<FavoriteFishAdapter.FavoriteFishViewHolder>() {

    private var listener: OnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteFishViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_fish_favorite, parent, false)
        return FavoriteFishViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoriteFishViewHolder, position: Int) {
        val fish = favoriteFishList[position]
        holder.bind(fish)

        holder.itemView.setOnClickListener {
            val adapterPosition = holder.adapterPosition
            if (adapterPosition != RecyclerView.NO_POSITION) {
                val clickedFish = favoriteFishList[adapterPosition]
                clickedFish.isFavorite = !clickedFish.isFavorite
                notifyItemChanged(adapterPosition)
            }
        }
    }

    override fun getItemCount(): Int {
        return favoriteFishList.size
    }

    inner class FavoriteFishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvFishName: TextView = itemView.findViewById(R.id.tvFishName)
        private val tvPrice: TextView = itemView.findViewById(R.id.tvPrice)
        private val tvRating: TextView = itemView.findViewById(R.id.tvRating)
        private val imageViewFish: ImageView = itemView.findViewById(R.id.imageViewFish)
        private val imageViewLove: ImageView = itemView.findViewById(R.id.imageViewLove)

        fun bind(fish: Fish) {
            tvFishName.text = fish.name
            tvPrice.text = fish.price
            tvRating.text = fish.rating
            imageViewFish.setImageResource(fish.imageResource)
            imageViewLove.setImageResource(if (fish.isFavorite) R.drawable.ic_redlove else R.drawable.ic_outlinedlove)
        }
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
}

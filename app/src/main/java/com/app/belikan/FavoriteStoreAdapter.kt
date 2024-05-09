package com.app.belikan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FavoriteStoreAdapter(private val context: Context, private val storeList: List<Store>) :
    RecyclerView.Adapter<FavoriteStoreAdapter.FavoriteStoreViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteStoreViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_store_favorite, parent, false)
        return FavoriteStoreViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavoriteStoreViewHolder, position: Int) {
        val store = storeList[position]
        holder.bind(store)
    }

    override fun getItemCount(): Int {
        return storeList.size
    }

    inner class FavoriteStoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(store: Store) {
            // Mengatur data ke dalam tampilan item
            itemView.findViewById<ImageView>(R.id.imageViewStoreLogo).setImageResource(store.imageLogo)
            itemView.findViewById<TextView>(R.id.tvStore).text = store.storeName
            itemView.findViewById<TextView>(R.id.tvLocationStore).text = store.location
            // Menambahkan logika lainnya untuk mengatur data lainnya dari kelas Store
        }
    }
}

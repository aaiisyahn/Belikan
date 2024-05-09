package com.app.belikan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class StoreAdapter(private val dataList: List<Store>) : RecyclerView.Adapter<StoreAdapter.StoreViewHolder>() {

    class StoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageViewStore)
        private val textView1: TextView = itemView.findViewById(R.id.tvStoreName)
        private val textView2: TextView = itemView.findViewById(R.id.tvLocation)
        private val textView3: TextView = itemView.findViewById(R.id.tvRating)

        fun bind(store: Store) {
            imageView.setImageResource(store.imageLogo)
            textView1.text = store.storeName
            textView2.text = store.location
            textView3.text = "${store.rating}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_store, parent, false)
        return StoreViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount() = dataList.size
}

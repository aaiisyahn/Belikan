package com.app.belikan



data class Store(val imageLogo: Int, val storeName: String, val location: String, val rating: Float, val distance: String, val description :String, val imageHeader: Int) {
    companion object {
        val dataList = arrayListOf(
            Store(R.drawable.toko1, "Toko Ikan Laku", "Tanjung Priuk, Jakarta Utara", 4.7f, "2.84 km","Toko ini",R.drawable.toko1),
            Store(R.drawable.toko2, "Rumah Ikan", "Cilincing, Jakarta Utara", 4.8f, "3.72 km","Toko ini",R.drawable.toko1),
            Store(R.drawable.toko3, "Toko Ikan Segar", "Tanjung Priuk, Jakarta Utara", 4.7f, "2.84 km","Toko ini",R.drawable.toko1),
        )
    }
}

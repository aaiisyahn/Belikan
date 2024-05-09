package com.app.belikan



data class Store(val imageLogo: Int, val storeName: String, val location: String, val rating: Float, val distance: String, val description :String, val imageHeader: Int) {
    companion object {
        val dataList = arrayListOf(
            Store(R.drawable.toko1, "Toko Ikan Laku", "Tanjung Priuk, Jakarta Utara", 4.7f, "2.84 km", "Menyediakan berbagai jenis ikan segar terbaik di kota, Toko Ikan Laku adalah pilihan utama bagi pecinta makanan laut. Nikmati pengalaman belanja yang lengkap dengan kualitas terbaik!",R.drawable.header_storesatu),
            Store(R.drawable.toko2, "Rumah Ikan", "Cilincing, Jakarta Utara", 4.8f, "3.72 km", "Rumah Ikan menawarkan pilihan ikan segar terlengkap di sekitar. Dengan komitmen untuk menyediakan produk berkualitas tinggi, tempat ini cocok bagi pencinta makanan laut yang mengutamakan kualitas.",R.drawable.header_storelima),
            Store(R.drawable.toko3, "Toko Ikan Segar", "Tanjung Priuk, Jakarta Utara", 4.6f, "3.84 km","Dengan kepemilikan langsung dari nelayan, Toko Ikan Segar menawarkan pengalaman belanja yang unik dan autentik. Nikmati kualitas terbaik setiap hari!",R.drawable.header_storetiga),
            Store(R.drawable.toko6, "Lipang Fish", "Penjaringan, Jakarta Utara", 4.6f, "4.15 km","Lipang Fish menjamin kesegaran ikan setiap hari dengan pasokan langsung dari sumbernya, memberikan kepuasan bagi pelanggan yang mengutamakan kualitas.",R.drawable.header_storeempat))
    }
}

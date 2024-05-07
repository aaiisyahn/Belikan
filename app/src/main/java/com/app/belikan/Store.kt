package com.app.belikan



data class Store(val imageResId: Int, val text1: String, val text2: String) {
    companion object {
        val dataList = arrayListOf(
            Store(R.drawable.toko1, "Toko Ikan Laku", "Tanjung Priuk, Jakarta Utara"),
            Store(R.drawable.toko1, "Text 1-1", "Text 1-2"),
            Store(R.drawable.toko1, "Text 1-1", "Text 1-2"),

            Store(R.drawable.toko1, "Text 1-1", "Text 1-2"),

            Store(R.drawable.toko1, "Text 1-1", "Text 1-2"),

            Store(R.drawable.toko1, "Text 1-1", "Text 1-2")
        )
    }
}

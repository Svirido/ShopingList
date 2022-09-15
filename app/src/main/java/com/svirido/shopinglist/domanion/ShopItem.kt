package com.svirido.shopinglist.domanion

data class ShopItem(
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = UNDEFINED_IT
) {
    companion object{
        const val UNDEFINED_IT = - 1
    }
}

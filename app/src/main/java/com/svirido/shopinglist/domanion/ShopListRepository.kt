package com.svirido.shopinglist.domanion

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShop(shopItem: ShopItem)

    fun deleteShop(shopItem: ShopItem)

    fun editShop(shopItem: ShopItem)

    fun enabledShop(shopItemID: Int): ShopItem

    fun getAllShopList(): LiveData<List<ShopItem>>

}
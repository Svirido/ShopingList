package com.svirido.shopinglist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.svirido.shopinglist.domanion.ShopItem
import com.svirido.shopinglist.domanion.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private var shopList = mutableListOf<ShopItem>()

    private var shopListLiveData = MutableLiveData<List<ShopItem>>()

    private var autoIncrementId = 0

    init {
        for (i in 1..10){
            val shopItem = ShopItem("Name: $i", i, true)
            addShop(shopItem)
        }
    }

    override fun addShop(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_IT){
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
        updateList()
    }

    override fun deleteShop(shopItem: ShopItem) {
        shopList.remove(shopItem)
        updateList()
    }

    override fun editShop(shopItem: ShopItem) {
        val oldElement = enabledShop(shopItem.id)
        shopList.remove(oldElement)
        addShop(shopItem)
    }

    override fun enabledShop(shopItemID: Int): ShopItem {
        return shopList.find { it.id == shopItemID }
            ?: throw RuntimeException("Element with id $shopItemID not found")
    }

    override fun getAllShopList(): LiveData<List<ShopItem>> {
        return shopListLiveData
    }

    private fun updateList(){
        shopListLiveData.value = shopList.toList()
    }

}
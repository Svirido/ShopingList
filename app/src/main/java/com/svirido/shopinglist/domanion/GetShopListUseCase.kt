package com.svirido.shopinglist.domanion

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getAllShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getAllShopList()
    }
}
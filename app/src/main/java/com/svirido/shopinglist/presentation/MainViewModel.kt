package com.svirido.shopinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.svirido.shopinglist.data.ShopListRepositoryImpl
import com.svirido.shopinglist.domanion.*

class MainViewModel : ViewModel() {

    private var repository = ShopListRepositoryImpl

    private var getShopListUseCase = GetShopListUseCase(repository)
    private var deleteShopUseCase = DeleteShopUseCase(repository)
    private var editledShop = EditShopUseCase(repository)

    val shopList = getShopListUseCase.getAllShopList()

    fun deleteShop(shopItem: ShopItem) {
        deleteShopUseCase.deleteShop(shopItem)
    }

    fun enableShop(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editledShop.editShop(newItem)
    }

}
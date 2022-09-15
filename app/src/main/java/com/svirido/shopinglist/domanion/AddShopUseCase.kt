package com.svirido.shopinglist.domanion

class AddShopUseCase(private val shopListRepository: ShopListRepository) {

    fun addShop(shopItem: ShopItem) {
        shopListRepository.addShop(shopItem)
    }
}
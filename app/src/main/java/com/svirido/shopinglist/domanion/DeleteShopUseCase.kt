package com.svirido.shopinglist.domanion

class DeleteShopUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShop(shopItem: ShopItem) {
        shopListRepository.deleteShop(shopItem)
    }

}
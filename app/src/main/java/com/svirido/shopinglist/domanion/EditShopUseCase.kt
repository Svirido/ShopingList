package com.svirido.shopinglist.domanion

class EditShopUseCase(private val shopListRepository: ShopListRepository) {

    fun editShop(shopItem: ShopItem) {
        shopListRepository.editShop(shopItem)
    }


}
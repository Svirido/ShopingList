package com.svirido.shopinglist.domanion

class EnabledShopUseCase(private val shopListRepository: ShopListRepository) {

    fun enabledShop(shopItemID: Int): ShopItem {
        return shopListRepository.enabledShop(shopItemID)
    }
}
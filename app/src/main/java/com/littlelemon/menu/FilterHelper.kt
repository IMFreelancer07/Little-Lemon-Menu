package com.littlelemon.menu

//TODO create a FilterHelperTest and write a unit test for filterProducts
class FilterHelper {

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> filterByCategory("Dessert", productsList)
            FilterType.Drinks -> filterByCategory("Drinks", productsList)
            FilterType.Food -> filterByCategory("Food", productsList)
        }
    }

    private fun filterByCategory(category: String, productsList: List<ProductItem>): List<ProductItem> {
        return productsList.filter { it.category == category }
    }

}
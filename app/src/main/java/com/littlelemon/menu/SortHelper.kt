package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()

//          TODO("create extension function for List<Product> with sorting based on price ascending")
            SortType.PriceAsc -> productsList.sortByPriceAsc()

//          TODO("create extension function for List<Product> with sorting based on price descending")
            SortType.PriceDesc -> productsList.sortByPriceDesc()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

    private fun List<ProductItem>.sortByPriceAsc(): List<ProductItem> {
        return sortedBy { it.price }
    }

    private fun List<ProductItem>.sortByPriceDesc(): List<ProductItem> {
        return sortedByDescending { it.price }
    }

}
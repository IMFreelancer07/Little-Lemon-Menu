package com.littlelemon.menu

import org.junit.Assert.assertEquals
import org.junit.Test

class FilterHelperTest {
    @Test
    fun filterProducts_filterTypeDessert_croissantReturned() {
        val sampleProductsList = mutableListOf(
            ProductItem("Black tea", 3.00, "Drinks", R.drawable.black_tea),
            ProductItem("Croissant", 7.00, "Dessert", R.drawable.croissant),
            ProductItem("Bouillabaisse", 20.00, "Food", R.drawable.bouillabaisse)
        )

        val filteredList = FilterHelper().filterProducts(FilterType.Dessert, sampleProductsList)

        assertEquals(1, filteredList.size)
        assertEquals("Croissant", filteredList[0].title)
    }
}

package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$25", "hat2"),
        Product("Devslopes Hat White", "$20", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$25", "hat2"),
        Product("Devslopes Hat White", "$20", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$27", "hoodie1"),
        Product("Devslopes Hoodie Red", "$25", "hoodie2"),
        Product("Devslopes Hoodie Light Gray", "$24", "hoodie3"),
        Product("Devslopes Hoodie Black", "$25", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$27", "hoodie1"),
        Product("Devslopes Hoodie Red", "$25", "hoodie2"),
        Product("Devslopes Hoodie Light Gray", "$24", "hoodie3"),
        Product("Devslopes Hoodie Black", "$25", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$20", "shirt1"),
        Product("Devslopes Badge Light Gray", "$24", "shirt2"),
        Product("Devslopes Shirt Red", "$18", "shirt3"),
        Product("Devslopes Hussle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
        Product("Devslopes Shirt Black", "$20", "shirt1"),
        Product("Devslopes Badge Light Gray", "$24", "shirt2"),
        Product("Devslopes Shirt Red", "$18", "shirt3"),
        Product("Devslopes Hussle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGoods
        }
    }
}
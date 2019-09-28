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
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$25", "hat02"),
        Product("Devslopes Hat White", "$20", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$27", "hoodie01"),
        Product("Devslopes Hoodie Red", "$25", "hoodie02"),
        Product("Devslopes Hoodie Light Gray", "$24", "hoodie03"),
        Product("Devslopes Hoodie Black", "$25", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$20", "shirt01"),
        Product("Devslopes Badge Light Gray", "$24", "shirt02"),
        Product("Devslopes Shirt Red", "$18", "shirt03"),
        Product("Devslopes Hussle", "$22", "shirt04"),
        Product("Kickflip Studios", "$18", "shirt05")
    )
}
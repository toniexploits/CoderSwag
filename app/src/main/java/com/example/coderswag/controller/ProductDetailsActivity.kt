package com.example.coderswag.controller

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat
import com.example.coderswag.R
import com.example.coderswag.model.Product
import com.example.coderswag.utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_details.*
import kotlinx.android.synthetic.main.product_list_item.*
import kotlinx.android.synthetic.main.product_list_item.productName
import kotlinx.android.synthetic.main.product_list_item.productPrice

class ProductDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        productName.text = product.name
        productPrice.text = product.price
//        val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
//        productImage.setImageResource(resourceId)
        productDescription.text = "Simple description"
//        productImageView.setImageDrawable(ResourcesCompat.getDrawable(product.image, "drawable", packageName))


    }
}

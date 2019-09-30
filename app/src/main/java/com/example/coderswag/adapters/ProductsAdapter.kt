package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.model.Product

class ProductsAdapter(val context: Context, val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.ProductsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsHolder {
        val view =  LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductsHolder(view)
    }

    override fun getItemCount() = products.count()

    override fun onBindViewHolder(holder: ProductsHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductsHolder(v: View) : RecyclerView.ViewHolder(v){
        val productImage = v.findViewById<ImageView>(R.id.productImage)
        val productName = v.findViewById<TextView>(R.id.productName)
        val productPrice = v.findViewById<TextView>(R.id.productPrice)


        fun bindProduct(product: Product, context: Context){
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productName.text = product.name
            productPrice.text = product.price
            productImage.setImageResource(resourceId)
        }
    }
}
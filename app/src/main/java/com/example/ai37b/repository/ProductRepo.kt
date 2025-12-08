package com.example.ai37b.repository

import com.example.ai37b.model.ProductModel

interface ProductRepo {
    fun addProduct(
        productId: String, model: ProductModel,
        callback: (Boolean, String) -> Unit
    )

    fun editProduct(productId: String,model: ProductModel,callback: (Boolean, String) -> Unit)

    fun deleteProduct(productId: String,model: ProductModel,callback: (Boolean, String) -> Unit)

    fun getProduct(productId: String,callback: (Boolean, String, ProductModel?) -> Unit)

    fun getAllProduct(productId: String,callback: (Boolean, String, List<ProductModel>) -> Unit)
}
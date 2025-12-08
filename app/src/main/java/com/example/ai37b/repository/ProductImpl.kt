package com.example.ai37b.repository

import com.example.ai37b.model.ProductModel

class ProductImpl: ProductRepo {
    override fun addProduct(
        productId: String,
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun editProduct(
        productId: String,
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun deleteProduct(
        productId: String,
        model: ProductModel,
        callback: (Boolean, String) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun getProduct(
        productId: String,
        callback: (Boolean, String, ProductModel?) -> Unit
    ) {
        TODO("Not yet implemented")
    }

    override fun getAllProduct(
        productId: String,
        callback: (Boolean, String, List<ProductModel>) -> Unit
    ) {
        TODO("Not yet implemented")
    }
}
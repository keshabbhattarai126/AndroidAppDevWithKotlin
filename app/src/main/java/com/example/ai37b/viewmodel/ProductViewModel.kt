package com.example.ai37b.viewmodel

import androidx.lifecycle.ViewModel
import com.example.ai37b.model.ProductModel
import com.example.ai37b.repository.ProductRepo

class ProductViewModel(val repo: ProductRepo) : ViewModel() {
    fun addProduct(
        productId: String, model: ProductModel,
        callback: (Boolean, String) -> Unit
    ){
        repo.addProduct(productId,model,callback)
    }

    fun editProduct(productId: String,model: ProductModel,callback: (Boolean, String) -> Unit){
        repo.editProduct(productId,model,callback)
    }

    fun deleteProduct(productId: String,model: ProductModel,callback: (Boolean, String) -> Unit){
        repo.deleteProduct(productId,model,callback)
    }

    fun getProduct(productId: String,callback: (Boolean, String, ProductModel?) -> Unit){
        repo.getProduct(productId,callback)
    }

    fun getAllProduct(productId: String,callback: (Boolean, String, List<ProductModel>) -> Unit){
        repo.getAllProduct(productId,callback)

    }

}
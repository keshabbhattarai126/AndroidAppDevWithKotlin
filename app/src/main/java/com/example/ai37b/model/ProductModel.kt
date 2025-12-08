package com.example.ai37b.model

data class ProductModel(
    val productId: String = "",
    val productName: String = "",
    val productPrice: String = "",
    val productQuantity: String = "",
    val productImage: String = "",
    val productDescription: String = ""

) {
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "productId" to productId,
            "productName" to productName,
            "productPrice" to productPrice,
            "productQuantity" to productQuantity,
            "productImage" to productImage,
            "productDescription" to productDescription,
        )
    }
}
package com.example.ai37b

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.ai37b.model.ProductModel
import com.example.ai37b.ui.theme.Blue
import com.example.ai37b.ui.theme.PurpleGrey80
//import com.example.ai37b.viewmodel.ProductViewModel

class ProductScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductScreenBody()
        }
    }
}

@Composable
fun ProductScreenBody() {
    var productId by remember { mutableStateOf("") }
    var productName by remember { mutableStateOf("") }
    var productPrice by remember { mutableStateOf("") }
    var productQuantity by remember { mutableStateOf("") }
    var productDescription by remember { mutableStateOf("") }

//    val productViewModel = remember { ProductViewModel(ProductImpl()) }

    val context = LocalContext.current
    val activity = context as Activity

    Scaffold { padding ->
        Column(modifier = Modifier.fillMaxSize().padding(padding)) {
            Text("Product Screen", modifier = Modifier.padding(16.dp))

            OutlinedTextField(
                value = productId,
                onValueChange = { productId = it },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                placeholder = { Text("Enter Product ID") },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = PurpleGrey80,
                    unfocusedContainerColor = PurpleGrey80,
                    focusedIndicatorColor = Blue,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = productName,
                onValueChange = { productName = it },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                placeholder = { Text("Enter Product Name") },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = PurpleGrey80,
                    unfocusedContainerColor = PurpleGrey80,
                    focusedIndicatorColor = Blue,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = productPrice,
                onValueChange = { productPrice = it },
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                placeholder = { Text("Enter Product Price") },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = PurpleGrey80,
                    unfocusedContainerColor = PurpleGrey80,
                    focusedIndicatorColor = Blue,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = productQuantity,
                onValueChange = { productQuantity = it },
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                placeholder = { Text("Enter Product Quantity") },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = PurpleGrey80,
                    unfocusedContainerColor = PurpleGrey80,
                    focusedIndicatorColor = Blue,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = productDescription,
                onValueChange = { productDescription = it },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp),
                placeholder = { Text("Enter Product Description") },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = PurpleGrey80,
                    unfocusedContainerColor = PurpleGrey80,
                    focusedIndicatorColor = Blue,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
//                    if (productId.isEmpty()) {
//                        Toast.makeText(context, "Enter Product ID", Toast.LENGTH_SHORT).show()
//                    }
//                    val product = ProductModel(
//                        productName = productName,
//                        productPrice = productPrice,
//                        productQuantity = productQuantity,
//                        productImage = "",
//                        productDescription = productDescription
//                    )
//                    productViewModel.addProduct(productId, product) { success, message ->
//                        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
//                    }
                },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp).height(60.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Add Product")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
//                    if (productId.isEmpty()) {
//                        Toast.makeText(context, "Enter Product ID to edit", Toast.LENGTH_SHORT).show()
//                    }
//                    val updatedProduct = ProductModel(
//                        productName = productName,
//                        productPrice = productPrice,
//                        productQuantity = productQuantity,
//                        productImage = "",
//                        productDescription = productDescription
//                    )
//                    productViewModel.editProduct(productId, updatedProduct) { success, message ->
//                        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
//                    }
                },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp).height(60.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Edit Product")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {

                },
                modifier = Modifier.fillMaxWidth().padding(horizontal = 15.dp).height(60.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text("Delete Product")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductScreenPreview() {
    ProductScreenBody()
}

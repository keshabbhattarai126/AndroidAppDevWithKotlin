package com.example.ai37b

import android.app.Activity
import android.widget.Button
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.ai37b.repository.ProductRepoImpl
import com.example.ai37b.viewmodel.ProductViewModel

@Composable
fun HomeScreen() {

    val productViewModel = remember { ProductViewModel(ProductRepoImpl()) }

    LaunchedEffect(Unit) {
        productViewModel.getAllProduct()
    }

    val products = productViewModel.allProducts.observeAsState(initial = emptyList())
    val context = LocalContext.current
    val Activity = context as Activity
    var showDialog by remember { mutableStateOf(false) }



    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(products.value!!.size) { index ->
            val data = products.value!![index]

            Card(
                shape = RoundedCornerShape(12.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {


                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = data.name)
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = data.price.toString())
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(text = data.description)
                    }


                    Row {
                        IconButton(onClick = {
                            showDialog = true
                        }) {
                            Icon(Icons.Default.Edit, contentDescription = "Edit")
                        }

                        IconButton(onClick = {
                            val id = data.productId
                            productViewModel.deleteProduct(id) { success, message ->
                                Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                            }
                        }) {
                            Icon(Icons.Default.Delete, contentDescription = "Delete")
                        }
                    }
                }
            }


            if (showDialog) {
                AlertDialog(
                    onDismissRequest = {
                        showDialog = false
                    },
                    title = {
                        Text("Edit Product")
                    },
                    text = {
                        Column {
                            Text("Product Name: ${data.name}")
                        }
                    },
                    confirmButton = {
                        Button(onClick = {
                            showDialog = false
                        }) {
                            Text("OK")
                        }
                    },
                    dismissButton = {
                        Button(onClick = {
                            showDialog = false
                        }) {
                            Text("Cancel")
                        }
                    }
                )
            }
        }
    }
}




//    val images = listOf(
//        R.drawable.gamingmouse1,
//        R.drawable.gamingmouse2,
//        R.drawable.laptop1,
//        R.drawable.laptop2,
//        R.drawable.headphone1,
//        R.drawable.headphone2,
//        R.drawable.microphone1,
//        R.drawable.smartwatch1,
//        R.drawable.smartwatch2
//    )
//    val names = listOf(
//        "Razer Mouse",
//        "Logitech Mouse",
//        "Windows Laptop 1",
//        "Windows Laptop 2",
//        "Headphone 1",
//        "Headphone 2",
//        "Microphone 1",
//        "Smartwatch 1",
//        "Smartwatch 2"
//    )
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//    ) {
//        item {
//            Text("Hello", fontSize = 40.sp, fontWeight = FontWeight.Black)
//            Text("Good Afternoon", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
//
//            Spacer(modifier = Modifier.padding(vertical = 10.dp))
//
//            LazyRow {
//                items(images.size) { index ->
//                    Column {
//                        Image(
//                            painter = painterResource(images[index]),
//                            contentDescription = null,
//                            modifier = Modifier.size(70.dp).padding(end = 10.dp)
//                        )
//                        Text(names[index])
//                    }
//                }
//            }
//            Spacer(modifier = Modifier.padding(vertical = 10.dp))
//            Image(
//                painter = painterResource(R.drawable.sales),
//                contentDescription = null,
//                modifier = Modifier.fillMaxWidth(),
//                contentScale = ContentScale.Crop
//            )
//
//            Spacer(modifier = Modifier.padding(vertical = 10.dp))
//
//        }
//        item {
//            Text("Trending products")
//            LazyVerticalGrid(
//                columns = GridCells.Fixed(3),
//                modifier = Modifier.height(500.dp)
//            ) {
//                items(images.size){index->
//                    Image(
//                        painter = painterResource(images[index]),
//                        contentDescription = null,
//                        modifier = Modifier.size(70.dp).padding(end = 10.dp)
//                    )
//                }
//
//            }
//        }
//
//
//
//
//    }

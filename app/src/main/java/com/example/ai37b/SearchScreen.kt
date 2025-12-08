package com.example.ai37b

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun SearchScreen() {
    val images = listOf(
        R.drawable.gamingmouse1,
        R.drawable.gamingmouse2,
        R.drawable.laptop1,
        R.drawable.laptop2,
        R.drawable.headphone1,
        R.drawable.headphone2,
        R.drawable.microphone1,
        R.drawable.smartwatch1,
        R.drawable.smartwatch2
    )
    val names = listOf(
        "Razer Mouse",
        "Logitech Mouse",
        "Windows Laptop 1",
        "Windows Laptop 2",
        "Headphone 1",
        "Headphone 2",
        "Microphone 1",
        "Smartwatch 1",
        "Smartwatch 2"
    )
    val price = listOf(
        "Rs. 50,00",
        "Rs. 20,000",
        "Rs. 1,00,000",
        "Rs. 90,000",
        "Rs. 10,000",
        "Rs. 5,000",
        "Rs. 6,000",
        "Rs. 5,0000",
        "Rs. 8,000"
    )
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        item{
            Text("Showing 60 results", fontWeight = FontWeight.Bold)
        }

        item {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.height(500.dp)
            ) {
                items(images.size){index->
                    Card(modifier = Modifier.padding(end = 10.dp)) {
                        Image(
                            painter = painterResource(images[index]),
                            contentDescription = null,
                            modifier = Modifier.size(70.dp)
                        )
                        Text(names[index])
                        Text(price[index])
                    }

                }

            }
        }


    }




}
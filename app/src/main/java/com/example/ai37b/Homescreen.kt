package com.example.ai37b

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
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
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        item {
            Text("Hello", fontSize = 40.sp, fontWeight = FontWeight.Black)
            Text("Good Afternoon", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)

            Spacer(modifier = Modifier.padding(vertical = 10.dp))

            LazyRow {
                items(images.size) { index ->
                    Column {
                        Image(
                            painter = painterResource(images[index]),
                            contentDescription = null,
                            modifier = Modifier.size(70.dp).padding(end = 10.dp)
                        )
                        Text(names[index])
                    }
                }
            }
            Spacer(modifier = Modifier.padding(vertical = 10.dp))
            Image(
                painter = painterResource(R.drawable.sales),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.padding(vertical = 10.dp))

        }
        item {
            Text("Trending products")
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.height(500.dp)
            ) {
                items(images.size){index->
                    Image(
                        painter = painterResource(images[index]),
                        contentDescription = null,
                        modifier = Modifier.size(70.dp).padding(end = 10.dp)
                    )
                }

            }
        }




    }
}
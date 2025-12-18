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

import android.app.DatePickerDialog
import android.icu.util.Calendar

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.unit.dp
import com.example.ai37b.model.ProductModel
import com.example.ai37b.repository.ProductRepoImpl
import com.example.ai37b.ui.theme.Blue
import com.example.ai37b.ui.theme.PurpleGrey80
import com.example.ai37b.viewmodel.ProductViewModel



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
    Scaffold() { padding ->

        val productViewModel = remember { ProductViewModel(ProductRepoImpl()) }


        var isLoading by remember { mutableStateOf(false) }
        var name by remember { mutableStateOf("") }
        var price by remember { mutableStateOf("") }
        var description by remember { mutableStateOf("") }





        val context = LocalContext.current
        val activity = context as Activity



        LazyColumn(
            modifier = Modifier.padding(padding)
                .fillMaxSize()
        ) {

            item {

                OutlinedTextField(
                    value = name,
                    onValueChange = { data ->
                        name = data
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp),
                    shape = RoundedCornerShape(15.dp),
                    placeholder = {
                        Text("enter name")
                    },

                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = PurpleGrey80,
                        unfocusedContainerColor = PurpleGrey80,
                        focusedIndicatorColor = Color.Blue,
                        unfocusedIndicatorColor = Color.Transparent
                    )

                )



                Spacer(modifier = Modifier.height(20.dp))



                OutlinedTextField(
                    value = price,
                    onValueChange = { data ->
                        price = data
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp),
                    shape = RoundedCornerShape(15.dp),
                    placeholder = {
                        Text("enter price")
                    },

                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = PurpleGrey80,
                        unfocusedContainerColor = PurpleGrey80,
                        focusedIndicatorColor = Color.Blue,
                        unfocusedIndicatorColor = Color.Transparent
                    )

                )

                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = description,
                    onValueChange = { data ->
                        description = data
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp),
                    shape = RoundedCornerShape(15.dp),
                    placeholder = {
                        Text("enter description")
                    },

                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = PurpleGrey80,
                        unfocusedContainerColor = PurpleGrey80,
                        focusedIndicatorColor = Color.Blue,
                        unfocusedIndicatorColor = Color.Transparent
                    )

                )


                Button(onClick = {

                    var model = ProductModel(
                        "",
                         name=name,
                        price = price.toDouble(),
                        description = description
                    )
                    productViewModel.addProduct("", model) { success, message ->
                        if (success) {
                            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                            activity.finish()
                        } else {
                            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                        }
                    }

                },
                    enabled = !isLoading,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp)
                        .height(60.dp),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 15.dp
                    ),
                    shape = RoundedCornerShape(10.dp)) {
                    Text("Add Product")
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductScreenPreview() {
    ProductScreenBody()
}

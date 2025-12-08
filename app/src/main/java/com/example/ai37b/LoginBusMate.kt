package com.example.ai37b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ai37b.ui.theme.AI37BTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Visibility
//import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class LoginBusMate : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusMateLoginUI()
        }
    }
}
val BusMateBlue = Color(0xFF2196F3) // A primary blue color from the image
val BusMateDarkBlue = Color(0xFF1976D2) // A dark blue for the background grid area
val PlaceholderBackgroundColor = Color(0xFF81D4FA) // A light blue-green for the outside area
val PlaceholderGridColor = Color(0x11FFFFFF)
@Composable
fun BusMateLoginUI() {
    // State variables for the fields and password visibility
    var userId by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var rememberMeChecked by remember { mutableStateOf(false) }

    // Main background and screen structure
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PlaceholderBackgroundColor) // Outside background color
    ) {
        // Top Section (Bus Mate Header, Log In prompt)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(BusMateDarkBlue) // Top dark blue background
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            // Bus Icon and Title
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(bottom = 8.dp)
            ) {

                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(Color(0xFFFF9800), RoundedCornerShape(8.dp)),
                    contentAlignment = Alignment.Center
                ) {
//                    Text("🚌", fontSize = 24.sp) // Mock Bus Icon
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Bus Mate",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Log in to your\nAccount",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Enter your ID and password to log in",
                color = Color.White.copy(alpha = 0.8f),
                fontSize = 14.sp,
                modifier = Modifier.padding(bottom = 40.dp)
            )
        }

        // Bottom Section (Form Card)
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.5f),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            color = Color.White,
            shadowElevation = 8.dp // Add shadow to mimic the card lift
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
                    .padding(top = 40.dp, bottom = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                // ID Field
                CustomOutlinedTextField(
                    value = userId,
                    onValueChange = { userId = it },
                    placeholder = "Enter ID here"
                )
                Spacer(modifier = Modifier.height(20.dp))

                // Password Field
                CustomOutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    placeholder = "*******",
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
//                    trailingIcon = {
//                        val image = if (passwordVisible)
//                            Icons.Filled.Visibility
//                        else Icons.Filled.VisibilityOff
//
//                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
//                            Icon(imageVector = image, contentDescription = "Toggle password visibility")
//                        }
//                    }
                )
                Spacer(modifier = Modifier.height(16.dp))

                // Remember Me and Forgot Password
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = rememberMeChecked,
                            onCheckedChange = { rememberMeChecked = it },
                            colors = CheckboxDefaults.colors(checkedColor = BusMateBlue)
                        )
                        Text(text = "Remember me", fontSize = 14.sp)
                    }
                    Text(
                        text = "Forgot Password?",
                        color = BusMateBlue,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.clickable { /* Handle Forgot Password click */ }
                    )
                }
                Spacer(modifier = Modifier.height(32.dp))

                // Log In Button
                Button(
                    onClick = { /* Handle Log In click */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = BusMateBlue),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
                ) {
                    Text(text = "Log In", fontSize = 18.sp)
                }
                Spacer(modifier = Modifier.weight(1f)) // Push 'Sign Up' to the bottom

                // Don't have an account? Sign Up
                Text(
                    text = buildAnnotatedString {
                        append("Don't have an account? ")
                        with(SpanStyle(color = BusMateBlue, fontWeight = FontWeight.SemiBold)) {
                            append("Sign Up")
                        }
                    },
                    modifier = Modifier.clickable { /* Handle Sign Up click */ }
                )
            }
        }
    }
}

@Composable
fun CustomOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    trailingIcon: @Composable (() -> Unit)? = null
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(10.dp), // Less rounded corners than default, matching the image
        placeholder = { Text(placeholder, color = Color.Gray.copy(alpha = 0.7f)) },
        singleLine = true,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.LightGray.copy(alpha = 0.2f),
            unfocusedContainerColor = Color.LightGray.copy(alpha = 0.1f),
            focusedIndicatorColor = Color.Transparent, // No line when focused
            unfocusedIndicatorColor = Color.Transparent,
            cursorColor = BusMateDarkBlue,
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Black
        ),
        visualTransformation = visualTransformation,
        trailingIcon = trailingIcon
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewBusMateLoginUI(){
    BusMateLoginUI()
}
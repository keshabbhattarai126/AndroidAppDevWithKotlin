package com.example.ai37b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ai37b.R.drawable.baseline_keyboard_arrow_down_24
import com.example.ai37b.ui.theme.AI37BTheme
import com.example.ai37b.ui.theme.BlackCust
import com.example.ai37b.ui.theme.White

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

        }
    }
}

@Composable
fun ProfileBody(){
    Scaffold() {padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = padding)
        ) {
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_back_ios_24),
                    contentDescription = null
                )
                Text("keshab126",style= TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = BlackCust
                ))
                Icon(
                    painter = painterResource(R.drawable.baseline_more_horiz_24),
                    contentDescription = null
                )


            }

            Row(modifier =Modifier.fillMaxWidth()
                .padding(start = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ){
                Image(
                    painter = painterResource(R.drawable.avatar),
                    contentDescription = null,
                    modifier = Modifier
                        .size(90.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Column {
                    Text("97K")
                    Text("Posts")
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("1M")
                    Text("Followers")
                }
                Column {
                    Text("997.8K")
                    Text("Followings")
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Text("Bio")
                Text("Follow m")
                Text("Follow mw")
            }
            OutlinedButton(onClick = {},
                shape = RoundedCornerShape(10.dp,),
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 5.dp)) {
                Text("Email")
            }
           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.SpaceBetween

           ) {
               Button (
                   onClick = {

                   },
                   modifier = Modifier.padding(start = 5.dp),
                   shape = RoundedCornerShape(8.dp),
//                border = BorderStroke(2.dp, Color.Magenta),
                   colors = ButtonDefaults.buttonColors(
                       contentColor = Color.White,
                       containerColor = Color.Blue
                   )
               ) {
                   Text("Follow")

               }

               Button (
                   onClick = {

                   },
                   modifier = Modifier.padding(start = 5.dp),
                   shape = RoundedCornerShape(8.dp),
                border = BorderStroke(0.5.dp, Color.Black),
                   colors = ButtonDefaults.buttonColors(
                       contentColor = Color.Black,
                       containerColor = Color.White
                   )
               ) {
                   Text("Message")

               }
               Button (
                   onClick = {

                   },
                   modifier = Modifier.padding(start = 5.dp),
                   shape = RoundedCornerShape(8.dp),
                border = BorderStroke(0.5.dp, Color.Black),
                   colors = ButtonDefaults.buttonColors(
                       contentColor = Color.Black,
                       containerColor = Color.White
                   )
               ) {
                   Text("Email")

               }

               Button (
                   onClick = {

                   },
                   modifier = Modifier.padding(start = 5.dp),
                   shape = RoundedCornerShape(8.dp),
                   border = BorderStroke(0.5.dp, Color.Black),
                   colors = ButtonDefaults.buttonColors(
                       contentColor = Color.Black,
                       containerColor = Color.White
                   )
               ) {
                   Icon(
                       painter = painterResource(R.drawable.baseline_keyboard_arrow_down_24),
                       contentDescription = null
                   )

               }

           }
            Spacer(modifier = Modifier.height(20.dp
            ))

            Row(Modifier.fillMaxWidth()
                .padding(start=10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painter = painterResource(R.drawable.avatar),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = painterResource(R.drawable.avatar),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = painterResource(R.drawable.avatar),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = painterResource(R.drawable.avatar),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = painterResource(R.drawable.avatar),
                    contentDescription = null,
                    modifier = Modifier
                        .size(60.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
            }






        }
        }

    }

@Preview
@Composable
fun PreviewProfile(){
    ProfileBody()
}
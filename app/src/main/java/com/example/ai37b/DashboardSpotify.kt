package com.example.ai37b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ai37b.ui.theme.BlackDark
import com.example.ai37b.ui.theme.White

class DashboardActivitySpotify : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpotifyBody()

        }
    }
}


@Composable
fun SpotifyBody(){Scaffold() { padding ->
    Column(modifier = Modifier.fillMaxSize().padding(padding).background(BlackDark)) {
        Row (modifier= Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment= Alignment.CenterVertically){
            Text("Recently Played",style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = White

            ), modifier = Modifier.weight(2f))

            Row(
                modifier = Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_notifications_none_24),

                    contentDescription = null,
                    tint = White,
                    modifier = Modifier.size(28.dp).padding(horizontal =4.dp)
                )
                Icon(
                    painter = painterResource(R.drawable.baseline_history_24),
                    contentDescription = null,
                    tint = White,
                    modifier = Modifier.size(28.dp).padding(horizontal =4.dp)
                )
                Icon(
                    painter = painterResource(R.drawable.baseline_settings_24),
                    contentDescription = null,
                    tint = White,
                    modifier = Modifier.size(28.dp)
                )
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.SpaceEvenly
            ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.arijit),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text("Arijit Singh",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = White

                ))
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.shreya),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .clip(shape = CircleShape),
                    contentScale = ContentScale.Crop
                )
                Text("Shreya Ghosal",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = White

                ))
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(
                painter = painterResource(R.drawable.arijit),
                contentDescription = null,
                modifier = Modifier.size(90.dp)
            )
            Column() {
                Text("#SPOTIFYWRAPPED",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = White

                ))
                Text("Your 2021 in review",style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = White

                ))

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Column() {
                Image(
                    painter = painterResource(R.drawable.arijit),
                    contentDescription = null,
                    modifier = Modifier.size(145.dp)
                )
                Text("Your Top Songs 2021",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = White

                ))

            }
            Column() {
                Image(
                    painter = painterResource(R.drawable.arijit),
                    contentDescription = null,
                    modifier = Modifier.size(145.dp)
                )
                Text("Your Artists Revealed",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = White

                ))

            }
            Spacer(modifier = Modifier.height(20.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
       Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical =20.dp)) {
           Text("Editor's picks",style = TextStyle(
               fontSize = 25.sp,
               fontWeight = FontWeight.Bold,
               color = White

           ))

       }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Column() {
                Image(
                    painter = painterResource(R.drawable.arijit),
                    contentDescription = null,
                    modifier = Modifier.size(145.dp)
                )
                Text("Your Top Songs 2021",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = White

                ))
                Text("Your Top Songs 2021",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = White

                ))

            }
            Column() {
                Image(
                    painter = painterResource(R.drawable.arijit),
                    contentDescription = null,
                    modifier = Modifier.size(145.dp)
                )
                Text("Your Artists Revealed",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = White

                ))
                Text("Your Artists Revealed",style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = White

                ))

            }
            Spacer(modifier = Modifier.height(20.dp))
        }


    }
}

}

@Preview
@Composable
fun SpotifyPreview(){
    SpotifyBody()

}
package com.base.loginscreen_composeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen(){

     Surface (modifier= Modifier.fillMaxSize()){
          Column(modifier=Modifier.fillMaxSize()){
               TopSection()
          }

     }
}


@Composable
fun TopSection(){
     val uicolor=if(isSystemInDarkTheme()) Color.White else Color.Black

     Box(contentAlignment = Alignment.TopCenter){
          Image(
               painter= painterResource(R.drawable.shape),
               contentDescription = null,
               contentScale = ContentScale.FillBounds,
               modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight(fraction = 0.46f)
          )

          Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(50.dp)){
               Icon(
                    painter = painterResource(R.drawable.logo),
                    tint = uicolor,
                    contentDescription = null,
                    modifier = Modifier.size(42.dp)
               )
               Spacer(modifier=Modifier.width(25.dp))
               Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
               ) {

                    Text(
                         text = "HouseTlo",
                         fontSize = 25.sp,
                         fontWeight = FontWeight.Bold,
                         color=uicolor
                    )

                    Text(
                         text ="Find a House for you",
                         fontSize = 20.sp,
                         fontWeight = FontWeight.SemiBold,
                         color = uicolor
                    )
               }
          }

          Text(
               text="Login",
               modifier=Modifier.align(Alignment.BottomCenter),
               fontWeight = FontWeight.Bold,
               fontSize = 25.sp,
               color=uicolor
          )
     }
}
package com.base.loginscreen_composeui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeloginscreeninit.ui.theme.Black
import com.example.composeloginscreeninit.ui.theme.BlueGray
import com.example.composeloginscreeninit.ui.theme.focusedTextFieldText
import com.example.composeloginscreeninit.ui.theme.unfocusedTextFieldText


@Composable
fun LoginScreen(){

     Surface (modifier= Modifier.fillMaxSize()){
          Column(modifier=Modifier.fillMaxSize()){
               TopSection()
               Spacer(modifier = Modifier.height(36.dp))
               Column(modifier = Modifier.fillMaxSize().padding(horizontal = 30.dp)){
                LoginTextFields(modifier = Modifier.fillMaxWidth(),"Email")
                 Spacer(modifier=Modifier.height(25.dp))
                 LoginTextFields(modifier = Modifier.fillMaxWidth(),"Password")
                    Spacer(modifier=Modifier.height(30.dp))
                    LoginButton()
               }
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

@SuppressLint("SuspiciousIndentation")
@Composable
fun LoginTextFields(
     modifier: Modifier=Modifier,
     label:String

){
   val uicolor:Color=if(isSystemInDarkTheme()) Color.White else Color.Black

      TextField(
           modifier=modifier,
           value="",
           onValueChange = {},
           label={
                Text(text=label, fontWeight = FontWeight.Bold,color=uicolor)
           },
           colors=TextFieldDefaults.colors(
                unfocusedPlaceholderColor = MaterialTheme.colorScheme.unfocusedTextFieldText,
                focusedPlaceholderColor = MaterialTheme.colorScheme.focusedTextFieldText,
           )
      )
}


@Composable
fun LoginButton(){

     Button(
          modifier=Modifier.fillMaxWidth()
               .height(40.dp),
          onClick = {},
          colors = ButtonDefaults.buttonColors(
               containerColor = if(isSystemInDarkTheme()) BlueGray else Black,
               contentColor = Color.White
          ),
          shape= RoundedCornerShape(4.dp)
     ){
          Text(
               text="Log In",
               fontStyle = FontStyle.Italic,
               fontSize = 18.sp,
               fontWeight = FontWeight.Bold
          )
     }
}
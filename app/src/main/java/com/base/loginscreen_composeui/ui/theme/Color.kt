package com.example.composeloginscreeninit.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Black = Color(0xFF000113)
val LightBlueWhite = Color(0xFFF1F5F9) //Social media background
val BlueGray = Color(0xFF334155)



val ColorScheme.focusedTextFieldText
@Composable
get()= if(isSystemInDarkTheme()) Color.White else Color.Black

val ColorScheme.unfocusedTextFieldText
@Composable
get() = if(isSystemInDarkTheme()) Color(0XFF94A388) else Color(0XFF475569)

val ColorScheme.testFieldContainer
@Composable
get() = if(isSystemInDarkTheme()) BlueGray.copy(alpha=0.6f) else LightBlueWhite
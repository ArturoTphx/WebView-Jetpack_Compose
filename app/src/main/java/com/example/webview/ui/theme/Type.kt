package com.example.webview.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.webview.R

val FiraSans = FontFamily(
    Font(R.font.fira_sans_black, FontWeight.Black),
    Font(R.font.fira_sans_bold, FontWeight.Bold),
    Font(R.font.fira_sans_light, FontWeight.Light),
    Font(R.font.fira_sans_medium, FontWeight.Medium),
    Font(R.font.fira_sans_regular, FontWeight.Normal)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Light,
        fontSize = 28.sp
    ),
    h2 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Light,
        fontSize = 26.sp
    ),
    h3 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp
    ),
    h4 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp
    ),
    h5 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp
    ),
    h6 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp
    ),
    body1 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Medium,
        fontSize = 15.sp
    ),
    button = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = FiraSans,
        fontWeight = FontWeight.Normal,
        fontSize = 1.sp
    )

)
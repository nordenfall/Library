package com.example.library.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.library.navigation.NavRoute
import com.example.library.ui.theme.AppBackground
import com.example.library.ui.theme.HeadlineText
import com.example.library.ui.theme.LibraryTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {padding->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(AppBackground),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(SpanStyle(color = HeadlineText)){
                        append("Book")
                    }
                    withStyle(SpanStyle(color = Color.Black)){
                        append("er")
                    }
                },
                fontWeight = FontWeight.Medium,
                fontSize = 48.sp,
            )
            Button(
                onClick = {
                    navController.navigate(route = NavRoute.Main.route)
                },
                modifier = Modifier
                    .width(170.dp)
                    .height(35.dp),
                elevation = ButtonDefaults.buttonElevation(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = HeadlineText
                )

            ) {
                Text(
                    buildAnnotatedString {

                        append("Войти с ")

                        withStyle(SpanStyle(color = Color(0xff4488ff))){
                            append('G')
                        }
                        withStyle(SpanStyle(color = Color(0xffee4433))){
                            append('o')
                        }
                        withStyle(SpanStyle(color = Color(0xffffbb00))){
                            append('o')
                        }
                        withStyle(SpanStyle(color = Color(0xff4488ff))){
                            append('g')
                        }
                        withStyle(SpanStyle(color = Color(0xff33aa55))){
                            append('l')
                        }
                        withStyle(SpanStyle(color = Color(0xffee4433))){
                            append('e')
                        }
                    }
                )
            }
        }
    }
}


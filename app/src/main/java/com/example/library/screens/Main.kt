package com.example.library.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.library.navigation.LibraryNavHost
import com.example.library.navigation.NavRoute
import com.example.library.ui.theme.AppBackground
import com.example.library.ui.theme.HeadlineText

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Главная",
                         fontWeight = FontWeight.Medium,
                         fontSize = 32.sp)
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    titleContentColor = HeadlineText,
                    containerColor = AppBackground,
                ),
            )
        },
        content = {padding->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp, vertical = 8.dp)
                    .background(AppBackground),
                horizontalAlignment = Alignment.Start
            ){
                Text(
                    text = "Основное",
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }
        }
    )
}
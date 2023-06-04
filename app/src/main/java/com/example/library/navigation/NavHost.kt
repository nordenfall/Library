package com.example.library.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun LibraryNavHost(){
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination =  NavRoute.Start.route){
        composable(NavRoute.Start.route){}
    }
}
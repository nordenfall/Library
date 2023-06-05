package com.example.library.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.library.screens.Main
import com.example.library.screens.MyBooks
import com.example.library.screens.Notes
import com.example.library.screens.Options
import com.example.library.screens.Profile
import com.example.library.screens.Start
import com.example.library.screens.Tags

@Composable
fun LibraryNavHost(){
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination =  NavRoute.Start.route){
        composable(NavRoute.Start.route){ Start(navController = navController) }
        composable(NavRoute.Main.route){ Main(navController = navController) }
        composable(NavRoute.MyBooks.route){ MyBooks(navController = navController) }
        composable(NavRoute.Notes.route){ Notes(navController = navController) }
        composable(NavRoute.Options.route){ Options(navController = navController) }
        composable(NavRoute.Profile.route){ Profile(navController = navController) }
        composable(NavRoute.Tags.route){ Tags(navController = navController) }
    }
}
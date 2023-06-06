package com.example.library.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.library.screens.MainScreen
import com.example.library.screens.MyBooksScreen
import com.example.library.screens.NotesScreen
import com.example.library.screens.OptionsScreen
import com.example.library.screens.ProfileScreen
import com.example.library.screens.StartScreen
import com.example.library.screens.TagsScreen

@Composable
fun LibraryNavHost(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination =  NavRoute.Start.route){
        composable(NavRoute.Start.route){ StartScreen(navController = navController) }
        composable(NavRoute.Main.route){ MainScreen(navController = navController) }
        composable(NavRoute.MyBooks.route){ MyBooksScreen(navController = navController) }
        composable(NavRoute.Notes.route){ NotesScreen(navController = navController) }
        composable(NavRoute.Options.route){ OptionsScreen(navController = navController) }
        composable(NavRoute.Profile.route){ ProfileScreen(navController = navController) }
        composable(NavRoute.Tags.route){ TagsScreen(navController = navController) }
    }
}
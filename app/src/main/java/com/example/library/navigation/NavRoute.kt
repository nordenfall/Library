package com.example.library.navigation

sealed class NavRoute(val route: String){
    object Start:NavRoute("startScreen")
    object Main:NavRoute("mainScreen")
    object Profile:NavRoute("profileScreen")
    object Options:NavRoute("optionScreen")
    object MyBooks:NavRoute("myBooksScreen")
    object Notes:NavRoute("notesScreen")
    object Tags:NavRoute("tagsScreen")
}

package com.example.weddingself.navigation

sealed class Screen(val route: String) {
    object LoginScreen : Screen("login")
    object NikoFirstScreen : Screen("niko_first")
    object NikoSecondScreen : Screen("niko_second")
    object NikoThirdScreen : Screen("niko_third")
    object CharlieFirstScreen : Screen("charlie_first")
    object CharlieSecondScreen : Screen("charlie_second")
    object CharlieThirdScreen : Screen("charlie_third")
    object FinalScreen : Screen("final")
}

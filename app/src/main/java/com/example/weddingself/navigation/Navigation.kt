package com.example.weddingself.navigation

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weddingself.presentation.FinalScreen
import com.example.weddingself.presentation.LoginScreen
import com.example.weddingself.presentation.NikoFirstScreen
import com.example.weddingself.presentation.NikoSecondScreen
import com.example.weddingself.presentation.NikoThirdScreen

@Composable
fun Navigation(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }

        composable(route = Screen.NikoFirstScreen.route) {
            NikoFirstScreen(navController = navController)
        }

        composable(route = Screen.NikoSecondScreen.route) {
            NikoSecondScreen(navController = navController)
        }

        composable(route = Screen.NikoThirdScreen.route) {
            NikoThirdScreen(navController = navController)
        }

        composable(route = Screen.FinalScreen.route) {
            FinalScreen(navController = navController)
        }
    }
}

////Function that disables autorotation
//@Composable
//fun LockScreenOrientation(orientation: Int) {
//    val context = LocalContext.current
//    DisposableEffect(Unit) {
//        val activity = context.findActivity() ?: return@DisposableEffect onDispose {}
//        val originalOrientation = activity.requestedOrientation
//        activity.requestedOrientation = orientation
//        onDispose {
//            // restore original orientation when view disappears
//            activity.requestedOrientation = originalOrientation
//        }
//    }
//}

//fun Context.findActivity(): Activity? = when (this) {
//    is Activity -> this
//    is ContextWrapper -> baseContext.findActivity()
//    else -> null
//}

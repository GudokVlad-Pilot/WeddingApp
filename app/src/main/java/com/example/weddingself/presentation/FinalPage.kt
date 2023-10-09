package com.example.weddingself.presentation

import android.widget.Toast
import android.widget.VideoView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.weddingself.navigation.Screen
import com.example.weddingself.ui.theme.WeddingSelfTheme

@Composable
fun FinalScreen(navController: NavController) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color(0xFFB2A5C7))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Конец",
            fontSize = 48.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Это конец сегодняшнего квеста, но начало вашей семьи, " +
                    "примите наши поздравления в видеоформате",
            fontSize = 24.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default,
            lineHeight = 40.sp,
            modifier = Modifier.padding(10.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(10.dp))
//        ExtendedFloatingActionButton(
//            onClick = {
//                navController.navigate(Screen.LoginScreen.route)
//            },
//            content = { Text("КОНЕЦ", fontSize = 24.sp, color = Color(0xFFC9CBD5),) },
//            modifier = Modifier
//                .wrapContentWidth()
//                .height(50.dp),
//            containerColor = Color(0xFF07103F),
//        )
    }
}
/**
 * Preview function
 */

@Preview(showBackground = true)
@Composable
fun PreviewFinal() {
    WeddingSelfTheme() {
        val context = LocalContext.current
        FinalScreen(navController = NavController(context))
    }
}
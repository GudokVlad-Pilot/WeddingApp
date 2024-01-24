package com.example.weddingself.presentation

import android.content.pm.ActivityInfo
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.weddingself.navigation.LockScreenOrientation
import com.example.weddingself.navigation.VideoPlayer
import com.example.weddingself.ui.theme.WeddingSelfTheme

/**This file contains the final words of the quest
 * It has the congratulations and the video */
@Composable
fun FinalScreen(navController: NavController) {
    val context = LocalContext.current
    val videoUri = Uri.parse("android.resource://com.example.weddingself/raw/wedding")
    LockScreenOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
    Column(
        modifier = Modifier
            .background(Color(0xFFB2A5C7))
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "The end",
            fontSize = 48.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default
        )
        Spacer(modifier = Modifier.height(10.dp))
        VideoPlayer(videoUri = videoUri)
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "You've completed the quest! \n" +
                    "Congratulations!!!",
            fontSize = 18.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default,
            lineHeight = 40.sp,
            modifier = Modifier.padding(10.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))
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
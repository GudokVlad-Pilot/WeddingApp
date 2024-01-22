package com.example.weddingself.presentation

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.weddingself.R
import com.example.weddingself.navigation.Screen
import com.example.weddingself.ui.theme.WeddingSelfTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NikoThirdScreen(navController: NavController) {
    var code_second by rememberSaveable { mutableStateOf("") }
    val context = LocalContext.current
    Column(
        modifier = Modifier.background(Color(0xFFB2A5C7))
            .fillMaxSize().verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Задание 3",
            fontSize = 48.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Найдите следующее место и раздобудьте код для своего партнёра",
            fontSize = 32.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default,
            lineHeight = 40.sp,
            modifier = Modifier.padding(10.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Image(
            painter = painterResource(id = R.drawable.nikotwo),
            contentDescription = "test",
            modifier = Modifier
                .padding(10.dp)
                .clip(RoundedCornerShape(16.dp))
                .border(
                    BorderStroke(2.dp, Color(0xFFC9CBD5)),
                    RoundedCornerShape(16.dp)
                )
        )
        Spacer(modifier = Modifier.height(30.dp))
        TextField(
            value = code_second,
            onValueChange = { code_second = it },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            singleLine = true,
            placeholder = {
                Text("Code", fontSize = 16.sp)
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier.imePadding()
        )
        Spacer(modifier = Modifier.height(30.dp))
        ExtendedFloatingActionButton(
            onClick = {
                if (code_second == "1710"){
                    navController.navigate(Screen.FinalScreen.route)
                }
                else {
                    Toast.makeText(context, "Давай по новой, всё херня!", Toast.LENGTH_SHORT).show()
                }
            },
            content = { Text("ДАЛЬШЕ", fontSize = 24.sp, color = Color(0xFFC9CBD5),) },
            modifier = Modifier
                .wrapContentWidth()
                .height(50.dp),
            containerColor = Color(0xFF07103F),
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}
/**
 * Preview function
 */

@Preview(showBackground = true)
@Composable
fun PreviewNikoThird() {
    WeddingSelfTheme() {
        val context = LocalContext.current
        NikoThirdScreen(navController = NavController(context))
    }
}
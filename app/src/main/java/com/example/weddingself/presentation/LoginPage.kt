package com.example.weddingself.presentation


import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.relocation.BringIntoViewRequester
import androidx.compose.foundation.relocation.bringIntoViewRequester
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.weddingself.R
import com.example.weddingself.navigation.Screen
import com.example.weddingself.ui.theme.WeddingSelfTheme
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun LoginScreen(navController: NavController) {
    var username by rememberSaveable {mutableStateOf("")}
    var password by rememberSaveable {mutableStateOf("")}
    var format_count by rememberSaveable { mutableStateOf(0) }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .background(Color(0xFFB2A5C7))
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Image(
                painter = painterResource(id = R.drawable.pigeon_revert),
                contentDescription = "test",
                modifier = Modifier.height(80.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.pigeon),
                contentDescription = "test",
                modifier = Modifier.height(80.dp)
            )
        }
        Text(
            text = "The Lord of the Wedding Ring",
            fontSize = 48.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Cursive,
            lineHeight = 50.sp,
            style = TextStyle(
                fontSize = 24.sp,
                shadow = Shadow(
                    color = Color(0xFF07103F), blurRadius = 20f
                )
            )
        )
        Spacer(modifier = Modifier.height(60.dp))
        TextField(
            value = username,
            onValueChange = { username = it },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            singleLine = true,
            placeholder = {
                Text("Username", fontSize = 16.sp)
            },
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier.imePadding()
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            singleLine = true,
            placeholder = {
                Text("Password", fontSize = 16.sp)
            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                val image = if (passwordVisible)
                    Icons.Filled.Visibility
                else Icons.Filled.VisibilityOff

                // Please provide localized description for accessibility services
                val description = if (passwordVisible) "Hide password" else "Show password"

                IconButton(onClick = {passwordVisible = !passwordVisible}){
                    Icon(imageVector  = image, description)
                }
            },
            shape = RoundedCornerShape(24.dp),
//            modifier = Modifier.bringIntoViewRequester(bringIntoViewRequester)
//                .onFocusEvent { focusState ->
//                    if (focusState.isFocused) {
//                        coroutineScope.launch {
//                            bringIntoViewRequester.bringIntoView()
//                        }
//                    }
//                }
            modifier = Modifier.imePadding()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Забыли пароль?",
            fontSize = 16.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.clickable {
                Toast.makeText(context, "День рождения вашего партнёра", Toast.LENGTH_SHORT).show()
            }
            )
        Spacer(modifier = Modifier.height(60.dp))
        ExtendedFloatingActionButton(
            onClick = {
                if ((password == "") || (username == "")) {
                    Toast.makeText(context, "Заполните все поля", Toast.LENGTH_SHORT).show()
                }
                else if ((password == "2001-04-07") && (username == "Niko")) {
                    navController.navigate(Screen.NikoFirstScreen.route)
                }
                else if ((password == "2002-06-10") && (username == "Charlie")) {
                    navController.navigate(Screen.CharlieFirstScreen.route)
                }
                else if ((password == "Final") && (username == "Final")) {
                    navController.navigate(Screen.FinalScreen.route)
                }
                else if (((username=="Niko") || (username=="Charlie")) && (format_count>=3)) {
                    Toast.makeText(context, "Что такое километр???", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(context, "Неправильное имя пользователя или пароль", Toast.LENGTH_SHORT).show()
                    format_count += 1
                }
            },
            content = { Text("В ИГРУ!", fontSize = 24.sp, color = Color(0xFFC9CBD5),) },
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
fun PreviewLogin() {
    WeddingSelfTheme() {
        val context = LocalContext.current
        LoginScreen(navController = NavController(context))
    }
}

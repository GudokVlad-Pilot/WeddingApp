package com.example.weddingself.presentation

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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

/**This file is the first screen that user named "Charlie" can see.
 * It has the statements user should select to continue the quest*/
@Composable
fun CharlieFirstScreen(navController: NavController) {
    val context = LocalContext.current
    val isCheckedOne = remember { mutableStateOf(false) }
    val isCheckedTwo = remember { mutableStateOf(false) }
    val isCheckedThree = remember { mutableStateOf(false) }
    val isCheckedFour = remember { mutableStateOf(false) }
    val isCheckedFive = remember { mutableStateOf(false) }
    val isCheckedSix = remember { mutableStateOf(false) }
    val isCheckedSeven = remember { mutableStateOf(false) }
    val isCheckedEight = remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.background(Color(0xFFB2A5C7))
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Task 1",
            fontSize = 48.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Choose the correct statements",
            fontSize = 32.sp,
            color = Color(0xFF07103F),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Default,
            lineHeight = 40.sp,
            modifier = Modifier.padding(10.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))
        Column (horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(10.dp)
                .height(300.dp)
                .verticalScroll(rememberScrollState()),) {
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isCheckedOne.value,
                    onCheckedChange = { isCheckedOne.value = it },
                    enabled = true,
                )
                Text(
                    text = "Statement for Charlie 1",
                    color = Color(0xFF07103F),
                    modifier = Modifier.clickable {
                        isCheckedOne.value = !isCheckedOne.value
                    }
                )
            }
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isCheckedTwo.value,
                    onCheckedChange = { isCheckedTwo.value = it },
                    enabled = true,
                )
                Text(text = "Statement for Charlie 2",
                    color = Color(0xFF07103F),
                    modifier = Modifier.clickable {
                        isCheckedTwo.value = !isCheckedTwo.value
                    })
            }
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isCheckedThree.value,
                    onCheckedChange = { isCheckedThree.value = it },
                    enabled = true,
                )
                Text(text = "Statement for Charlie 3",
                    color = Color(0xFF07103F),
                    modifier = Modifier.clickable {
                        isCheckedThree.value = !isCheckedThree.value
                    })
            }
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isCheckedFour.value,
                    onCheckedChange = { isCheckedFour.value = it },
                    enabled = true,
                )
                Text(text = "Statement for Charlie 4",
                    color = Color(0xFF07103F),
                    modifier = Modifier.clickable {
                        isCheckedFour.value = !isCheckedFour.value
                    })
            }
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isCheckedFive.value,
                    onCheckedChange = { isCheckedFive.value = it },
                    enabled = true,
                )
                Text(text = "Statement for Charlie 5",
                    color = Color(0xFF07103F),
                    modifier = Modifier.clickable {
                        isCheckedFive.value = !isCheckedFive.value
                    }
                )
            }
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isCheckedSix.value,
                    onCheckedChange = { isCheckedSix.value = it },
                    enabled = true,
                )
                Text(text = "Statement for Charlie 6",
                    color = Color(0xFF07103F),
                    modifier = Modifier.clickable {
                        isCheckedSix.value = !isCheckedSix.value
                    }
                )
            }
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isCheckedSeven.value,
                    onCheckedChange = { isCheckedSeven.value = it },
                    enabled = true,
                )
                Text(text = "Statement for Charlie 7",
                    color = Color(0xFF07103F),
                    modifier = Modifier.clickable {
                        isCheckedSeven.value = !isCheckedSeven.value
                    }
                )
            }
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = isCheckedEight.value,
                    onCheckedChange = { isCheckedEight.value = it },
                    enabled = true,
                )
                Text(text = "Statement for Charlie 8",
                    color = Color(0xFF07103F),
                    modifier = Modifier.clickable {
                        isCheckedEight.value = !isCheckedEight.value
                    }
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        ExtendedFloatingActionButton(
            onClick = {
                if (isCheckedOne.value &&
                    !isCheckedTwo.value &&
                    isCheckedThree.value &&
                    isCheckedFour.value &&
                    !isCheckedFive.value &&
                    !isCheckedSix.value &&
                    isCheckedSeven.value &&
                    !isCheckedEight.value){
                    navController.navigate(Screen.CharlieSecondScreen.route)
                }
                else {
                    Toast.makeText(context, "Try again!", Toast.LENGTH_SHORT).show()
                }
            },
            content = { Text("NEXT", fontSize = 24.sp, color = Color(0xFFC9CBD5),) },
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
fun PreviewCharlieFirst() {
    WeddingSelfTheme() {
        val context = LocalContext.current
        CharlieFirstScreen(navController = NavController(context))
    }
}
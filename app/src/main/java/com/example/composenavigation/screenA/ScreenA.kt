package com.example.composenavigation.screenA

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


const val SCREEN_A_ROUTE = "SCREEN_A_ROUTE"

@Composable
fun ScreenA(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Button(onClick = onClick) {
            Text(text = "Move to ScreenB")
        }
    }

}
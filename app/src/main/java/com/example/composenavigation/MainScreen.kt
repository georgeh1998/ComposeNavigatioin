package com.example.composenavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composenavigation.screenA.SCREEN_A_ROUTE
import com.example.composenavigation.screenA.ScreenA
import com.example.composenavigation.screenB.SCREEN_B_ROUTE
import com.example.composenavigation.screenB.ScreenB

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SCREEN_A_ROUTE
    ) {
        composable(SCREEN_A_ROUTE) {
            ScreenA(
                modifier = modifier,
            ) {
                navController.navigate(SCREEN_B_ROUTE)
            }
        }
        composable(SCREEN_B_ROUTE) {
            ScreenB(
                modifier = modifier,
            ) {
                navController.popBackStack()
            }
        }
    }

}
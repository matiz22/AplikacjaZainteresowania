package com.example.aplikacja_zainteresowania

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.aplikacja_zainteresowania.screens.DodajScreen
import com.example.aplikacja_zainteresowania.screens.SzukajScreen

@Composable
fun NawigacjaAplikacja(navController: NavHostController) {

    val viewModel = viewModel<ZainteresowaniaViewModel>()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            DodajScreen(navController, viewModel)

        }
        composable("szukaj") {
            SzukajScreen()
        }
    }
}
package com.nandaiqbalh.musicappui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController: NavController, viewModel: MainViewModel, pd: PaddingValues) {

	NavHost(navController = navController as NavHostController, startDestination = Screen.DrawerScreen.AddAccount.route, modifier = Modifier.padding(pd)) {
		composable(Screen.DrawerScreen.AddAccount.route){

		}

		composable(Screen.DrawerScreen.Subscription.route){

		}
	}
}
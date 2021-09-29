package com.krstudio.mymovielist.ui.common

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.krstudio.mymovielist.NavigationItem
import com.krstudio.mymovielist.ui.HomeScreen

@Preview(showBackground = true)
@Composable
private fun PreviewBottomNavigation() {
	 MovieBottomNavigation(rememberNavController())
}

@Composable
fun MovieBottomNavigation(navController: NavHostController) {
	 BottomNavigation {
		  val navBackStackEntry by navController.currentBackStackEntryAsState()
		  val currentRoute = navBackStackEntry?.destination?.route
		  createBottomNavigationMenu().forEachIndexed { index, item ->
				BottomNavigationItem(
					 selected =currentRoute == item.route,
					 icon = {
						  Icon(
								painter = painterResource(id = item.icon),
								contentDescription = stringResource(
									 id = item.title
								)
						  )
					 },
					 label = { Text(text = stringResource(id = item.title)) },
					 selectedContentColor = Color.White,
					 unselectedContentColor = Color.White.copy(0.4f),
					 alwaysShowLabel = true,
					 onClick = {
						  navController.navigate(item.route) {
								navController.graph.startDestinationRoute?.let { route ->
									 popUpTo(route) {
										  saveState = true
									 }
								}
								launchSingleTop = true
								restoreState = true
						  }
					 }
				)
		  }
	 }
}

@Composable
fun MovieNavigation(navController: NavHostController) {
	 NavHost(navController, startDestination = NavigationItem.Home.route) {
		  composable(NavigationItem.Home.route) {
				HomeScreen()
		  }
		  composable(NavigationItem.Favorite.route) {
				HomeScreen()
		  }
	 }
}

private fun createBottomNavigationMenu(): List<NavigationItem> {
	 return listOf(
		  NavigationItem.Home,
		  NavigationItem.Favorite
	 )
}

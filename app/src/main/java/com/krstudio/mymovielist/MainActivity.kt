package com.krstudio.mymovielist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.ui.res.stringResource
import androidx.navigation.compose.rememberNavController
import com.krstudio.mymovielist.ui.common.MovieBottomNavigation
import com.krstudio.mymovielist.ui.common.MovieNavigation
import com.krstudio.mymovielist.ui.theme.CreateLinearView
import com.krstudio.mymovielist.ui.theme.MyMovieListTheme
import com.krstudio.mymovielist.ui.theme.common.TopBar

class MainActivity : ComponentActivity() {
	 override fun onCreate(savedInstanceState: Bundle?) {
		  super.onCreate(savedInstanceState)
		  setContent {
				MyMovieListTheme {
					 CreateLinearView()
//					 val navController = rememberNavController()
//					 Surface(color = MaterialTheme.colors.background) {
//						  Scaffold(
//								topBar = { TopBar(title = stringResource(id = R.string.home)) },
//								bottomBar = { MovieBottomNavigation(navController) }
//						  ) {
//								MovieNavigation(navController = navController)
//						  }
//					 }
				}
		  }
	 }
}

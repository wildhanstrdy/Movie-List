package com.krstudio.mymovielist

sealed class NavigationItem(val route:String, val icon:Int, val title:Int) {
	 object Home:NavigationItem("home",R.drawable.ic_baseline_home_24,R.string.home )
	 object Favorite:NavigationItem("favorite",R.drawable.ic_baseline_star_24,R.string.home )
}

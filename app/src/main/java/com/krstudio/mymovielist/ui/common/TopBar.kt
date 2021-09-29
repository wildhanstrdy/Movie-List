package com.krstudio.mymovielist.ui.theme.common

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun TopBar(title: String) {
	 TopAppBar(
		  title = {
				Text(text = title)
		  }
	 )
}

@Preview(showBackground = true)
@Composable
private fun TopBarPreview() {
	 TopBar(title = "This is top bar")
}

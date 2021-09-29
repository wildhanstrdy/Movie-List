package com.krstudio.mymovielist.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreateLinearView() {
	 Column {
		  val textChangeExample = remember {
				mutableStateOf("Initial Text")
		  }
		  Text(
				text = textChangeExample.value,
				modifier = Modifier.fillMaxWidth(),
				fontSize = 20.sp,
				fontWeight = FontWeight.Bold,
		  )
		  Text(
				text = "Text 2", modifier = Modifier.fillMaxWidth(),
				fontSize = 20.sp,
				fontWeight = FontWeight.Bold,
		  )
		  Text(
				text = "Text 3", modifier = Modifier.fillMaxWidth(),
				fontSize = 20.sp,
				fontWeight = FontWeight.Bold,
		  )

		  Button(
				modifier = Modifier
					 .fillMaxWidth()
					 .padding(16.dp),
				onClick = { textChangeExample.value = "Value Changed" }) {
				Text(text = "Change The Text Value")
		  }
	 }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewLinearView() {
	 CreateLinearView()
}

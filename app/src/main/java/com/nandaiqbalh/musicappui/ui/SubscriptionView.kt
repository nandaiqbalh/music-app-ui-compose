package com.nandaiqbalh.musicappui.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.Card
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SubscriptionView() {
	Column(
		modifier = Modifier
			.height(200.dp)
			.fillMaxWidth()
			.padding(16.dp),
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text(text = "Manage Subscription")
		Card(backgroundColor = Color.White, modifier = Modifier.padding(top = 16.dp), elevation = 4.dp) {
			Column(modifier = Modifier.padding(8.dp)) {
				Column {
					Text(text = "Musical")
					Row(
						modifier = Modifier.fillMaxWidth(),
						horizontalArrangement = Arrangement.SpaceBetween
					) {
						Text(text = "See All Plans")
						Icon(
							imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
							contentDescription = "See All Plans Icon"
						)

					}
				}

				Divider()

				Row(modifier = Modifier.padding(vertical = 16.dp)) {
					Icon(imageVector = Icons.Default.AccountBox, contentDescription = null )

					Text(text = "Get a Plan")
				}


			}
		}
	}
}
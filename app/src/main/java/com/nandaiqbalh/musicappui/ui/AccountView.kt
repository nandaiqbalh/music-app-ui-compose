package com.nandaiqbalh.musicappui.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nandaiqbalh.musicappui.R

@Composable
fun AccountView() {
	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(16.dp)
	) {

		Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
			Row(verticalAlignment = Alignment.CenterVertically) {
				Icon(
					imageVector = Icons.Default.AccountCircle,
					contentDescription = "Account Icon",
					modifier = Modifier.padding(end = 8.dp),
				)
				Column {
					Text(text = "Nanda Iqbal Hanafi")
					Text(text = "nandaiqbalhanafii@gmail.com")
				}
			}

			IconButton(onClick = {}) {
				Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null )
			}
		}
		Divider()

		Row(modifier = Modifier.padding(top = 16.dp)) {
			Icon(painter = painterResource(id = R.drawable.ic_music), contentDescription = "My Music", modifier = Modifier.padding(end = 8.dp) )
			Text(text = "My Music")
		}
	}
}
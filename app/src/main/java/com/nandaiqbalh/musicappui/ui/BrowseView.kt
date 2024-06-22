package com.nandaiqbalh.musicappui.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.nandaiqbalh.musicappui.R

@Composable
fun BrowseView() {
	val categories = listOf("Hits", "Happy", "Workout", "Running", "TGIF", "Yoga")
	LazyVerticalGrid(columns = GridCells.Fixed(2)) {
		items(categories) { categories ->
			BrowserItem(category = categories, drawable = R.drawable.ic_music)
		}
	}
}
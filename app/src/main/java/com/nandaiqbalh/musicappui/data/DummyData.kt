package com.nandaiqbalh.musicappui.data

import androidx.annotation.DrawableRes
import com.nandaiqbalh.musicappui.R

data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
	Lib(R.drawable.ic_music, "Playlist"),
	Lib(R.drawable.ic_music, "Artist"),
	Lib(R.drawable.ic_music, "Album"),
	Lib(R.drawable.ic_music, "Song"),
	Lib(R.drawable.ic_music, "Genre")


)
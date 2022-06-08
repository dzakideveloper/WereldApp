package com.example.wereldapp.data.response.travellres

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class JepangResponse(

	@field:SerializedName("JepangResponse")
	val jepangResponse: List<JepangResponseItem?>? = null
) : Parcelable

@Parcelize
data class JepangResponseItem(

	@field:SerializedName("Lokasi")
	val lokasi: String? = null,

	@field:SerializedName("Rating")
	val rating: String? = null,

	@field:SerializedName("Title")
	val title: String? = null,

	@field:SerializedName("Deskripsi")
	val deskripsi: String? = null
) : Parcelable

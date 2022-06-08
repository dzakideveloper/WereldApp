package com.example.wereldapp.data.response.travelres

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TurkiResponse(

	@field:SerializedName("TurkiResponse")
	val turkiResponse: List<TurkiResponseItem?>? = null
) : Parcelable

@Parcelize
data class TurkiResponseItem(

	@field:SerializedName("image")
	val image: String? = null,

	@field:SerializedName("Lokasi")
	val lokasi: String? = null,

	@field:SerializedName("Rating")
	val rating: String? = null,

	@field:SerializedName("Title")
	val title: String? = null,

	@field:SerializedName("Deskripsi")
	val deskripsi: String? = null,

	@field:SerializedName("id")
	val id: String? = null
) : Parcelable

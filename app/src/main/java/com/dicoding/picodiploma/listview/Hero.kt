package com.dicoding.picodiploma.listview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero(
    var photo: Int,
    var name: String,
    var description: String
) : Parcelable
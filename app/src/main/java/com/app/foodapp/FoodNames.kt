package com.app.foodapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FoodNames (
    var name:String,
    var imageURI:String
):Parcelable
package com.app.foodapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FoodNamesSecond (
    var name2:String,
    var details2:String,
    var calories2:String,
    var prices2:String,
    var imageURI2:String,
    var rating:String,
    var cookingtime:String,
    var details3:String,
    var image1:String,
    var image2:String,
    var image3:String,
    var image4 :String,
    var image5 :String
):Parcelable
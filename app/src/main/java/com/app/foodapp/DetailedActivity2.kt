package com.app.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detailed2.*

class DetailedActivity2 : AppCompatActivity() {
    companion object {
        const val EXTRA_POST = "extra_post"
    }
    private lateinit var data:FoodNamesSecond
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed2)

        data= intent.getParcelableExtra<FoodNamesSecond>(EXTRA_POST)!!
            if(intent.hasExtra(EXTRA_POST)){
                ttt.text = data.calories2
                debugger("${data.calories2}")
            }

    }
}
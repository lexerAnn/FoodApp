package com.app.foodapp

import kotlinx.android.synthetic.main.itemfood.view.*
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerViewHolder(val v:View):RecyclerView.ViewHolder(v)
class  RecyclerViewAdapter (val context:Context):ListAdapter<FoodNames,RecyclerViewHolder>(DIFF_UTIL){
    companion object{
        val DIFF_UTIL:DiffUtil.ItemCallback<FoodNames> =
            object:DiffUtil.ItemCallback<FoodNames>(){
                override fun areItemsTheSame(oldItem: FoodNames, newItem: FoodNames): Boolean =
                    newItem.name==oldItem.name


                override fun areContentsTheSame(oldItem: FoodNames, newItem: FoodNames): Boolean =
                    newItem.name==oldItem.name
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
       return RecyclerViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.itemfood,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        var food=getItem(position)
        holder.v.foodName.text=food.name
        Glide.with(holder.itemView.context).load(food.imageURI).into(holder.v.image)
    }


}
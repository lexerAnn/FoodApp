package com.app.foodapp

import kotlinx.android.synthetic.main.itemfood.view.*
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.itemfood.view.foodName
import kotlinx.android.synthetic.main.itemfoodtwo.view.*

class RecyclerViewHolderSecond(val v:View):RecyclerView.ViewHolder(v)
class RecyclerViewAdapterSecond (val context:Context):ListAdapter<FoodNamesSecond,RecyclerViewHolderSecond>(DIFF_UTIL){
    companion object{
        val DIFF_UTIL:DiffUtil.ItemCallback<FoodNamesSecond> =
            object:DiffUtil.ItemCallback<FoodNamesSecond>(){
                override fun areItemsTheSame(oldItem: FoodNamesSecond, newItem: FoodNamesSecond): Boolean =
                    newItem.name2==oldItem.name2


                override fun areContentsTheSame(oldItem: FoodNamesSecond, newItem: FoodNamesSecond): Boolean =
                    newItem.name2==oldItem.name2
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolderSecond {
       return RecyclerViewHolderSecond( LayoutInflater.from(parent.context).inflate(R.layout.itemfoodtwo,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolderSecond, position: Int) {
        var data=getItem(position)
        holder.v.foodName2.text=data.name2
        holder.v.fooddetails2.text=data.details2
        holder.v.calories2.text=data.calories2
        holder.v.prices2.text=data.prices2
        Glide.with(holder.itemView.context).load(data.imageURI2).into(holder.v.image2)
        var bundle= bundleOf("details" to data)
        holder.itemView.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_detailFragment,bundle)
        }
    }


}
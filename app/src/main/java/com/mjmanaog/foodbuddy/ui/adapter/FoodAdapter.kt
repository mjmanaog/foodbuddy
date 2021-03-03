package com.mjmanaog.foodbuddy.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mjmanaog.foodbuddy.R
import com.mjmanaog.foodbuddy.data.model.FoodModel

class FoodAdapter : RecyclerView.Adapter<FoodViewHolder>() {

    private var foodList: MutableList<FoodModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(
                layoutInflater
        )
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getItem(position: Int): FoodModel {
        return foodList[position]
    }

    fun addAll(genreList: List<FoodModel>) {
        this.foodList.clear()
        this.foodList.addAll(genreList)
        notifyDataSetChanged()
    }
}
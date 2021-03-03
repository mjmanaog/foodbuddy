package com.mjmanaog.foodbuddy.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mjmanaog.foodbuddy.R
import com.mjmanaog.foodbuddy.data.model.foodDummyData
import com.mjmanaog.foodbuddy.ui.adapter.FoodAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var foodAdapter: FoodAdapter = FoodAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvMain.adapter = foodAdapter
        foodAdapter.addAll(foodDummyData)
    }
}
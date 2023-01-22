package com.example.messages

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.messages.databinding.ItemRecyclerBinding

class ViewHolder(val binding: ItemRecyclerBinding):RecyclerView.ViewHolder(binding.root)

class Adapter(val datas: MutableList<String>?): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
        = ViewHolder(ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as ViewHolder).binding
        val context = binding.itemRoot.context
        binding.name.text = datas!![position]
        Log.d("상태","position : $position")
    }

    override fun getItemCount(): Int = datas?.size ?: 0
}
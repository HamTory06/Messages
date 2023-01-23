package com.example.messages

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messages.databinding.ItemRecyclerBinding

data class Profile(
    val name: String = "",
    val statusMessage: String = ""
)


class Adapter(val datas: MutableList<Profile>): RecyclerView.Adapter<Adapter.ProfileViewHolder>() {

    class ProfileViewHolder(val binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val Profile: String
            get() {
                Profile()
                return ""
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ProfileViewHolder(ItemRecyclerBinding.bind(view))
    }

    override fun onBindViewHolder(profileViewHolder: ProfileViewHolder, position: Int) {
        val listposition = datas[position]
        profileViewHolder.binding.name.text = listposition.name
        profileViewHolder.binding.statusMessage.text = listposition.statusMessage
    }

    override fun getItemCount(): Int = datas.size
}
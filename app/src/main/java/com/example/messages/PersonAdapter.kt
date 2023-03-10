package com.example.messages

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.messages.databinding.ItemRecyclerBinding

data class profiledata(
    val name: String = "",
    val statusMessage: String = ""
)


class PersonAdapter(val datas: MutableList<profiledata>): RecyclerView.Adapter<PersonAdapter.ProfileViewHolder>() {

    class ProfileViewHolder(val binding: ItemRecyclerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val Profile: String
            get() {
                profiledata()
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
        profileViewHolder.binding.itemRoot.setOnClickListener {
            Log.d("상태","클릭 : ${position}")
            val intent = Intent(profileViewHolder.itemView.context,Profile::class.java)
            ContextCompat.startActivity(profileViewHolder.itemView.context,intent,null)
        }
    }

    override fun getItemCount(): Int = datas.size
}
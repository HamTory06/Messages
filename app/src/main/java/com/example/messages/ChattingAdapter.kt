package com.example.messages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.messages.databinding.ItemChatMeBinding
import com.example.messages.databinding.ItemChattingBinding
import java.text.DateFormat
import java.text.SimpleDateFormat

data class chatting(
    val name: String = ""
)

class ChattingAdapter(val chatting: MutableList<chatting>): RecyclerView.Adapter<ChattingAdapter.ChattingViewHolder>() {

    class ChattingViewHolder(val binding: ItemChattingBinding) :
        RecyclerView.ViewHolder(binding.root){
            val chatting: String
            get(){
                chatting()
                return ""
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChattingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chatting, parent, false)
        return ChattingViewHolder(ItemChattingBinding.bind(view))
    }

    override fun getItemCount(): Int = chatting.size

    override fun onBindViewHolder(holder: ChattingViewHolder, position: Int) {
        val listposition = chatting[position]
        holder.binding.name.text = listposition.name
    }

}
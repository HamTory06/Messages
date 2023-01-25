package com.example.messages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.messages.databinding.ItemChatMeBinding
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

data class Messages(
    val chatting: String = "",
    val date: DateFormat = SimpleDateFormat("yyyy-MM-dd")
)

class MessageAdapter(val chatting: MutableList<Messages>): RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(val binding: ItemChatMeBinding) :
        RecyclerView.ViewHolder(binding.root){
            val messages: String
            get(){
                Messages()
                return ""
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_me, parent, false)
        return MessageViewHolder(ItemChatMeBinding.bind(view))
    }

    override fun getItemCount(): Int = chatting.size

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val listposition = chatting[position]
        holder.binding.textGchatMessageMe.text = listposition.chatting
        holder.binding.textGchatTimestampMe.text = listposition.date.toString()
    }

}
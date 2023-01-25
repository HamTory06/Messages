package com.example.messages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.messages.databinding.ItemChatMeBinding
import java.lang.reflect.Type
import java.text.DateFormat
import java.text.FieldPosition
import java.text.SimpleDateFormat


data class Messages(
    val chatting: String = "",
    val date: DateFormat = SimpleDateFormat("yyyy-MM-dd")
)

class MessagesAdapter(val message: MutableList<Messages>): RecyclerView.Adapter<MessagesAdapter.MessageViewHolder>() {

    class MessageViewHolder(val binding: ItemChatMeBinding) :
            RecyclerView.ViewHolder(binding.root){
                val Messages: String
                get(){
                    Messages()
                    return ""
                }
            }

    override fun getItemCount(): Int = message.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_me, parent, false)
        return MessageViewHolder(ItemChatMeBinding.bind(view))
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int){
        val listposition = message[position]
        holder.binding.textGchatMessageMe.text = listposition.chatting
        holder.binding.textGchatTimestampMe.text = listposition.date.toString()
    }
}
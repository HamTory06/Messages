package com.example.messages

import android.content.Context
import android.os.Message
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MessageAdater(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val VIEW_TYPE_USER_MESSAGE_ME = 10
    private val VIEW_TYPE_USER_MESSAGE_OTHER = 11


    private var messages: MutableList<BaseMessage>
    init {
        messages = ArrayList()
    }

    fun loadMessages(message: MutableList<BaseMessage>){
        this.messages = messages
        notifyDataSetChanged()
    }

    fun addMessage(message: BaseMessage){
        message.add(0,message)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return when(viewType){
            VIEW_TYPE_USER_MESSAGE_ME -> {
                holder as MyUserHolder
                holder.bindView(context, messages.get(position) as )
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = messages.size
}
package com.example.messages

import android.content.Context
import android.os.Message
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MessageAdater(context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

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
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
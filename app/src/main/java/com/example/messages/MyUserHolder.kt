package com.example.messages

import android.content.Context
import android.os.Message
import android.text.format.DateUtils
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.messages.databinding.ActivityMainBinding
import com.example.messages.databinding.ItemChatMeBinding
import com.sendbird.android.UserMessage

class MyUserHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var mbinding: ItemChatMeBinding ?= null
    private val binding get() = mbinding!!

    val messageText = binding.textGchatMessageMe
    val data = binding.textGchatDateMe
    val messageDate = binding.textGchatTimestampMe

    fun bindView(context: Context,message: UserMessage) {
        messageText.setText(message.message)
        messageDate.text = DateUtil.formatDate(message.createdAt)

        data.visibility = View.VISIBLE
        data.text = DateUtil.formatTime(message.createdAt)
    }
}
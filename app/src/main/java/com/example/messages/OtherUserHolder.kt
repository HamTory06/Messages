package com.example.messages

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.messages.databinding.ItemChatOtherBinding
import com.sendbird.android.UserMessage

class OtherUserHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var mbinding: ItemChatOtherBinding ?= null
    private val binding get() = mbinding!!

    val messageText = binding.textGchatMessageOther
    val date = binding.textGchatDateOther
    val timestamp = binding.textGchatTimestampOther
    val profileImage = binding.imageGchatProfileOther
    val user = binding.textGchatUserOther

    fun bindView(context: Context, message: UserMessage){
        messageText.setText(message.message)
        timestamp.text = DateUtil.formatTime(message.createdAt)

        date.visibility = View.VISIBLE
        date.text = DateUtil.formatDate(message.createdAt)

        Glide.with(context).load(message.sender.profileUrl).apply(RequestOptions().override(75, 75))
            .into(profileImage)
        user.text = message.sender.nickname
    }

}
package com.example.messages

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.messages.databinding.FragmentPersonBinding


class Person : Fragment() { //이름 잘못됨

    private var mbinding: FragmentPersonBinding ?= null
    private val binding get() = mbinding!!

    private val chatting = arrayListOf<Messages>()
    lateinit var adapter: MessageAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mbinding = FragmentPersonBinding.inflate(inflater, container, false)
        Log.d("상태","Person")
        val layoutManager = LinearLayoutManager(context)
        binding.recyclerViewPerson.layoutManager = layoutManager
        adapter = MessageAdapter(chatting)
        binding.recyclerViewPerson.adapter = adapter
        binding.recyclerViewPerson.addItemDecoration(DividerItemDecoration(activity,DividerItemDecoration.VERTICAL))
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mbinding = null
    }

}
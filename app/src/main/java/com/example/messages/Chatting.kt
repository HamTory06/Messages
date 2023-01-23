package com.example.messages

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.messages.databinding.FragmentChattingBinding


class Chatting : Fragment() {

    private var mbinding: FragmentChattingBinding ?= null
    private val binding get() = mbinding!!

    var datas: MutableList<String> ?= null
    lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Chatting_상태","onCreateView")
//        val layoutManager = LinearLayoutManager(context)
//        binding.recyclerView.layoutManager = layoutManager
//        adapter = Adapter(datas)
//        binding.recyclerView.adapter = adapter
        (activity as AppCompatActivity?)!!.title = "채팅"
        mbinding = FragmentChattingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mbinding = null
    }
}
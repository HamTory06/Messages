package com.example.messages

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.messages.databinding.FragmentChattingBinding


class Chatting : Fragment() {

    private var mbinding: FragmentChattingBinding ?= null
    private val binding get() = mbinding!!

    private val datas =  arrayListOf<profiledata>()
    lateinit var adapter: Adapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mbinding = FragmentChattingBinding.inflate(inflater, container, false)
        Log.d("상태","Chatting")
        val layoutManager = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = layoutManager
        adapter = Adapter(datas)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.addItemDecoration(DividerItemDecoration(activity,DividerItemDecoration.VERTICAL))
        binding.fab.setOnClickListener {
//            Log.d("상태","클릭")
            val profile = profiledata("${datas!!.size}","${datas!!.size}")
            datas!!.add(profile)
            binding.recyclerView.adapter?.notifyDataSetChanged()
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.chatting_toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mbinding = null
    }
}
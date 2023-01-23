package com.example.messages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.fragment.app.FragmentManager
import com.example.messages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mbinding: ActivityMainBinding ?= null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager: FragmentManager = supportFragmentManager
        binding.bottomnavigation.setOnItemReselectedListener { item ->
            when(item.itemId){
                R.id.friend -> {
                    Log.d("상태","friend")
                    fragmentManager.beginTransaction().replace(R.id.Fragment, Chatting()).commit()
                    Chatting()
                }
                R.id.message -> {
                    Log.d("상태", "message")
                    fragmentManager.beginTransaction().replace(R.id.Fragment, Person()).commit()
                    Person()
                }
            }
            true
        }
        binding.bottomnavigation.selectedItemId = R.id.friend
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.chatting_toolbar_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
}
package com.example.messages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.messages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mbinding: ActivityMainBinding ?= null
    private val binding get() = mbinding!!

    val chattingFragment = Chatting()
    val personFragment = Person()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomnavigation.selectedItemId = R.id.message

        binding.bottomnavigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.friend -> {
                    replaceFragment(chattingFragment)
                }
                R.id.message -> {
                    replaceFragment(personFragment)
                }
            }
            true
        }
        binding.bottomnavigation.selectedItemId = R.id.friend
    }


    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.Fragment,fragment)
            commit()
        }
    }
}
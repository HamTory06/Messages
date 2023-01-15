package com.example.messages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mbinging: ActivityMainBinding ?= null
    private val binding get() = mbinging!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinging = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSend.setOnClickListener {

        }
    }
}
package com.example.messages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messages.databinding.ActivitySettingsBinding

class Settings : AppCompatActivity() {
    private var mbinding : ActivitySettingsBinding ?= null
    private val binding get() = mbinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
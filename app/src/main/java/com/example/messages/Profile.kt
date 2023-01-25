package com.example.messages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import com.example.messages.databinding.ActivityMainBinding
import com.example.messages.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private var mbinding: ActivityProfileBinding ?= null
    private val binding get() = mbinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.profileToolbar.setOnMenuItemClickListener{
            when(it.itemId){
                R.id.settings -> {
                    Log.d("상태","ic_settings 클릭")
                    val intent = Intent(this, Settings::class.java)
                    startActivity(intent)
                    true
                }
                R.id.backwards -> {
                    Log.d("상태","ic_backwards 클릭")
                    onBackPressed()
                    true
                }
                else -> false
            }
        }
    }
}
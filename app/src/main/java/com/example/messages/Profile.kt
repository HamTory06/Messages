package com.example.messages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.backwards -> {
                onBackPressed()
            }
            R.id.settings -> {
                val intent = Intent(this, Settings::class.java)
                startActivity(intent)
            }
        }
        return onOptionsItemSelected(item)
    }
}
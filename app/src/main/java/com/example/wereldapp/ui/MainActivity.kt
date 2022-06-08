package com.example.wereldapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wereldapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardNegara.setOnClickListener {
            val intent = Intent(this, NegaraScreen::class.java)
            startActivity(intent)
        }

        binding.cardDesta.setOnClickListener {
            val intent = Intent(this, DestaMainScreen::class.java)
            startActivity(intent)
        }
    }
}
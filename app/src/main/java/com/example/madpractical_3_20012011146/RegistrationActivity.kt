package com.example.madpractical_3_20012011146

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.madpractical_3_20012011146.databinding.ActivityLoginBinding
import com.example.madpractical_3_20012011146.databinding.ActivityMainBinding
import com.example.madpractical_3_20012011146.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.bottomNavigationView.selectedItemId = R.id.reg
        binding.bottomNavigationView.setOnItemSelectedListener { it1 ->
            when(it1.itemId){
                R.id.login -> {
                    Intent(this,LoginActivity::class.java).also{startActivity(it)}
                }

            }
            return@setOnItemSelectedListener true
        }
    }
}
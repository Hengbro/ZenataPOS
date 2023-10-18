package com.example.zenatapos.ui.allactivity

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.zenatapos.databinding.ActivityMainBinding
import com.example.zenatapos.databinding.HomecheckoutBinding

class HomeChekOutActivity : AppCompatActivity() {

    private lateinit var binding: HomecheckoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = HomecheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
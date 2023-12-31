package com.example.zenatapos.ui.allactivity

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.zenatapos.databinding.ActivityAdaInfoUserBinding
import com.example.zenatapos.databinding.ActivityMainBinding

class InfoUserActivity : AppCompatActivity() {

    private var _binding: ActivityAdaInfoUserBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAdaInfoUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            /*btnClose!!.setOnClickListener {
                val intent = Intent(this@InfoUserActivity, HomeChekOutActivity::class.java)
                startActivity(intent)
            }*/
        }
    }
}
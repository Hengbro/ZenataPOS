package com.example.zenatapos

import android.content.Intent
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.zenatapos.databinding.ActivityCategoriesBinding
import com.example.zenatapos.databinding.ActivityMainBinding
import com.example.zenatapos.databinding.HomecheckoutBinding
import com.example.zenatapos.ui.allactivity.CategoriesActivity
import com.example.zenatapos.ui.allactivity.adapter.CategoryAdapter

class MainActivity : AppCompatActivity() {

    private var _binding: HomecheckoutBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = HomecheckoutBinding.inflate(layoutInflater)

        getData()

    }

    private fun getData(){
        binding.apply {

            btnChange.setOnClickListener {
                val intent = Intent(this@MainActivity, CategoriesActivity::class.java)
                startActivity(intent)
            }

        }
    }
}
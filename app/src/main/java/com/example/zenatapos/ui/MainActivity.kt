package com.example.zenatapos.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zenatapos.databinding.ActivityMainBinding
import com.example.zenatapos.ui.productInventory.ProductInventoryActivity
import com.inyongtisto.myhelper.extension.intentActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        intentActivity(ProductInventoryActivity::class.java)
    }
}
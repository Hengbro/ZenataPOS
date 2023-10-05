package com.example.zenatapos.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zenatapos.databinding.ActivityLoginBinding
import com.example.zenatapos.databinding.HomecheckoutBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: HomecheckoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = HomecheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
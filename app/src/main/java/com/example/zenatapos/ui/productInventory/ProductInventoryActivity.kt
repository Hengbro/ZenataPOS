package com.example.zenatapos.ui.productInventory

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.zenatapos.R
import com.example.zenatapos.databinding.ActivityProductInventoryBinding


class ProductInventoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductInventoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductInventoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainButton()
        callFargment(ProductFragment())
    }

    private fun mainButton() {
        binding.apply {
            btnProduct.setOnClickListener {
                setActive(btnProduct)
                callFargment(ProductFragment())
            }

            btnCategory.setOnClickListener {
                setActive(btnCategory)
                callFargment(CategoryFragment())
            }

            btnVariant.setOnClickListener {
                setActive(btnVariant)
                callFargment(ProductFragment())
            }
        }
    }

    private fun callFargment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(
                R.id.mainFrame,
                fragment,
                fragment.tag
            ).commit()
    }

    private fun setActive(view: TextView) {
        binding.apply {
            val listViews = listOf<TextView>(btnProduct, btnCategory, btnVariant)
            listViews.forEach {
                if (it == view) {
                    it.setBackgroundColor(getColor(R.color.colorPrimary))
                    it.setTextColor(getColor(R.color.white))
                } else {
                    it.setBackgroundColor(getColor(R.color.white))
                    it.setTextColor(getColor(R.color.gray2))
                }
            }
        }
    }
}
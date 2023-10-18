package com.example.zenatapos.ui.allactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.zenatapos.databinding.ActivityCategoriesBinding
import com.example.zenatapos.model.Categories
import com.example.zenatapos.ui.allactivity.adapter.CategoryAdapter

class CategoriesActivity : AppCompatActivity() {

    private lateinit var viewModel : CategoriesModel

    private var _binding: ActivityCategoriesBinding? = null
    private val binding get() = _binding!!

    private val adapterCategory = CategoryAdapter ()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityCategoriesBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[CategoriesModel::class.java]

        setAdapter()
        setData()
    }

    private fun setAdapter(){
        binding.rvData.adapter = adapterCategory
    }

    private fun setData(){
        viewModel.listCategory.observe(this){
            adapterCategory.addItems(it)
        }


    }

    private fun getData(item: Categories) {
        binding.edtTextsearch.setText(item.name)
    }
}

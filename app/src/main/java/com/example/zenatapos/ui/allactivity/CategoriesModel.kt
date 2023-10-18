package com.example.zenatapos.ui.allactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.zenatapos.lokal.DummyData
import com.example.zenatapos.model.Categories

class CategoriesModel : ViewModel() {
    val listCategory: LiveData<List<Categories>> = MutableLiveData<List<Categories>>().apply {
        value = DummyData.listCategory
    }
}
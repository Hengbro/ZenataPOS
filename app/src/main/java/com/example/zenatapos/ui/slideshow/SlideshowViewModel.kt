package com.example.zenatapos.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.zenatapos.core.data.source.lokal.DummyData
import com.example.zenatapos.model.Categories

class SlideshowViewModel : ViewModel() {

    private val _texts = MutableLiveData<List<String>>().apply {
        value = (1..16).mapIndexed { _, i ->
            "$i Product"
        }
    }

    val texts: LiveData<List<String>> = _texts

    val listCategory: LiveData<List<Categories>> = MutableLiveData<List<Categories>>().apply {
        value = DummyData.listCategory
    }
}
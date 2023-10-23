package com.example.zenatapos.ui.transform

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TransformViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is transform Fragment"
    }
    val text: LiveData<String> = _text
}
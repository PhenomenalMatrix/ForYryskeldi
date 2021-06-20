package com.example.popularmove

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var list: MutableLiveData<List<String>> = MutableLiveData()

    fun fetchList(): LiveData<List<String>>{
        list.value = CreateList.creatList()
        return list
    }
}
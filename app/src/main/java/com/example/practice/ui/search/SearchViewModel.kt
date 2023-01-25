package com.example.practice.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practice.R
import com.example.practice.datamodel.Search
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {
    private var recordList: MutableLiveData<List<Search>> =MutableLiveData()
    fun getAllRecords(): LiveData<List<Search>> {
        viewModelScope.launch(Dispatchers.IO) {
            val records = arrayListOf<Search>()
            for (i in 0..10){
                    records.add(Search(R.drawable.ic_baseline_search_24,"Search-"+i,"Search",isFav = true))
                recordList.postValue(records)
            }


        }
        return recordList
    }
}
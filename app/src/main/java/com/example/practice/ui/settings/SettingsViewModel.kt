package com.example.practice.ui.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practice.R
import com.example.practice.datamodel.Settings
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SettingsViewModel : ViewModel() {

    private var recordList: MutableLiveData<List<Settings>> =MutableLiveData()
    fun getAllRecords(): LiveData<List<Settings>> {
        viewModelScope.launch(Dispatchers.IO) {
            val records = arrayListOf<Settings>()
            for (i in 0..10){
                records.add(Settings(R.drawable.ic_baseline_settings_24,"Settings-"+i,"Settings",isFav = true))
                recordList.postValue(records)
            }


        }
        return recordList
    }
}
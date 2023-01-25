package com.example.practice.ui.addRecords
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practice.R
import com.example.practice.datamodel.AddRecord
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddRecordViewModel : ViewModel() {

    private var recordList: MutableLiveData<List<AddRecord>> =MutableLiveData()
    fun getAllRecords(): LiveData<List<AddRecord>>{
        viewModelScope.launch(Dispatchers.IO) {
            val records = arrayListOf<AddRecord>()
            for (i in 0..10){
                records.add(AddRecord(R.drawable.ic_baseline_notification_add_24 ,"Record"+i,"Hello DSU",isFav = true))
                recordList.postValue(records)
            }


        }
        return recordList

    }
}
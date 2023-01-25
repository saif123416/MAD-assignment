package com.example.practice.ui.dashboard
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practice.R
import com.example.practice.datamodel.Record
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DashboardViewModel : ViewModel() {
    private var recordList: MutableLiveData<List<Record>> =MutableLiveData()
    fun getAllRecords(): LiveData<List<Record>>{
        viewModelScope.launch(Dispatchers.IO) {
            val records = arrayListOf<Record>()
            for (i in 0..10){
                records.add(Record(R.drawable.ic_baseline_add_circle_24 ,""+i,"Hello Description",isFav = true))
                recordList.postValue(records)
            }


        }
        return recordList

    }
}
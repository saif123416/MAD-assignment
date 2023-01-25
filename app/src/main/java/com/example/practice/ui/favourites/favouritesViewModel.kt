package com.example.practice.ui.favourites
import com.example.practice.R
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practice.datamodel.FavouritesRecord
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class favouritesViewModel : ViewModel() {
    private var favRecordList: MutableLiveData<List<FavouritesRecord>> =MutableLiveData()
    fun getAllFavRecords(): LiveData<List<FavouritesRecord>> {
        viewModelScope.launch(Dispatchers.IO) {
            val records = arrayListOf<FavouritesRecord>()
            for (i in 0..10){
                if(i%2==0)
                    records.add(FavouritesRecord(R.drawable.ic_baseline_add_circle_24,"DSU Student-"+i,"Hello Description",isFav = true))
                else
                    records.add(FavouritesRecord(R.drawable.ic_baseline_add_circle_24,"DSU Student-"+i,"Hello Description",isFav = false))
                favRecordList.postValue(records)
            }


        }
        return favRecordList
    }

}
package com.example.practice.ui.addRecords
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.databinding.FragmentAddformBinding
import com.example.practice.datamodel.AddRecord
class AddRecordAdapter(private val records : List<AddRecord>):
    RecyclerView.Adapter<AddRecordAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentAddformBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = records.get(position)
    }

    override fun getItemCount(): Int {
        return records.size
    }
    class ViewHolder(val binding:FragmentAddformBinding):RecyclerView.ViewHolder(binding.root)

}
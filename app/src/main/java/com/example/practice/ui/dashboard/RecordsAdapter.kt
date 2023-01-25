package com.example.practice.ui.dashboard
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.databinding.ItemRecordBinding
import com.example.practice.datamodel.Record
class RecordsAdapter(private val records : List<Record>):
        RecyclerView.Adapter<RecordsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRecordBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = records.get(position)
        holder.binding.tvFavName.text = model.name
    }

    override fun getItemCount(): Int {
        return records.size
    }
    class ViewHolder(val binding : ItemRecordBinding):RecyclerView.ViewHolder(binding.root)

        }
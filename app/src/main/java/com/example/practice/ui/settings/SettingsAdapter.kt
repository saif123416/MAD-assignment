package com.example.practice.ui.settings

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.databinding.ItemSettingsBinding
import com.example.practice.datamodel.Settings

class SettingsAdapter(private val records : List<Settings>):
    RecyclerView.Adapter<SettingsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemSettingsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = records.get(position)
        holder.binding.tvFavName.text = model.name
    }

    override fun getItemCount(): Int {
        return records.size
    }
    class ViewHolder(val binding : ItemSettingsBinding): RecyclerView.ViewHolder(binding.root)

}
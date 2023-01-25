package com.example.practice.ui.search
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.databinding.ItemSearchBinding
import com.example.practice.datamodel.Search


class SearchAdapter(private val records : List<Search>):
    RecyclerView.Adapter<SearchAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemSearchBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = records.get(position)
        holder.binding.tvFavName.text = model.name
    }

    override fun getItemCount(): Int {
        return records.size
    }
    class ViewHolder(val binding : ItemSearchBinding): RecyclerView.ViewHolder(binding.root)

}
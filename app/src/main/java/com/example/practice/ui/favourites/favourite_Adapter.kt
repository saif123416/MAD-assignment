package com.example.practice.ui.favourites
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.databinding.ItemLikedRecordsBinding
import com.example.practice.databinding.ItemUnlikeRecordsBinding
import com.example.practice.datamodel.FavouritesRecord

class favourite_Adapter(private val fav_records : List<FavouritesRecord>) : RecyclerView.Adapter<favourite_Adapter.LikeViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LikeViewHolder {
        return LikeViewHolder(
            ItemLikedRecordsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

        )
    }

    override fun onBindViewHolder(holder: LikeViewHolder, position: Int) {
        val fav_records = fav_records.get(position)
        holder.binding.tvFavName.text = fav_records.name
    }

    override fun getItemCount(): Int {
        return fav_records.size
    }
    class LikeViewHolder(val binding :ItemLikedRecordsBinding):RecyclerView.ViewHolder(binding.root)
    class UnlikeViewHolder(val binding :ItemUnlikeRecordsBinding):RecyclerView.ViewHolder(binding.root)
}
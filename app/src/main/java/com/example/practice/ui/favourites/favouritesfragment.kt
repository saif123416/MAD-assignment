package com.example.practice.ui.favourites
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice.databinding.FragmentFavouritesBinding
class favouritesfragment : Fragment() {
    private var _binding : FragmentFavouritesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val favouritesViewModel = ViewModelProvider(this).get(favouritesViewModel::class.java)
        _binding = FragmentFavouritesBinding.inflate(inflater, container, false)

        val root: View = binding.root
        binding.rvFavRecords.layoutManager = LinearLayoutManager(context)
        favouritesViewModel.getAllFavRecords().observe(viewLifecycleOwner){
            binding.rvFavRecords.adapter=favourite_Adapter(it)

        }
        return root
    }
}
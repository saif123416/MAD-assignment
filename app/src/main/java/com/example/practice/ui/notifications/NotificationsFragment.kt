package com.example.practice.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice.databinding.FragmentNotificationsBinding
import com.example.practice.ui.settings.SettingsAdapter
import com.example.practice.ui.notifications.NotificationsViewModel

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val NotificationsViewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)
        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.rvFavRecords.layoutManager = LinearLayoutManager(context)
       NotificationsViewModel.getAllRecords().observe(viewLifecycleOwner){
            binding.rvFavRecords.adapter= SettingsAdapter(it)
        }
        return root
    }
}
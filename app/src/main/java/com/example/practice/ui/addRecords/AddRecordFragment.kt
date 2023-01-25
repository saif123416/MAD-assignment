package com.example.practice.ui.addRecords
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

import com.example.practice.databinding.FragmentAddformBinding

class AddRecordFragment : Fragment() {
    private var _binding : FragmentAddformBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val AddRecordViewModel = ViewModelProvider(this).get(AddRecordViewModel::class.java)
        _binding = FragmentAddformBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

}
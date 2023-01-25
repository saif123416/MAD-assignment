package com.example.practice.ui.dashboard
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practice.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel = ViewModelProvider(this).get(DashboardViewModel::class.java)
            _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.rvFavRecords.layoutManager = LinearLayoutManager(context)
        dashboardViewModel.getAllRecords().observe(viewLifecycleOwner){
            binding.rvFavRecords.adapter=RecordsAdapter(it)
        }
        return root
    }

}
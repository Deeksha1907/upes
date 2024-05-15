package com.example.upes.presentation.screens.user.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.upes.R
import com.example.upes.api.ApiResponse
import com.example.upes.api.CyberStrikeApi
import com.example.upes.databinding.FragmentHomeBinding
import com.example.upes.repository.HomeRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject



class Home : Fragment() {

    lateinit var binding:FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        binding.phishing.setOnClickListener{
            startActivity(Intent(context, Catagory::class.java))
        }
//
//            lifecycleScope.launch {
//                homeRepository.blog().collect{
//                    when(it){
//                        is ApiResponse.Loading -> {
//
//                        }
//                        is ApiResponse.Success -> {
//                            Timber.d(it.data.toString())
//                        }
//                        is ApiResponse.Error -> {
//                            Toast.makeText(context, "error occured", Toast.LENGTH_SHORT).show()
//                        }
//                    }
//                }
//            }





        return binding.root




    }

}
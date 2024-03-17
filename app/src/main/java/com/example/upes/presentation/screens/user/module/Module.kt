package com.example.upes.presentation.screens.user.module

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.upes.R
import com.example.upes.adapter.ModuleRecyclerViewAdapter
import com.example.upes.databinding.FragmentModuleBinding
import com.example.upes.model.ModuleDataClass

class Module : Fragment() {

    private lateinit var binding:FragmentModuleBinding
    private lateinit var dataarrayList:ArrayList<ModuleDataClass>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding= FragmentModuleBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment

        binding.moduleLevels.layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        dataarrayList=ArrayList<ModuleDataClass>()
        dataarrayList.add(ModuleDataClass("1","Introduction"))
        dataarrayList.add(ModuleDataClass("2","Basics"))
        dataarrayList.add(ModuleDataClass("3","Advanced"))
        dataarrayList.add(ModuleDataClass("4","Expert"))
        dataarrayList.add(ModuleDataClass("5","Master"))

        binding.moduleLevels.adapter= ModuleRecyclerViewAdapter(dataarrayList,requireContext())


        return binding.root
    }


}
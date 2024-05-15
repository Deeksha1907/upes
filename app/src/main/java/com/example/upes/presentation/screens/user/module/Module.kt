package com.example.upes.presentation.screens.user.module

import PreferencesKeys
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sharesphere.data.repository.datastore.DataStoreRepositoryImplementation
import com.example.upes.adapter.ModuleRecyclerViewAdapter
import com.example.upes.databinding.FragmentModuleBinding
import com.example.upes.model.ModuleDataClass
import com.example.upes.presentation.screens.authentication.Pmod1_lvl1
import com.example.upes.presentation.screens.authentication.Pmod3_lvl3_1
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Module : Fragment() {


    private lateinit var binding: FragmentModuleBinding
    private lateinit var dataarrayList: ArrayList<ModuleDataClass>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentModuleBinding.inflate(layoutInflater)

        binding.level1.setOnClickListener{
            val intent=Intent(this.context,Pmod1_lvl1::class.java)
            startActivity(intent)
        }








        // Inflate the layout for this fragment

//       ?aarrayList.add(ModuleDataClass("3", "Advanced"))

//        val dataStoreRepositoryInterface = DataStoreRepositoryImplementation(requireContext())
//        var level=1
//        var module=1
//        lifecycleScope.launch {
//            level = dataStoreRepositoryInterface.getLong(PreferencesKeys.Level).first()?.toInt() ?: 1
//            module = dataStoreRepositoryInterface.getLong(PreferencesKeys.Module).first()?.toInt() ?: 1
//        }
        val sharedPreferences = context?.getSharedPreferences("data", Context.MODE_PRIVATE)

// Read data from SharedPreferences
//        val level = 4
//        val module = 2

//        binding.moduleLevels.adapter = ModuleRecyclerViewAdapter(
//            dataarrayList,
//            requireContext(),
////            level?:4,
////            module?:1
//
//        )


// Write data to SharedPreferences
//        val editor = sharedPreferences.edit()
//        editor.putInt("intKey", intValue)
//        editor.putString("stringKey", stringValue)
//        editor.apply()
//        runBlocking {
//            level=dataStoreRepositoryInterface.getLong(PreferencesKeys.Level).first()?.toInt() ?: 1
//            module=dataStoreRepositoryInterface.getLong(PreferencesKeys.Module).first()?.toInt() ?: 1
//        }



        return binding.root
    }


}
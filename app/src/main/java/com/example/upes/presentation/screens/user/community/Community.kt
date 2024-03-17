package com.example.upes.presentation.screens.user.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.upes.adapter.CommunityViewPagerAdapter
import com.example.upes.databinding.FragmentCommunityBinding
import com.google.android.material.tabs.TabLayoutMediator


class Community : Fragment() {

    private lateinit var binding: FragmentCommunityBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommunityBinding.inflate(layoutInflater)

        binding.communityViewPager.adapter =
            CommunityViewPagerAdapter(requireActivity()!!.supportFragmentManager, lifecycle)
        TabLayoutMediator(binding.communityTabLayout, binding.communityViewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Feed"
                }

                1 -> {
                    tab.text = "Questions"
                }

                2 -> {
                    tab.text = "My Questions"
                }
            }

        }.attach()
        return binding.root
    }
}


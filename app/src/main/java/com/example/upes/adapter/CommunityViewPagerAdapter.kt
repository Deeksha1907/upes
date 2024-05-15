package com.example.upes.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.upes.presentation.screens.user.community.FeedFragment
import com.example.upes.presentation.screens.user.community.MyQuestionFragment


class CommunityViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                FeedFragment()
            }
            1 -> {
//                QuestionsFragment()
                MyQuestionFragment()
            }
            2 -> {
                MyQuestionFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}
package com.example.customviewgroups.storyviewexampleactivity.storyview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class StoryViewFragmentAdapter(
    activity: FragmentActivity,
    private val fragmentList: List<Fragment>
) : FragmentStateAdapter(activity) {

    override fun getItemCount() = fragmentList.size

    override fun createFragment(position: Int) = fragmentList[position]
}
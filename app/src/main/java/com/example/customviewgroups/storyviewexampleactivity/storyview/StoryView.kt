package com.example.customviewgroups.storyviewexampleactivity.storyview

import android.annotation.SuppressLint
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.customviewgroups.R
import kotlinx.android.synthetic.main.story_view.view.*
import java.util.Timer

@SuppressLint("ViewConstructor")
class StoryView(
    private val activity: FragmentActivity,
    private val fragmentList: List<Fragment>,
    private val delay: Long = 3000L
) : FrameLayout(activity){

    private val adapter by lazy {
        StoryViewFragmentAdapter(
            activity = activity,
            fragmentList = fragmentList
        )
    }
    private val timer by lazy { Timer() }
    private val remindTask by lazy {
        StoryChangeTask(
            activity = activity,
            viewPager = view_pager,
            fragmentList = fragmentList
        )
    }

    init {
        View.inflate(activity, R.layout.story_view, this)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        setUpStories()
    }

    private fun setUpStories() {
        view_pager.adapter = adapter
        timer.scheduleAtFixedRate(
            remindTask,
            delay,
            delay
        )
    }
}
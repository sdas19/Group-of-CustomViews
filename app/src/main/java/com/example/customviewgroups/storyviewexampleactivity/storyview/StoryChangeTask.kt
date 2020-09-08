package com.example.customviewgroups.storyviewexampleactivity.storyview

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import java.util.TimerTask

class StoryChangeTask(
    private val viewPager: ViewPager2,
    private val activity: FragmentActivity,
    private val fragmentList: List<Fragment>
) : TimerTask() {

    override fun run() {
        with(activity) {

            /* As the TimerTask run on a separate thread from UI thread we have
            to call runOnUiThread to do work on UI thread. */

            runOnUiThread {
                val current = viewPager.currentItem
                if (current == fragmentList.size-1) {
                    this@StoryChangeTask.cancel()
                    finish()
                } else {
                    viewPager.setCurrentItem(current+1, false)
                }
            }
        }
    }
}
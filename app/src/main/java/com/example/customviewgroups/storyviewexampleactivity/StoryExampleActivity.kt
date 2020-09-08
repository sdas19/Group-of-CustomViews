package com.example.customviewgroups.storyviewexampleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.customviewgroups.R
import com.example.customviewgroups.storyviewexampleactivity.storyview.StoryView
import kotlinx.android.synthetic.main.activity_story_example.*

class StoryExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_example)
        setupStories()
    }

    private fun setupStories() {
        val fragmentList = mutableListOf<Fragment>().apply {
            add(FragmentA())
            add(FragmentB())
            add(FragmentC())
            add(FragmentD())
        }
        val storyView = StoryView(activity = this, fragmentList = fragmentList)
        container_view.addView(storyView)
    }
}

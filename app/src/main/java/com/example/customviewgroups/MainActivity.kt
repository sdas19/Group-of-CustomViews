package com.example.customviewgroups

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customviewgroups.storyviewexampleactivity.StoryExampleActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClicks()
    }

    private fun setOnClicks() {
        instagram_story_view.setOnClickListener {
            startActivity(Intent(
                this@MainActivity,
                StoryExampleActivity::class.java
            ))
        }
    }
}

package com.example.fragmentnavegational

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // for connect fragment
        // should be write commit for run this code
        supportFragmentManager.beginTransaction().add(
            R.id.fragment_frame_layout,LoginFragment()
        ).commit()

    }
}
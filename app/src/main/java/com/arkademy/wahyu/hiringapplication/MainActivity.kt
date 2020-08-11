package com.arkademy.wahyu.hiringapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // menutup action bar
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this, OnboardActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
}
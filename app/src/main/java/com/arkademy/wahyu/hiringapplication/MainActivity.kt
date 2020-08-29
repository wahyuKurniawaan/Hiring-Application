package com.arkademy.wahyu.hiringapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.arkademy.wahyu.hiringapplication.activity.OnboardActivity
import com.arkademy.wahyu.hiringapplication.kotlin.BaseActivity

class MainActivity : BaseActivity() {

    // Global variable

    override fun findView() {

    }

    override fun initView() {

    }

    override fun initListener() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hideActionBar()


        Handler(Looper.myLooper()!!).postDelayed({
            val intent = Intent(this, OnboardActivity::class.java)
            startActivity(intent)
        }, 2000)
    }
}
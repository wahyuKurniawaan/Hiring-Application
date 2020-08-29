package com.arkademy.wahyu.hiringapplication.activity

import android.os.Bundle
import android.widget.TextView
import com.arkademy.wahyu.hiringapplication.R
import com.arkademy.wahyu.hiringapplication.kotlin.BaseActivity

class ProfileActivity : BaseActivity() {

    private lateinit var tvName: TextView
    private lateinit var tvGender: TextView
    private lateinit var tvAddress: TextView
    private lateinit var tvPhoneNumber: TextView
    private lateinit var tvBirthday: TextView
    private lateinit var tvLastEducation: TextView

    override fun findView() {
        tvName = findViewById(R.id.tv_name_value)
        tvGender = findViewById(R.id.tv_gender_value)
        tvAddress = findViewById(R.id.tv_address_value)
        tvPhoneNumber = findViewById(R.id.tv_phone_number_value)
        tvBirthday = findViewById(R.id.tv_birthday_value)
        tvLastEducation = findViewById(R.id.tv_last_education_value)
    }

    override fun initView() {
        val firstName = intent.getStringExtra("FIRST_NAME")
        val lastName = intent.getStringExtra("LAST_NAME")
        val name = "$firstName $lastName"
        tvName.text = name
        tvGender.text = intent.getStringExtra("GENDER")
        tvAddress.text = intent.getStringExtra("ADDRESS")
        tvPhoneNumber.text = intent.getStringExtra("PHONE_NUMBER")
        tvBirthday.text = intent.getStringExtra("BIRTHDAY")
        tvLastEducation.text = intent.getStringExtra("LAST_EDUCATION")
    }

    override fun initListener() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        hideActionBar()
        findView()
        initView()
        initListener()

    }
}
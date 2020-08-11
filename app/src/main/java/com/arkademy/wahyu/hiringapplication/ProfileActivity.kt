package com.arkademy.wahyu.hiringapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // menutup action bar
        supportActionBar?.hide()

        val tvName = findViewById<TextView>(R.id.tv_name_value)
        val tvGender = findViewById<TextView>(R.id.tv_gender_value)
        val tvAddress = findViewById<TextView>(R.id.tv_address_value)
        val tvPhoneNumber = findViewById<TextView>(R.id.tv_phone_number_value)
        val tvBirthday = findViewById<TextView>(R.id.tv_birthday_value)
        val tvLastEducation = findViewById<TextView>(R.id.tv_last_education_value)

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
}
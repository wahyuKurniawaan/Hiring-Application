package com.arkademy.wahyu.hiringapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FormInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_input)

        // menutup action bar
        supportActionBar?.hide()

        val etFirstName = findViewById<EditText>(R.id.et_first_name)
        val etLastName = findViewById<EditText>(R.id.et_last_name)
        val etGender = findViewById<EditText>(R.id.et_gender)
        val etPhoneNumber = findViewById<EditText>(R.id.et_number_phone)
        val etBirthday = findViewById<EditText>(R.id.et_birthday)
        val etAddress = findViewById<EditText>(R.id.et_birthday)
        val etEducation = findViewById<EditText>(R.id.et_education)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)

        btnSubmit.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("FIRST_NAME", etFirstName.toString())
            intent.putExtra("LAST_NAME", etLastName.toString())
            intent.putExtra("GENDER", etGender.toString())
            intent.putExtra("PHONE_NUMBER", etPhoneNumber.toString())
            intent.putExtra("BIRTHDAY", etBirthday.toString())
            intent.putExtra("ADDRESS", etAddress.toString())
            intent.putExtra("LAST_EDUCATION", etEducation.toString())
            startActivity(intent)
        }
    }
}
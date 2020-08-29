package com.arkademy.wahyu.hiringapplication.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.arkademy.wahyu.hiringapplication.R
import com.arkademy.wahyu.hiringapplication.kotlin.BaseActivity

class FormInputActivity : BaseActivity() {

    private lateinit var etFirstName: EditText
    private lateinit var etLastName: EditText
    private lateinit var etGender: EditText
    private lateinit var etPhoneNumber: EditText
    private lateinit var etBirthday: EditText
    private lateinit var etAddress: EditText
    private lateinit var etEducation: EditText
    private lateinit var btnSubmit: Button


    override fun findView() {
        etFirstName = findViewById(R.id.et_first_name)
        etLastName = findViewById(R.id.et_last_name)
        etGender = findViewById(R.id.et_gender)
        etPhoneNumber = findViewById(R.id.et_number_phone)
        etBirthday = findViewById(R.id.et_birthday)
        etAddress = findViewById(R.id.et_address)
        etEducation = findViewById(R.id.et_education)
        btnSubmit = findViewById(R.id.btn_submit)
    }

    override fun initView() {

    }

    override fun initListener() {
        btnSubmit.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("FIRST_NAME", "${etFirstName.text}")
            intent.putExtra("LAST_NAME", "${etLastName.text}")
            intent.putExtra("GENDER", "${etGender.text}")
            intent.putExtra("PHONE_NUMBER", "${etPhoneNumber.text}")
            intent.putExtra("BIRTHDAY", "${etBirthday.text}")
            intent.putExtra("ADDRESS", "${etAddress.text}")
            intent.putExtra("LAST_EDUCATION", "${etEducation.text}")
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_input)

        hideActionBar()
        findView()
        initView()
        initListener()

    }
}
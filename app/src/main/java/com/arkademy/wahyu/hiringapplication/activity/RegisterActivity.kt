package com.arkademy.wahyu.hiringapplication.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.arkademy.wahyu.hiringapplication.R
import com.arkademy.wahyu.hiringapplication.kotlin.BaseActivity

class RegisterActivity : BaseActivity() {

    private lateinit var editTextUsername: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonSignUp: Button
    private lateinit var textViewSignIn: TextView

    override fun findView() {
        editTextUsername = findViewById(R.id.et_user_id)
        editTextEmail = findViewById(R.id.et_email)
        editTextPassword = findViewById(R.id.et_password)
        buttonSignUp = findViewById(R.id.btn_sign_up)
        textViewSignIn = findViewById(R.id.tv_sign_in)
    }

    override fun initView() {

    }

    override fun initListener() {
        buttonSignUp.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("USER_NAME", "${editTextUsername.text}")
            intent.putExtra("PASSWORD", "${editTextPassword.text}")
            startActivity(intent)
        }

        textViewSignIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        hideActionBar()
        findView()
        initView()
        initListener()

    }
}
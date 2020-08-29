package com.arkademy.wahyu.hiringapplication.activity

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.arkademy.wahyu.hiringapplication.R
import com.arkademy.wahyu.hiringapplication.kotlin.BaseActivity

class LoginActivity : BaseActivity() {

    // Global variable
    private lateinit var buttonLogin: Button
    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var textViewSignUp: TextView

    private var username: String? = null
    private var password: String? = null


    override fun findView() {
        buttonLogin = findViewById(R.id.btn_sign_in)
        editTextUsername = findViewById(R.id.et_username)
        editTextPassword = findViewById(R.id.et_password)
        textViewSignUp = findViewById(R.id.tv_sign_up)
    }

    override fun initView() {
        // mendapatkan extra dari Register Activity
        username = intent.getStringExtra("USER_NAME")
        password = intent.getStringExtra("PASSWORD")

        editTextUsername.text = username?.toEditable()
        editTextPassword.text = password?.toEditable()
    }

    override fun initListener() {
        buttonLogin.setOnClickListener {
            val intent = Intent(this, FormInputActivity::class.java)
            startActivity(intent)
        }

        textViewSignUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        hideActionBar()
        findView()
        initView()
        initListener()

    }

    // function untuk merubah String to Editable
    fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)
}
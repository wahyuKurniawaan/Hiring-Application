package com.arkademy.wahyu.hiringapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // menutup action bar
        supportActionBar?.hide()

        val editTextUsername = findViewById<EditText>(R.id.et_user_id)
        val editTextEmail = findViewById<EditText>(R.id.et_email)
        val editTextPassword = findViewById<EditText>(R.id.et_password)
        val buttonSignUp = findViewById<Button>(R.id.btn_sign_up)
        val textViewSignIn = findViewById<TextView>(R.id.tv_sign_in)

        buttonSignUp.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("USER_NAME", editTextUsername.toString())
            intent.putExtra("PASSWORD", editTextPassword.toString())
            startActivity(intent)
        }

        textViewSignIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
package com.arkademy.wahyu.hiringapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        // menutup action bar
        supportActionBar?.hide()

        val buttonSignUp = findViewById<Button>(R.id.btn_sign_up)
        val buttonSignIn = findViewById<Button>(R.id.btn_sign_in)

        buttonSignUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        buttonSignIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
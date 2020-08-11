package com.arkademy.wahyu.hiringapplication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // menutup action bar
        supportActionBar?.hide()

        val buttonLogin = findViewById<Button>(R.id.btn_sign_in)
        val editTextUsername = findViewById<EditText>(R.id.et_username)
        val editTextPassword = findViewById<EditText>(R.id.et_password)
        val textViewSignUp = findViewById<TextView>(R.id.tv_sign_up)

        // mendapatkan extra dari Register Activity
        val username = intent.getStringExtra("USER_NAME")
        val password = intent.getStringExtra("PASSWORD")
        println(username)

        // ini di akhir saya gunakan function toEditable() karena ada error
        // Type mismatch: inferred type is string? but editable! was expected
        // solusi saya dapat dari
        // https://stackoverflow.com/questions/54840729/error29-34-type-mismatch-inferred-type-is-string-but-editable-was-expecte
        editTextUsername.text = username?.toEditable()
        editTextPassword.text = password?.toEditable()

        buttonLogin.setOnClickListener {
            val intent = Intent(this, FormInputActivity::class.java)
            startActivity(intent)
        }

        textViewSignUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    // function untuk merubah String to Editable
    fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)
}
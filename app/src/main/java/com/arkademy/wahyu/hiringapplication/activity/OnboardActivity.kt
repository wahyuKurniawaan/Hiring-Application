package com.arkademy.wahyu.hiringapplication.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.arkademy.wahyu.hiringapplication.R
import com.arkademy.wahyu.hiringapplication.kotlin.BaseActivity

class OnboardActivity : BaseActivity() {

    private lateinit var buttonSignUp: Button
    private lateinit var buttonSignIn: Button

    override fun findView() {
        buttonSignUp = findViewById(R.id.btn_sign_up)
        buttonSignIn = findViewById(R.id.btn_sign_in)
    }

    override fun initView() {

    }

    override fun initListener() {
        buttonSignUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        buttonSignIn.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)

        hideActionBar()
        findView()
        initView()
        initListener()

        // menampilkan life cycle dari activity android
//        Toast.makeText(this, "activity: onCreate()", Toast.LENGTH_LONG).show()
//        Log.d("lifecycle", "onCreate()")
    }
//
//    override fun onStart() {
//        super.onStart()
//
//        Toast.makeText(this, "activity: onStart()", Toast.LENGTH_SHORT).show()
//        Log.d("lifecycle", "onStart()")
//    }
//
//    override fun onResume() {
//        super.onResume()
//
//        Toast.makeText(this, "activity: onResume()", Toast.LENGTH_SHORT).show()
//        Log.d("lifecycle", "onResume()")
//    }
//
//    override fun onPause() {
//        super.onPause()
//
//        Toast.makeText(this, "activity: onPause()", Toast.LENGTH_SHORT).show()
//        Log.d("lifecycle", "onPause()")
//    }
//
//    override fun onStop() {
//        super.onStop()
//
//        Toast.makeText(this, "activity: onStop()", Toast.LENGTH_SHORT).show()
//        Log.d("lifecycle", "onStop()")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//
//        Toast.makeText(this, "activity: onRestart()", Toast.LENGTH_SHORT).show()
//        Log.d("lifecycle", "onRestart()")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//
//        Toast.makeText(this, "activity: onDestroy()", Toast.LENGTH_SHORT).show()
//        Log.d("lifecycle", "onDestroy()")
//    }
}


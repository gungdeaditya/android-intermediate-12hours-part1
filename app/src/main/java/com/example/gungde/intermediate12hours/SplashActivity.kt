package com.example.gungde.intermediate12hours

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        btnStart.setOnClickListener {
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
        }
    }
}

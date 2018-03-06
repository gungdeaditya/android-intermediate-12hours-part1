package com.example.gungde.intermediate12hours

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        showToast("onCreate 1")

        btnStart.setOnClickListener {
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        showToast("onStart 1")
    }

    override fun onStop() {
        super.onStop()
        showToast("onStop 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy 1")
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}

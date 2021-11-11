package com.bolt.ecomercebolt.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bolt.ecomercebolt.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun SignUp(view: View) {
        val i = Intent( this, RegisterActivity::class.java)
        startActivity(i)
    }
}
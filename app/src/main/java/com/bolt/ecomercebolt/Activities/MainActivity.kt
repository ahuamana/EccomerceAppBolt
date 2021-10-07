package com.bolt.ecomercebolt.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bolt.ecomercebolt.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun goToSignUp(view: View) {

        val intent = Intent (this, RegisterActivity::class.java)
        startActivity(intent)

    }
    fun goToLogin(view: View) {
        val intent = Intent (this, RegisterActivity::class.java)
        startActivity(intent)
    }


}
package com.lucascalderon1.login

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.AppCompatTextView
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {

    private val txtError: AppCompatTextView by lazy {
        findViewById(R.id.txtError)
    }

    private val enterButton: MaterialButton by lazy {
        findViewById(R.id.enterButton)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        enterButton.setOnClickListener {
            val intent = Intent(this, BookListActivity::class.java)
            startActivity(intent)
        }



        }



            }







package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.modle.Member
import com.example.kotlin.modle.User

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user_edit = findViewById<TextView>(R.id.user_edit)
        val pw_edit = findViewById<TextView>(R.id.pw_edit)

    }

}

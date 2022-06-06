package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    val TAG = SecondActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initViews()
    }
    fun initViews(){
        val id_second = findViewById<TextView>(R.id.id_second)

        var user = intent.getSerializableExtra("user")
        Log.d(TAG, user.toString())

        id_second.text = user.toString()
    }
}
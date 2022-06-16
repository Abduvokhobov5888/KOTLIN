package com.example.kotlin

import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.modle.User

class SecondActivity : AppCompatActivity() {
    val TAG = SecondActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initViews()
    }
    fun initViews(){
        val text_id = findViewById<TextView>(R.id.text_id)
        var user = intent.getParcelableExtra<User>("user")
        Log.d(TAG, user.toString())

        text_id.text = user.toString()
    }
}
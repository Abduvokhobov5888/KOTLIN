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
     //   initViews()
    }
//    fun initViews(){
//        var text_1 = findViewById<TextView>(R.id.text_1)
//        var name = intent.getStringExtra("member")
//        Log.d(TAG,name!!)
//        text_1.text = name
//    }
}
package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.kotlin.modle.User

class MainActivity : AppCompatActivity() {
    val TAG = SecondActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        initViewss()
    }
    fun initViews(){
        var button_second = findViewById<Button>(R.id.button_second)
        button_second.setOnClickListener{
            var user = User(age = 25, name = "Abbosbek")
            openSecondActivity(user)
        }
    }
    fun openSecondActivity(user:User){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user",user)

        startActivity(intent)
    }

    fun initViewss(){
        val id_second = findViewById<TextView>(R.id.tv_home)

        var user = intent.getSerializableExtra("user")
        Log.d(TAG, user.toString())

        id_second.text = user.toString()
    }
}
package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kotlin.modle.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
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
}
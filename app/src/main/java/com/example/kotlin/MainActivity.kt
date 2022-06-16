package com.example.kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.modle.User

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.toString()
    lateinit var tv_home:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
     //   var button_open = findViewById<Button>(R.id.button_open)
      //  button_open.setOnClickListener
        {
            var user = User(age = 25, name = "Abbosbek")
            openSecondActivity(user)
        }
    }
    fun openSecondActivity(user:User){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user",user)
       // startActivity(intent)
    }
}
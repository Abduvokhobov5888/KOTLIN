package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.kotlin.modle.Member
import com.example.kotlin.modle.User

class SecondActivity : AppCompatActivity() {
    val TAG = SecondActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initViews()
        backFinish()
    }
    fun backFinish(){
        var b_exit = findViewById<Button>(R.id.b_exit)
        b_exit.setOnClickListener{
            var member = Member(id = 11, xabar = "Raxmat!")
            openMainActivity(member)
        }
    }
    fun openMainActivity(member: Member){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("member",member)

        startActivity(intent)
    }

    fun initViews(){
        val id_second = findViewById<TextView>(R.id.id_second)

        var user = intent.getSerializableExtra("user")
        Log.d(TAG, user.toString())

        id_second.text = user.toString()
    }
}
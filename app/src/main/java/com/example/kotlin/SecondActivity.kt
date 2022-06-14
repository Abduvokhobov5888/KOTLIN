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
    }
    fun initViews(){
        val b_exit = findViewById<Button>(R.id.b_exit)
        b_exit.setOnClickListener{
            var member = Member(id = 1, xabar = "Raxmat!")
            backfinish(member)
        }
        val text_id = findViewById<TextView>(R.id.text_id)

        var user = intent.getSerializableExtra("user")
        Log.d(TAG, user.toString())

        text_id.text = user.toString()
    }
    fun backfinish(member: Member){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("member",member)
        setResult(RESULT_OK,intent)
        finish()
    }
}
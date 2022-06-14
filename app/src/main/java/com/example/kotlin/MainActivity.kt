package com.example.kotlin

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.modle.Member
import com.example.kotlin.modle.User

class MainActivity : AppCompatActivity() {
    val TAG = MainActivity::class.java.toString()
    lateinit var tv_home:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    var detailLauner = registerForActivityResult(
        StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            val data = result.data
            var member = data?.getSerializableExtra("member")
            Log.d(TAG, member.toString())
            tv_home.text = member.toString()
        }
    }

    fun initViews(){
        tv_home = findViewById<TextView>(R.id.tv_home)
        var button_open = findViewById<Button>(R.id.button_open)
        button_open.setOnClickListener{
            var user = User(age = 25, name = "Abbosbek")
            openSecondActivity(user)
        }
    }
    fun openSecondActivity(user:User){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user",user)
        detailLauner.launch(intent)
    }
}
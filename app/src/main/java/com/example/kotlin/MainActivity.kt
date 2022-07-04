package com.example.kotlin

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.modle.Items
import com.example.mykotlin.DataModel
import com.example.mykotlin.PhotoAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        recyclerView.isNestedScrollingEnabled = false
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("One","Raqam",R.drawable.one))
        dataList.add(DataModel("Two","Raqam",R.drawable.two))
        dataList.add(DataModel("Three","Raqam",R.drawable.three))
        dataList.add(DataModel("Four","Raqam",R.drawable.four))
        dataList.add(DataModel("Five","Raqam",R.drawable.five))
        dataList.add(DataModel("Six","Raqam",R.drawable.six))
        dataList.add(DataModel("Seven","Raqam",R.drawable.seven))
        dataList.add(DataModel("Eigth","Raqam",R.drawable.eight))
        dataList.add(DataModel("Nine","Raqam",R.drawable.nine))
        dataList.add(DataModel("Ten","Raqam",R.drawable.ten))
        photoAdapter.setDataList(dataList)
    }

}

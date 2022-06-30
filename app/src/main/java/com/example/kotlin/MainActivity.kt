package com.example.kotlin

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.modle.Items

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var gridView: GridView ? = null
    private var arrayList: ArrayList<Items> ? = null
    private var gridAdapter:GridAdapter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.grid_view)
        arrayList = ArrayList()
        arrayList = setDataList()
        gridAdapter = GridAdapter(applicationContext, arrayList!!)
        gridView?.adapter = gridAdapter
        gridView?.onItemClickListener = this
    }
    private fun setDataList(): ArrayList<Items>{
        var arrayList: ArrayList<Items> = ArrayList()

        arrayList.add(Items(R.drawable.one, "One"))
        arrayList.add(Items(R.drawable.two, "Two"))
        arrayList.add(Items(R.drawable.three, "Three"))
        arrayList.add(Items(R.drawable.four, "Four"))
        arrayList.add(Items(R.drawable.five, "Five"))
        arrayList.add(Items(R.drawable.six, "Six"))
        arrayList.add(Items(R.drawable.seven, "Seven"))
        arrayList.add(Items(R.drawable.eight, "Eight"))
        arrayList.add(Items(R.drawable.nine, "Nine"))
        arrayList.add(Items(R.drawable.ten, "Ten"))

        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        var items:Items = arrayList!!.get(position)
        Toast.makeText(applicationContext, items.name, Toast.LENGTH_LONG).show()
    }

}

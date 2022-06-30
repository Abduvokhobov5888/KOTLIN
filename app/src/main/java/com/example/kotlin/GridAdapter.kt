package com.example.kotlin

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.kotlin.modle.Items
import com.google.api.Context

class GridAdapter(val context: android.content.Context, var arrayList: ArrayList<Items>) : BaseAdapter() {

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View = View.inflate(context, R.layout.row_item, null)

        var icon: ImageView = view.findViewById(R.id.image_view)
        var name: TextView = view.findViewById(R.id.text_view)

        var items: Items = arrayList.get(position)

        icon.setImageResource(items.icons!!)
        name.text = items.name

        return view
    }


}
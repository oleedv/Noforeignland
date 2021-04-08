package com.example.kotlinexam.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinexam.R
import com.example.kotlinexam.activity.DetailActivity
import com.example.kotlinexam.activity.MainActivity
import com.example.kotlinexam.model.PropertiesModel
import kotlinx.android.synthetic.main.row.view.*


class MainAdapter(
    mainActivity: MainActivity,
    propertiesList: ArrayList<PropertiesModel>
) : RecyclerView.Adapter<CustomViewHolder>() {

    val context = mainActivity
    val feed = propertiesList

    //number of items in list
    override fun getItemCount(): Int {
        return feed.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val cell = feed.get(position)
        holder.View.placeName?.text = cell!!.getName()

        holder.View.placeName.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("Properties", feed.get(position))
            context.startActivity(intent)
        }
    }
}

class CustomViewHolder(val View: View) : RecyclerView.ViewHolder(View) {

}
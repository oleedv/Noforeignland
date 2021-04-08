package com.example.kotlinexam.activity

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinexam.R
import com.example.kotlinexam.adapter.MainAdapter
import com.example.kotlinexam.db.AppDatabase
import com.example.kotlinexam.model.PropertiesModel
import com.example.kotlinexam.model.ResponseModel
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var propertiesList: ArrayList<PropertiesModel>
    var db: AppDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = AppDatabase.getDatabase(this)
        propertiesList = ArrayList<PropertiesModel>()

        recyclerView_main.layoutManager = LinearLayoutManager(this)

        if (verifyAvailableNetwork())
            fetchJson()
        else
            loadFromDatabase()
    }

    private fun loadFromDatabase() {
        if (propertiesList.size > 0)
            propertiesList.clear()
        propertiesList.addAll(db!!.propertiesDao().getAll())
        recyclerView_main.adapter =
            MainAdapter(this@MainActivity, propertiesList)
    }


    fun verifyAvailableNetwork(): Boolean {
        val connectivityManager =
            this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }


    fun fetchJson() {


        prograssBar.visibility = View.VISIBLE
        println("Attempting to fetch Json from API")
        val url = "https://www.noforeignland.com/home/api/v1/places"

        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                println("Printing out JSON: $body")

                if (propertiesList.size > 0)
                    propertiesList.clear()

                // Gson operation
                val gson = GsonBuilder().create()
                val feed = gson.fromJson(body, ResponseModel::class.java) as ResponseModel
                val list = feed.getFeatures()
                for (i in 1..list!!.size - 1) {
                    val featureModel = list.get(i)!!
                    val propertiesModel = featureModel.getProperties() as PropertiesModel
                    propertiesList.add(propertiesModel)
                    featureModel.setId(i)
                    db!!.propertiesDao().insertAll(propertiesModel)
                }
                runOnUiThread {
                    prograssBar.visibility = View.GONE
                    recyclerView_main.adapter =
                        MainAdapter(this@MainActivity, propertiesList)
                }

            }

            override fun onFailure(call: Call, e: IOException) {
                runOnUiThread { prograssBar.visibility = View.GONE }
                println("Failed to execute request from API")
            }
        })
    }

}


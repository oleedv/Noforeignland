package com.example.kotlinexam.activity

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.kotlinexam.R
import com.example.kotlinexam.model.DetailResponseModel
import com.example.kotlinexam.model.PropertiesModel
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_detail.*
import okhttp3.*
import java.io.IOException

class DetailActivity : AppCompatActivity() {

    private lateinit var data: DetailResponseModel
    private lateinit var properties: PropertiesModel
    var id = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        properties = intent.getSerializableExtra("Properties") as PropertiesModel

        if (properties != null) {
            id = properties.getId()!!
            tvPlaceName.text = properties.getName()
        }

        if (verifyAvailableNetwork())
            fetchJson()

    }

    fun fetchJson() {
        prograssBar.visibility = View.VISIBLE
        println("Attempting to fetch Json from API")
        val url = "https://www.noforeignland.com/home/api/v1/place?id=" + id
        val request = Request.Builder().url(url).build()
        val client = OkHttpClient()

        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response.body?.string()
                println("Printing out JSON: $body")

                // Gson operation
                val gson = GsonBuilder().create()
                data =
                    gson.fromJson(body, DetailResponseModel::class.java) as DetailResponseModel

                Log.e("@@@", data.getPlace()!!.getBanner() + "")
                runOnUiThread {
                    prograssBar.visibility = View.GONE
                    tvPlaceName.text = data.getPlace()!!.getName()
                    Glide.with(this@DetailActivity)
                        .load(data.getPlace()!!.getBanner())
                        .placeholder(R.drawable.holder)
                        .into(ivBanner)
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        tvComment.setText(
                            Html.fromHtml(
                                data.getPlace()!!.getComments(),
                                Html.FROM_HTML_MODE_COMPACT
                            )
                        );
                    } else {
                        tvComment.setText(Html.fromHtml(data.getPlace()!!.getComments()));
                    }

                }

            }

            override fun onFailure(call: Call, e: IOException) {
                runOnUiThread {
                    prograssBar.visibility = View.GONE
                }
                println("Failed to execute request from API")
            }
        })
    }

    fun verifyAvailableNetwork(): Boolean {
        val connectivityManager =
            this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }


    fun openMapActivity(view: View) {
        if (verifyAvailableNetwork()) {
            val intent = Intent(this@DetailActivity, LocationWiseActivity::class.java)
            intent.putExtra("Place", data.getPlace())
            startActivity(intent)
        } else {
            Toast.makeText(this@DetailActivity,"Please Check Internet Connection",Toast.LENGTH_SHORT).show()
        }
    }
}
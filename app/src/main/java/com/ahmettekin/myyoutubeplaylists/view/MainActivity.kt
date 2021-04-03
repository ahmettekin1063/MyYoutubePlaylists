package com.ahmettekin.myyoutubeplaylists.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmettekin.myyoutubeplaylists.R
import com.ahmettekin.myyoutubeplaylists.adapter.PlaylistAdapter
import com.ahmettekin.myyoutubeplaylists.model.PlaylistData
import com.ahmettekin.myyoutubeplaylists.service.ApiClient
import com.ahmettekin.myyoutubeplaylists.service.ApiInterface
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    val API_KEY = "AIzaSyCW3qEDO2egGMG1ff6eVS2sTwG-X6TpU5Q"
    val CHANNEL_ID = "UC1wRZwOGxBpJNQsC_1w7AbA"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val apiInterface = ApiClient.client?.create(ApiInterface::class.java)
        val apiCall = apiInterface?.tumListeleriGetir(CHANNEL_ID, API_KEY, 50)

        apiCall?.enqueue(object : Callback<PlaylistData> {

            override fun onResponse(call: Call<PlaylistData>?, response: Response<PlaylistData>?) {

                rvPlaylist.layoutManager = LinearLayoutManager(this@MainActivity)
                rvPlaylist.adapter = PlaylistAdapter(response?.body()?.items)
            }

            override fun onFailure(call: Call<PlaylistData>?, t: Throwable?) {
                Log.e("HATA", "" + t?.printStackTrace())
            }

        })
    }
}
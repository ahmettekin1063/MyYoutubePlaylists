package com.ahmettekin.myyoutubeplaylists.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ahmettekin.myyoutubeplaylists.R
import com.ahmettekin.myyoutubeplaylists.adapter.PlaylistAdapter
import com.ahmettekin.myyoutubeplaylists.adapter.PlaylistItemAdapter
import com.ahmettekin.myyoutubeplaylists.model.PlaylistData
import com.ahmettekin.myyoutubeplaylists.model.PlaylistItems
import com.ahmettekin.myyoutubeplaylists.service.PlaylistApiClient
import com.ahmettekin.myyoutubeplaylists.service.PlaylistApiInterface
import com.ahmettekin.myyoutubeplaylists.service.PlaylistItemApiInterface
import com.ahmettekin.myyoutubeplaylists.service.VideosApiClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_videos.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VideosActivity : AppCompatActivity() {
    val API_KEY = "AIzaSyCW3qEDO2egGMG1ff6eVS2sTwG-X6TpU5Q"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)
        val listId = intent.getStringExtra("playlistItem")
        val apiInterface = VideosApiClient.client?.create(PlaylistItemApiInterface::class.java)
        val apiCall = apiInterface?.tumVideolariGetir(listId!!, API_KEY, 50)

        apiCall?.enqueue(object : Callback<PlaylistItems> {
            override fun onResponse(call: Call<PlaylistItems>, response: Response<PlaylistItems>) {
                rvVideos.layoutManager = LinearLayoutManager(this@VideosActivity)
                rvVideos.adapter = PlaylistItemAdapter(response.body()?.items)
            }

            override fun onFailure(call: Call<PlaylistItems>, t: Throwable) {
                println("hata: ${t.localizedMessage}")
            }
        })
    }
}
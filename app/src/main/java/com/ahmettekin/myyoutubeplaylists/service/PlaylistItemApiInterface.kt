package com.ahmettekin.myyoutubeplaylists.service

import com.ahmettekin.myyoutubeplaylists.model.PlaylistData
import com.ahmettekin.myyoutubeplaylists.model.PlaylistItems
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaylistItemApiInterface {
    @GET("playlistItems?part=snippet")
    fun  tumVideolariGetir(@Query("playlistId") playlistId:String, @Query("key") apiKey:String, @Query("maxResults") limit:Int): Call<PlaylistItems>

}
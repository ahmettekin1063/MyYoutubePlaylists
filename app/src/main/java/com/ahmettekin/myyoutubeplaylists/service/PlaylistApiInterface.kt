package com.ahmettekin.myyoutubeplaylists.service

import com.ahmettekin.myyoutubeplaylists.model.PlaylistData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaylistApiInterface {
    @GET("playlists?part=snippet")
    fun  tumListeleriGetir(@Query("channelId") channelID:String, @Query("key") apiKey:String, @Query("maxResults") limit:Int): Call<PlaylistData>
}
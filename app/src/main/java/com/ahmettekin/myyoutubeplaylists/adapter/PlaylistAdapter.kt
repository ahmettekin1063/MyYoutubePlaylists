package com.ahmettekin.myyoutubeplaylists.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmettekin.myyoutubeplaylists.R
import com.ahmettekin.myyoutubeplaylists.model.PlaylistData
import com.ahmettekin.myyoutubeplaylists.view.VideosActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.playlist_tek_satir.view.*


class PlaylistAdapter(private val myList: List<PlaylistData.Item?>?) : RecyclerView.Adapter<PlaylistAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.playlist_tek_satir, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.tvTitle.text = myList?.get(position)?.snippet?.title
        Picasso.get().load(myList?.get(position)?.snippet?.thumbnails?.default?.url).into(holder.itemView.imageView)
        holder.itemView.setOnClickListener {
            val intent= Intent(it.context,VideosActivity::class.java)
            intent.putExtra("playlistItem",myList?.get(position)?.id)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return myList!!.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
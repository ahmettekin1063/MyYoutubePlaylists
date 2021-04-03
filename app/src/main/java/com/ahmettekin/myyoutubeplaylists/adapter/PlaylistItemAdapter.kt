package com.ahmettekin.myyoutubeplaylists.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmettekin.myyoutubeplaylists.R
import com.ahmettekin.myyoutubeplaylists.model.PlaylistItems
import com.ahmettekin.myyoutubeplaylists.view.PlayVideoActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.videos_tek_satir.view.*

class PlaylistItemAdapter(private val myVideoList: List<PlaylistItems.Item?>?) : RecyclerView.Adapter<PlaylistItemAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.videos_tek_satir, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.tvVideo.text=myVideoList?.get(position)?.snippet?.title
        Picasso.get().load(myVideoList?.get(position)?.snippet?.thumbnails?.default?.url).into(holder.itemView.imgVideo)
        holder.itemView.setOnClickListener {
            val intent=Intent(it.context,PlayVideoActivity::class.java)
            intent.putExtra("videoId",myVideoList?.get(position)?.snippet?.resourceId?.videoId)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return myVideoList!!.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
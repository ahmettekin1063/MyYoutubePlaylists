package com.ahmettekin.myyoutubeplaylists.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmettekin.myyoutubeplaylists.R
import com.ahmettekin.myyoutubeplaylists.model.PlaylistData
import kotlinx.android.synthetic.main.tek_satir.view.*

class PlaylistAdapter(private val myList: List<PlaylistData.Item?>?) :
    RecyclerView.Adapter<PlaylistAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.tek_satir, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.itemView.tvTitle.text= myList?.get(position)?.snippet?.title
    }

    override fun getItemCount(): Int {
        return myList!!.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
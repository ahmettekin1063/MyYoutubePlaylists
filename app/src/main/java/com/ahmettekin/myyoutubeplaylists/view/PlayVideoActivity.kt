package com.ahmettekin.myyoutubeplaylists.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import androidx.appcompat.widget.Toolbar
import com.ahmettekin.myyoutubeplaylists.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerListener
import kotlinx.android.synthetic.main.activity_play_video.*

class PlayVideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_video)
        val videoId= intent.getStringExtra("videoId")
        webView.settings.javaScriptEnabled=true
        webView.settings.pluginState=WebSettings.PluginState.ON
        webView.loadUrl("https://m.youtube.com/watch?v=$videoId")
        webView.webChromeClient= WebChromeClient()
        supportActionBar?.hide()
    }
}
package com.example.testeo

import android.media.session.MediaController
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoView: VideoView = findViewById(R.id.videoSuperior)
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.inicio);
    }
}

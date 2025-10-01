package com.example.testeo

import android.widget.MediaController
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonStart = findViewById<Button>(R.id.boton_start)
        botonStart.setOnClickListener {
            val videoView: VideoView = findViewById(R.id.videoSuperior)
            val packageName = "android.resource://${packageName}/${R.raw.inicio}"
            val uri = Uri.parse(packageName)
            videoView.setVideoURI(uri)

            val mediaController = MediaController(this@MainActivity)
            mediaController.setAnchorView(videoView)
            videoView.setMediaController(mediaController)

            videoView.start()
        }
    }
}


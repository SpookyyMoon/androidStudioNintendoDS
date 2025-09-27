package com.example.testeo

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View?) {
        setContentView(R.layout.helloworld)
    }

    fun buttonBack(view: View?) {
        setContentView(R.layout.activity_main)
    }

    fun buttonExit(view: View) {
        System.exit(0);
    }
}

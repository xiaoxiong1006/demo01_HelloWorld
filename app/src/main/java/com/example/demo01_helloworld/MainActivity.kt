package com.example.demo01_helloworld

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var mPlayer:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var iconPlay:ImageView = findViewById(R.id.icon_play)
        mPlayer = MediaPlayer.create(this,R.raw.hello_world)
        iconPlay.setOnClickListener {
            mPlayer.start()
        }
    }

    override fun onStop() {
        super.onStop()
        mPlayer?.stop()
        mPlayer?.release()
    }
}






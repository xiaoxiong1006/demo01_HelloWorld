package com.example.demo01_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var iconPlay:ImageView = findViewById(R.id.icon_play)
        iconPlay.setOnClickListener {
            Toast.makeText(MainActivity@this,"Hello World!",Toast.LENGTH_SHORT).show()
        }
    }




}





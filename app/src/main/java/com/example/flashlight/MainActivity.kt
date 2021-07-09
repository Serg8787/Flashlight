package com.example.flashlight

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvBlue.setOnClickListener {
            val blueIntent = Intent(this,BlueActivity::class.java)
            startActivity(blueIntent)
        }
        tvGreen.setOnClickListener {
            val greenIntent = Intent(this,GreenActivity::class.java)
            startActivity(greenIntent)
        }
        tvRed.setOnClickListener {
            val redIntent = Intent(this,RedActivity::class.java)
            startActivity(redIntent)
        }
        tvYellow.setOnClickListener {
            val yellowIntent = Intent(this,YellowActivity::class.java)
            startActivity(yellowIntent)
        }
    }
}
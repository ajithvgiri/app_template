package com.ajithvgiri.apptemplate

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
    }
}

package com.argz.issue4693

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startRandomService(view: View) {
        Intent(this, RandomService::class.java).also { intent ->
            startService(intent)
        }
    }

    fun endRandomService(view: View) {
        Intent(this, RandomService::class.java).also { intent ->
            stopService(intent)
        }
    }
}
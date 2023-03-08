package com.argz.issue4693

import android.app.Service
import android.content.Intent
import android.os.IBinder

class RandomService: Service() {
    override fun onBind(p0: Intent?): IBinder? = null
}
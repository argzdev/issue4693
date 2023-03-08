package com.argz.issue4693

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.perf.metrics.AddTrace

class MainApplication: Application() {

    @AddTrace(name = "onCreateTrace")
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}